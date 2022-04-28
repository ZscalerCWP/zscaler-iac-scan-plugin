package io.jenkins.plugins.zscaler.models;

public enum Region {
  US("US", "https://api.zcpcloud.net", "https://auth.us.zcpcloud.net", "http://dev.iacplugin.zscwp.io");

  private final String name;
  private final String apiUrl;
  private final String authUrl;
  private final String reportUrl;

  Region(String name, String apiUrl, String authUrl, String reportUrl) {
    this.name = name;
    this.apiUrl = apiUrl;
    this.authUrl = authUrl;
    this.reportUrl = reportUrl;
  }

  public String getName() {
    return name;
  }

  public String getApiUrl() {
    return apiUrl;
  }

  public String getAuthUrl() {
    return authUrl;
  }

  public String getReportUrl() {
    return reportUrl != null ? reportUrl : US.reportUrl;
  }
}
