package com.vikas.method_parser.version_control_manager.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class RepoDetails extends SourceDetails {
  @Getter @Setter private RepoHistory repoHistory;
  @Getter @Setter private List<String> branchURLs;
  @Getter @Setter private List<String> technologies;
  @Getter @Setter private List<String> contributors;
}
