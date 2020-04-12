package com.vikas.method_parser.version_control_manager.details.fetcher.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Model class for source details.
 *
 */
public class RepoDetails extends SourceDetails {
  @Getter @Setter private List<CommitHistory> repoHistory;
  @Getter @Setter private List<String> branchURLs;
  @Getter @Setter private List<String> technologies;
  @Getter @Setter private List<String> contributors;
}
