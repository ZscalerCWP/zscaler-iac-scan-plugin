package io.jenkins.plugins.zscaler;

import io.jenkins.plugins.zscaler.models.*;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface CWPService {

    @POST("/iac/onboarding/v1/cicd/validate")
    Call<CreateIntegrationResponse> validateIntegration(@Body ValidateIntegrationRequest body);

    @POST("/iac/onboarding/v1/cli/download")
    Call<ResponseBody> downloadScanner(@Body String body);

    @POST("/iac/scans/v1/scan/create")
    Call<ScanResponse> createScan(@Body BuildDetails buildDetails);

    @PUT("/iac/scans/v1/cicd/scans/{scanId}")
    Call<ScanResponse> updateScanStatus(@Path("scanId") String scanId, @Body UpdateScanRequest updateScanRequest);
}
