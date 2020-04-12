package com.vikas.method_parser.version_control_manager.details.fetcher.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Model class for organization details.
 *
 */
public class OrgDetails extends SourceDetails {
  @Getter @Setter private List<SourceDetails> repoDetails;
}
