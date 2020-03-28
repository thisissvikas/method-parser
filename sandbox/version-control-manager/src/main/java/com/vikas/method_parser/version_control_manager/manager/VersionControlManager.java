package com.vikas.method_parser.version_control_manager.manager;

import com.vikas.method_parser.version_control_manager.model.SourceDetails;

public interface VersionControlManager {
    SourceDetails getSourceDetail(String url);
}
