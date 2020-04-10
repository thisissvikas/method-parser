package com.vikas.method_parser.version_control_manager.details.fetcher.util;

import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

public class GITOrgRepoClassifier {
    public static GITSourceType getSourceType(UserInput userInput){
        // Todo: Hardcoded return, needs to be implemented.
        return GITSourceType.ORG;
    }
}
