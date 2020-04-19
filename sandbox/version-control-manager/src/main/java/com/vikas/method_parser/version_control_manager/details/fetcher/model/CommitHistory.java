package com.vikas.method_parser.version_control_manager.details.fetcher.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Model for commit history of a repository.
 *
 */
public class CommitHistory {
  @Getter @Setter private String commitId;
  @Getter @Setter private String user;
  @Getter @Setter private Date dateTime;
}
