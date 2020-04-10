package com.vikas.method_parser.version_control_manager.util;

import com.sun.jersey.api.client.ClientResponse;
import com.vikas.method_parser.version_control_manager.model.UserInput;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.net.URISyntaxException;

public class GITHandler {
  public static final String GIT_API_URL = "https://api.github.com";

  public static JSONObject getGITRepo(UserInput userInput) throws ParseException {
    String url = GIT_API_URL + "/users/" + userInput.getUserName() + "/repos";
    ClientResponse clientResponse = RESTCallHandler.makeGETCall(url);
    return getSpecificRepo(clientResponse, userInput.getRepositoryName());
  }

  public static JSONArray getAllGITReposForOrg(UserInput userInput) throws ParseException {
    String url = GIT_API_URL + "/users/" + userInput.getUserName() + "/repos";
    ClientResponse clientResponse = RESTCallHandler.makeGETCall(url);
    String output = clientResponse.getEntity(String.class);
    JSONArray allRepos =  (JSONArray) new JSONParser().parse(output);
    return allRepos;
  }

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
