package com.vikas.method_parser.version_control_manager.details.fetcher.fetcher;

import com.vikas.method_parser.version_control_manager.details.fetcher.model.OrgDetails;
import com.vikas.method_parser.version_control_manager.details.fetcher.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;
import com.vikas.method_parser.version_control_manager.details.fetcher.util.GITHandler;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.util.ArrayList;
import java.util.List;

/**
 * Used to get organization details.
 *
 */
public class OrgDetailsFetcher implements SourceDetailsFetcher {

  /**
   * Used to get organization details based on user details.
   * @param userInput : Information of a user like username, url, org name and repo name.
   * @return Organization details based on a user.
   */
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
