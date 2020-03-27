package com.vikas.method_parser.version_control_manager.manager;

import com.vikas.method_parser.version_control_manager.details.fetcher.SourceDetailsFetcher;
import com.vikas.method_parser.version_control_manager.details.fetcher.SourceDetailsFetcherFactory;
import com.vikas.method_parser.version_control_manager.model.SourceDetails;

public class GITVersionControlManager implements VersionControlManager{
    public SourceDetails getSourceDetail(String url) {
        SourceDetailsFetcher sourceDetailsFetcher = SourceDetailsFetcherFactory.getSourceDetailsFetcher(url);
        return sourceDetailsFetcher.getSourceDetails(url);
    }
}
