package com.vikas.method_parser.version_control_manager.details.fetcher.util;

import com.sun.jersey.api.client.ClientResponse;
import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class GITHandler {
  public static final String GIT_API_URL = "https://api.github.com";

  /**
   * To get a specific git repo details of a user.
   * @param userInput : Input details of a user.
   * @return : Details of a specific repository.
   * @throws ParseException
   */
  public static JSONObject getGITRepo(UserInput userInput) throws ParseException {
    String url = GIT_API_URL + "/users/" + userInput.getUserName() + "/repos";
    ClientResponse clientResponse = RESTCallHandler.makeGETCall(url);
    return getSpecificRepo(clientResponse, userInput.getRepositoryName());
  }

  /**
   * To get details of all git repositories in an org of a user.
   * @param userInput : Input details f a user.
   * @return : All git repositories in an organization.
   * @throws ParseException
   */
  public static JSONArray getAllGITReposForOrg(UserInput userInput) throws ParseException {
    String url = GIT_API_URL + "/users/" + userInput.getUserName() + "/repos";
    ClientResponse clientResponse = RESTCallHandler.makeGETCall(url);
    String output = clientResponse.getEntity(String.class);
    JSONArray allRepos =  (JSONArray) new JSONParser().parse(output);
    return allRepos;
  }

  /**
   * To get a specific git repo details of a user.
   * @param clientResponse : Output of the REST call made to the url.
   * @param repositoryName : Name of the repository.
   * @return Details of the repository.
   * @throws ParseException
   */
  private static JSONObject getSpecificRepo(ClientResponse clientResponse, String repositoryName) throws ParseException {
    String output = clientResponse.getEntity(String.class);
    JSONArray allRepos =  (JSONArray) new JSONParser().parse(output);
    for(Object repoObject : allRepos){
      JSONObject repo = (JSONObject) repoObject;
      if(repositoryName.equalsIgnoreCase((String) repo.get("name"))){
        return repo;
      }
    }
    return null;
  }
}
