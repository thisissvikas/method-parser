package com.vikas.method_parser.version_control_manager.manager;

import com.vikas.method_parser.version_control_manager.model.SourceDetails;
import com.vikas.method_parser.version_control_manager.model.UserInput;

public interface VersionControlManager {
    SourceDetails getSourceDetail(UserInput userInput);
}
