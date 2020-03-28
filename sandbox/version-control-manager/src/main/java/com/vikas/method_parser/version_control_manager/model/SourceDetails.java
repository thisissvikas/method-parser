package com.vikas.method_parser.version_control_manager.model;

public class SourceDetails {
    // Common fields needs to be added here.
	private String url;
	private String accessToken;
	private int page;
	private int perPage;
	
	public String getUrl() {
		return url;
	}
	
	public String getAccessToken() {
		return accessToken;
	}
	
	public int page() {
		return page;
	}
	
	public int perPage() {
		return perPage;
	}
	
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public void setPerPage(int perPage) {
		this.perPage = perPage;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
}
