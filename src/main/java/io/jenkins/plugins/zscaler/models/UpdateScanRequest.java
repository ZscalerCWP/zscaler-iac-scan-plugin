package io.jenkins.plugins.zscaler.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UpdateScanRequest {
    private int status;
    private int step;
    @JsonProperty("updated_by")
    private String updatedBy;
    @JsonProperty("violation_findings")
    private int violationsCount;
    @JsonProperty("passed_findings")
    private int passedCount;
    @JsonProperty("skipped_findings")
    private int skippedCount;
    @JsonProperty("resources_count")
    private int resourceCount;
    @JsonProperty("error")
    private String error;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public int getViolationsCount() {
        return violationsCount;
    }

    public void setViolationsCount(int violationsCount) {
        this.violationsCount = violationsCount;
    }

    public int getPassedCount() {
        return passedCount;
    }

    public void setPassedCount(int passedCount) {
        this.passedCount = passedCount;
    }

    public int getSkippedCount() {
        return skippedCount;
    }

    public void setSkippedCount(int skippedCount) {
        this.skippedCount = skippedCount;
    }

    public int getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(int resourceCount) {
        this.resourceCount = resourceCount;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
