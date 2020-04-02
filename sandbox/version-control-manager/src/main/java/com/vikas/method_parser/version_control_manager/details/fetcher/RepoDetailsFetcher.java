package com.vikas.method_parser.version_control_manager.details.fetcher;

import com.vikas.method_parser.version_control_manager.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.model.UserInput;
import com.vikas.method_parser.version_control_manager.util.GITHandler;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.net.URISyntaxException;

public class RepoDetailsFetcher implements SourceDetailsFetcher{
    public SourceDetails getSourceDetails(UserInput userInput) {
        SourceDetails repoDetails = new SourceDetails();
        try {
            repoDetails = getSourceDetails(GITHandler.getGITRepo(userInput));
        } catch (URISyntaxException | ParseException e){
            // Todo: Need to implement logging.
            e.printStackTrace();
        }
        return repoDetails;
    }

    private SourceDetails getSourceDetails(JSONObject repoDetails) {
        return null;
    }
}
