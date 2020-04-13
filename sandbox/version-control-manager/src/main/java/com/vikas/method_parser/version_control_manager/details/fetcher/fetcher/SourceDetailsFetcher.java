package com.vikas.method_parser.version_control_manager.details.fetcher.fetcher;

import com.vikas.method_parser.version_control_manager.details.fetcher.manager.VersionControlManager;
import com.vikas.method_parser.version_control_manager.details.fetcher.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

/**
 * A skeleton for getting all repo and org details based on the user's input.
 *
 */
public interface SourceDetailsFetcher {
    SourceDetails getSourceDetails(UserInput userInput);
}
