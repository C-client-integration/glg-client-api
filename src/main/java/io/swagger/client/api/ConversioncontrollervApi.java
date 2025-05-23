/**
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConversioncontrollervApi {
    private ApiClient apiClient;

    public ConversioncontrollervApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConversioncontrollervApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for postConversionUsingPOST1 */
    private com.squareup.okhttp.Call postConversionUsingPOST1Call(Long experimentId, String channel, String messageContent, Long messageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = messageContent;
        
        // verify the required parameter 'experimentId' is set
        if (experimentId == null) {
            throw new ApiException("Missing the required parameter 'experimentId' when calling postConversionUsingPOST1(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/v2.0/conversion/experiment/{experimentId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "experimentId" + "\\}", apiClient.escapeString(experimentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (channel != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel", channel));
        if (messageId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "messageId", messageId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"BearerTokenAuthentication"};
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * postConversion
     * 
     * @param experimentId ExperimentId (required)
     * @param channel channel (optional)
     * @param messageContent messageContent (optional)
     * @param messageId MessageId (optional, default to 10)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postConversionUsingPOST1(Long experimentId, String channel, String messageContent, Long messageId) throws ApiException {
        postConversionUsingPOST1WithHttpInfo(experimentId, channel, messageContent, messageId);
    }

    /**
     * postConversion
     * 
     * @param experimentId ExperimentId (required)
     * @param channel channel (optional)
     * @param messageContent messageContent (optional)
     * @param messageId MessageId (optional, default to 10)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postConversionUsingPOST1WithHttpInfo(Long experimentId, String channel, String messageContent, Long messageId) throws ApiException {
        com.squareup.okhttp.Call call = postConversionUsingPOST1Call(experimentId, channel, messageContent, messageId, null, null);
        return apiClient.execute(call);
    }

    /**
     * postConversion (asynchronously)
     * 
     * @param experimentId ExperimentId (required)
     * @param channel channel (optional)
     * @param messageContent messageContent (optional)
     * @param messageId MessageId (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postConversionUsingPOST1Async(Long experimentId, String channel, String messageContent, Long messageId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postConversionUsingPOST1Call(experimentId, channel, messageContent, messageId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for postReachUsingGET1 */
    private com.squareup.okhttp.Call postReachUsingGET1Call(Long experimentId, String channel, Long messageId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'experimentId' is set
        if (experimentId == null) {
            throw new ApiException("Missing the required parameter 'experimentId' when calling postReachUsingGET1(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/api/v2.0/conversion/experiment_reach/{experimentId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "experimentId" + "\\}", apiClient.escapeString(experimentId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (channel != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "channel", channel));
        if (messageId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "messageId", messageId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"BearerTokenAuthentication"};
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * postReach
     * 
     * @param experimentId ExperimentId (required)
     * @param channel channel (optional)
     * @param messageId MessageId (optional, default to 10)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void postReachUsingGET1(Long experimentId, String channel, Long messageId) throws ApiException {
        postReachUsingGET1WithHttpInfo(experimentId, channel, messageId);
    }

    /**
     * postReach
     * 
     * @param experimentId ExperimentId (required)
     * @param channel channel (optional)
     * @param messageId MessageId (optional, default to 10)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> postReachUsingGET1WithHttpInfo(Long experimentId, String channel, Long messageId) throws ApiException {
        com.squareup.okhttp.Call call = postReachUsingGET1Call(experimentId, channel, messageId, null, null);
        return apiClient.execute(call);
    }

    /**
     * postReach (asynchronously)
     * 
     * @param experimentId ExperimentId (required)
     * @param channel channel (optional)
     * @param messageId MessageId (optional, default to 10)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postReachUsingGET1Async(Long experimentId, String channel, Long messageId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postReachUsingGET1Call(experimentId, channel, messageId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
