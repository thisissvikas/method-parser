package com.vikas.method_parser.version_control_manager.details.fetcher;

import com.vikas.method_parser.version_control_manager.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.model.UserInput;

public interface SourceDetailsFetcher {
    SourceDetails getSourceDetails(UserInput userInput);
}
