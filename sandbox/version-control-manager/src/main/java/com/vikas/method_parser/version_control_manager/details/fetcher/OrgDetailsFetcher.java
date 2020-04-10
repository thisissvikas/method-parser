package com.vikas.method_parser.version_control_manager.details.fetcher;

import com.google.gson.JsonObject;
import com.vikas.method_parser.version_control_manager.model.OrgDetails;
import com.vikas.method_parser.version_control_manager.model.RepoDetails;
import com.vikas.method_parser.version_control_manager.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.model.UserInput;
import com.vikas.method_parser.version_control_manager.util.GITHandler;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

public class OrgDetailsFetcher implements SourceDetailsFetcher {
  public SourceDetails getSourceDetails(UserInput userInput) {
    OrgDetails orgDetails = new OrgDetails();
    List<SourceDetails> repoDetails = new ArrayList<>();
    RepoDetailsFetcher repoDetailsFetcher = new RepoDetailsFetcher();
    JSONArray allRepos = null;
    try {
      allRepos = GITHandler.getAllGITReposForOrg(userInput);
      for (Object repo : allRepos) {
        repoDetails.add(repoDetailsFetcher.getRepoDetails((JSONObject) repo));
      }
    } catch (ParseException e) {
      // Todo: Need to implement logging.
      e.printStackTrace();
    }
    orgDetails.setName(userInput.getOrganization());
    orgDetails.setUrl(userInput.getUrl());
    orgDetails.setRepoDetails(repoDetails);
    return orgDetails;
  }
}
