package com.vikas.method_parser.version_control_manager.details.fetcher;

import com.vikas.method_parser.version_control_manager.model.SourceDetails;

public interface SourceDetailsFetcher {
    SourceDetails getSourceDetails(String url);
}
