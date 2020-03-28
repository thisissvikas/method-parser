package com.vikas.method_parser.version_control_manager.model;

public class RepoDetails extends SourceDetails{
    // Specific fields need to be added here,
	private String repoName;
	
	public String getRepoName() {
		return repoName;
	}
	
	public void setRepoName(String repoName) {
		this.repoName = repoName;
	}
}
