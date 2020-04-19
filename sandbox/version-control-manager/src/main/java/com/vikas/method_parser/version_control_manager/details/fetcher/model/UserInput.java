package com.vikas.method_parser.version_control_manager.details.fetcher.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Model for user input.
 *
 */
public class UserInput {
  @Getter @Setter private String url;
  @Getter @Setter private String userName;
  @Getter @Setter private String organization;
  @Getter @Setter private String repositoryName;
}
