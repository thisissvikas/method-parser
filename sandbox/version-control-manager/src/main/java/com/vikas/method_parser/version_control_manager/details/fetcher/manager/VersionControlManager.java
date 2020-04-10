package com.vikas.method_parser.version_control_manager.details.fetcher.manager;

import com.vikas.method_parser.version_control_manager.details.fetcher.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.details.fetcher.model.UserInput;

public interface VersionControlManager {
    SourceDetails getSourceDetail(UserInput userInput);
}
