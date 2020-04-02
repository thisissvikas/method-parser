package com.vikas.method_parser.version_control_manager.manager;

import com.vikas.method_parser.version_control_manager.details.fetcher.SourceDetailsFetcher;
import com.vikas.method_parser.version_control_manager.details.fetcher.SourceDetailsFetcherFactory;
import com.vikas.method_parser.version_control_manager.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.model.UserInput;

public class GITVersionControlManager implements VersionControlManager{
    public SourceDetails getSourceDetail(UserInput userInput) {
        SourceDetailsFetcher sourceDetailsFetcher = SourceDetailsFetcherFactory.getSourceDetailsFetcher(userInput);
        return sourceDetailsFetcher.getSourceDetails(userInput);
    }
}
