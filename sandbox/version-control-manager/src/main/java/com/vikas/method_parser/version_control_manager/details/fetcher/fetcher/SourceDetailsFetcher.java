package com.vikas.method_parser.version_control_manager.details.fetcher.fetcher;

import com.vikas.method_parser.version_control_manager.details.fetcher.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

public interface SourceDetailsFetcher {
    SourceDetails getSourceDetails(UserInput userInput);
}
