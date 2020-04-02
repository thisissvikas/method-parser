package com.vikas.method_parser.version_control_manager.details.fetcher;

import com.vikas.method_parser.version_control_manager.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.model.UserInput;
import org.json.simple.JSONObject;

public class RepoDetailsFetcher implements SourceDetailsFetcher{
    public SourceDetails getSourceDetails(UserInput userInput) {
        JSONObject repoDetails = new JSONObject();
        return getSourceDetails(repoDetails);
    }

    private SourceDetails getSourceDetails(JSONObject repoDetails) {
        return null;
    }
}
