package com.vikas.method_parser.version_control_manager.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class OrgDetails extends SourceDetails {
  @Getter @Setter private List<SourceDetails> repoDetails;
}
