package com.vikas.method_parser.version_control_manager.details.fetcher;

public class SourceDetailsFetcherFactory {
    public static SourceDetailsFetcher getSourceDetailsFetcher(String url){
        // Todo: Correct instance return logic will need to be implemented.
        return new RepoDetailsFetcher();
    }
}
