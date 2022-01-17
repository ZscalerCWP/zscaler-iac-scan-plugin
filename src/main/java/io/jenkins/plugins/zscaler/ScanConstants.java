package io.jenkins.plugins.zscaler;

public class ScanConstants {
    public static final int BUILD_STARTED  = 1;
    public static final int BUILD_INPROGRESS = 2;
    public static final int BUILD_COMPLETED = 3;
    public static final int BUILD_FAILED = 4;
    public static final int ScanStep_Unknown = 0;
    public static final int ScanStep_WebhookReceived = 1;
    public static final int ScanStep_RepoDownloaded = 2;
    public static final int ScanStep_RepoDownloadFailed = 3;
    public static final int  ScanStep_NoIaCFilesFound = 4;
    public static final int ScanStep_ParsingStarted = 5;
    public static final int ScanStep_ParsingCompleted = 6;
    public static final int ScanStep_ParsingFailed = 7;
    public static final int ScanStep_ResourcesPersisted = 8;
    public static final int ScanStep_ResourcesNotPersisted = 9;
    public static final int ScanStep_PolicyEvaluationRequested = 10;
    public static final int ScanStep_PolicyEvaluationCompleted = 11;
    public static final int ScanStep_PolicyEvaluationFailed = 12;
    public static final int ScanStep_ScanResultPublished = 13;
    public static final int ScanStep_ScanResultPublishFailed = 14;
}
