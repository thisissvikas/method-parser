package com.vikas.method_parser.version_control_manager.details.fetcher.manager;

import com.vikas.method_parser.version_control_manager.details.fetcher.fetcher.SourceDetailsFetcher;
import com.vikas.method_parser.version_control_manager.details.fetcher.fetcher.SourceDetailsFetcherFactory;
import com.vikas.method_parser.version_control_manager.details.fetcher.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

public class GITVersionControlManager implements VersionControlManager{
	
	/**
	 * Used to get the source details for user input.
	 * @param userInput : Input given by the user.
	 * @return source details.
	 */
    public SourceDetails getSourceDetail(UserInput userInput) {
        SourceDetailsFetcher sourceDetailsFetcher = SourceDetailsFetcherFactory.getSourceDetailsFetcher(userInput);
        return sourceDetailsFetcher.getSourceDetails(userInput);
    }
}
