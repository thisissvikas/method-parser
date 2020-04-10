package com.vikas.method_parser.version_control_manager.details.fetcher;

import com.sun.jersey.api.client.ClientResponse;
import com.vikas.method_parser.version_control_manager.model.CommitHistory;
import com.vikas.method_parser.version_control_manager.model.RepoDetails;
import com.vikas.method_parser.version_control_manager.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.model.UserInput;
import com.vikas.method_parser.version_control_manager.util.GITHandler;
import com.vikas.method_parser.version_control_manager.util.RESTCallHandler;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.text.SimpleDateFormat;

public class RepoDetailsFetcher implements SourceDetailsFetcher {
  public SourceDetails getSourceDetails(UserInput userInput) {
    SourceDetails repoDetails = new SourceDetails();
    try {
      repoDetails = getRepoDetails(GITHandler.getGITRepo(userInput));
    } catch (ParseException e) {
      // Todo: Need to implement logging.
      e.printStackTrace();
    }
    return repoDetails;
  }

  public SourceDetails getRepoDetails(JSONObject jsonObject) throws ParseException {
    RepoDetails repoDetails = new RepoDetails();
    String name = (String) jsonObject.get("name");
    String url = (String) jsonObject.get("html_url");
    List<String> branchURLs =
        getAllBranchUrls(
            (String) jsonObject.get("branches_url"), (String) jsonObject.get("html_url"));
    List<String> technologies = getAllTechnologies((String) jsonObject.get("languages_url"));
    List<String> contributors = getAllContributors((String) jsonObject.get("contributors_url"));
    List<CommitHistory> commitHistory = getCommitHistory((String) jsonObject.get("commits_url"));
    repoDetails.setName(name);
    repoDetails.setUrl(url);
    repoDetails.setBranchURLs(branchURLs);
    repoDetails.setTechnologies(technologies);
    repoDetails.setContributors(contributors);
    repoDetails.setRepoHistory(commitHistory);
    return repoDetails;
  }

  public List<CommitHistory> getCommitHistory(String commitUrl) throws ParseException {
    CommitHistory commitHistoryObject = new CommitHistory();
    List<CommitHistory> commitHistory = new ArrayList<>();
    commitUrl = commitUrl.replaceAll("\\{.*\\}", "") + "/master";
    ClientResponse clientResponse = RESTCallHandler.makeGETCall(commitUrl);
    String output = clientResponse.getEntity(String.class);
    HashMap<String, Object> commitObject = (HashMap<String, Object>) new JSONParser().parse(output);
    for (String key : commitObject.keySet()) {
      if (key.equalsIgnoreCase("sha")) {
        commitHistoryObject.setCommitId((String) commitObject.get(key));
      }
    }
    JSONObject parent = (JSONObject) commitObject.get("commit");
    JSONObject child = (JSONObject) parent.get("author");
    String name = (String) child.get("name");
    String dateTime = (String) child.get("date");
    Date date = null;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    try {
      date = formatter.parse(dateTime);
    } catch (java.text.ParseException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    commitHistoryObject.setUser(name);
    commitHistoryObject.setDateTime(date);
    commitHistory.add(commitHistoryObject);
    return commitHistory;
  }

  public List<String> getAllBranchUrls(String branchesUrl, String htmlUrl) throws ParseException {
    List<String> branchUrls = new ArrayList<>();
    branchesUrl = branchesUrl.replaceAll("\\{.*\\}", "");
    ClientResponse clientResponse = RESTCallHandler.makeGETCall(branchesUrl);
    String output = clientResponse.getEntity(String.class);
    JSONArray branchDetails = (JSONArray) new JSONParser().parse(output);
    for (Object branchObject : branchDetails) {
      JSONObject repo = (JSONObject) branchObject;
      branchUrls.add(htmlUrl + "/tree/" + (String) repo.get("name"));
    }
    return branchUrls;
  }

  public List<String> getAllTechnologies(String languageUrl) throws ParseException {
    List<String> technologies = new ArrayList<>();
    ClientResponse clientResponse = RESTCallHandler.makeGETCall(languageUrl);
    String output = clientResponse.getEntity(String.class);
    Object technologyObject = new JSONParser().parse(output);
    technologies.addAll(((HashMap) technologyObject).keySet());
    return technologies;
  }

  public List<String> getAllContributors(String contributorsUrl) throws ParseException {
    List<String> contributors = new ArrayList<>();
    ClientResponse clientResponse = RESTCallHandler.makeGETCall(contributorsUrl);
    String output = clientResponse.getEntity(String.class);
    JSONArray contributorsDetails = (JSONArray) new JSONParser().parse(output);
    for (Object contributorsObject : contributorsDetails) {
      JSONObject repo = (JSONObject) contributorsObject;
      contributors.add((String) repo.get("login"));
    }
    return contributors;
  }
}
