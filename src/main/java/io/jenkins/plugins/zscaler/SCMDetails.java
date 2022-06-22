package io.jenkins.plugins.zscaler;

import hudson.EnvVars;
import io.jenkins.plugins.zscaler.models.BuildDetails;
import io.jenkins.plugins.zscaler.models.SCMConstants;

public class SCMDetails {
  public static void populateSCMDetails(EnvVars env, BuildDetails buildDetails){
    String gitUrl = env.get(SCMConstants.GitUrl);
    if (gitUrl != null) {
      buildDetails.setRepoLoc(gitUrl.substring(0,gitUrl.length()-4));
      buildDetails.addAdditionalDetails(BuildDetails.scmType, gitUrl.contains("gitlab.com") ? SCMConstants.GITLAB : (gitUrl.contains("github.com") ? SCMConstants.GITHUB : "GIT"));
      buildDetails.setBranchName(env.get(SCMConstants.GitBranch));
      buildDetails.setCommitSha(env.get(SCMConstants.GitCommit));
      if (gitUrl.contains("gitlab.com") || gitUrl.contains("github.com")) {
        buildDetails.addRepoDetails(SCMConstants.RepoName, gitUrl.substring(19));
      }
    }
    String svnUrl = env.get(SCMConstants.SvnUrl);
    if(svnUrl!=null){
      buildDetails.setRepoLoc(svnUrl);
      buildDetails.addAdditionalDetails(BuildDetails.scmType, SCMConstants.SVN);
      buildDetails.setCommitSha(env.get(SCMConstants.SvnRevision));
    }
  }
}
