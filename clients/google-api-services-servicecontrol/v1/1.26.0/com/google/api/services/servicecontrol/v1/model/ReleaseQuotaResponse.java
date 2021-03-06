/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.servicecontrol.v1.model;

/**
 * Response message for the ReleaseQuota method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ReleaseQuotaResponse extends com.google.api.client.json.GenericJson {

  /**
   * The same operation_id value used in the ReleaseQuotaRequest. Used for logging and diagnostics
   * purposes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * Quota metrics to indicate the result of release. Depending on the request, one or more of the
   * following metrics will be included:
   *
   * 1. For rate quota, per quota group or per quota metric released amount will be specified using
   * the following delta metric:   "serviceruntime.googleapis.com/api/consumer/quota_refund_count"
   *
   * 2. For allocation quota, per quota metric total usage will be specified using the following
   * gauge metric:   "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
   *
   * 3. For allocation quota, value for each quota limit associated with the metrics will be
   * specified using the following gauge metric:   "serviceruntime.googleapis.com/quota/limit"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<MetricValueSet> quotaMetrics;

  /**
   * Indicates the decision of the release.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<QuotaError> releaseErrors;

  static {
    // hack to force ProGuard to consider QuotaError used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(QuotaError.class);
  }

  /**
   * ID of the actual config used to process the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceConfigId;

  /**
   * The same operation_id value used in the ReleaseQuotaRequest. Used for logging and diagnostics
   * purposes.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationId() {
    return operationId;
  }

  /**
   * The same operation_id value used in the ReleaseQuotaRequest. Used for logging and diagnostics
   * purposes.
   * @param operationId operationId or {@code null} for none
   */
  public ReleaseQuotaResponse setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * Quota metrics to indicate the result of release. Depending on the request, one or more of the
   * following metrics will be included:
   *
   * 1. For rate quota, per quota group or per quota metric released amount will be specified using
   * the following delta metric:   "serviceruntime.googleapis.com/api/consumer/quota_refund_count"
   *
   * 2. For allocation quota, per quota metric total usage will be specified using the following
   * gauge metric:   "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
   *
   * 3. For allocation quota, value for each quota limit associated with the metrics will be
   * specified using the following gauge metric:   "serviceruntime.googleapis.com/quota/limit"
   * @return value or {@code null} for none
   */
  public java.util.List<MetricValueSet> getQuotaMetrics() {
    return quotaMetrics;
  }

  /**
   * Quota metrics to indicate the result of release. Depending on the request, one or more of the
   * following metrics will be included:
   *
   * 1. For rate quota, per quota group or per quota metric released amount will be specified using
   * the following delta metric:   "serviceruntime.googleapis.com/api/consumer/quota_refund_count"
   *
   * 2. For allocation quota, per quota metric total usage will be specified using the following
   * gauge metric:   "serviceruntime.googleapis.com/allocation/consumer/quota_used_count"
   *
   * 3. For allocation quota, value for each quota limit associated with the metrics will be
   * specified using the following gauge metric:   "serviceruntime.googleapis.com/quota/limit"
   * @param quotaMetrics quotaMetrics or {@code null} for none
   */
  public ReleaseQuotaResponse setQuotaMetrics(java.util.List<MetricValueSet> quotaMetrics) {
    this.quotaMetrics = quotaMetrics;
    return this;
  }

  /**
   * Indicates the decision of the release.
   * @return value or {@code null} for none
   */
  public java.util.List<QuotaError> getReleaseErrors() {
    return releaseErrors;
  }

  /**
   * Indicates the decision of the release.
   * @param releaseErrors releaseErrors or {@code null} for none
   */
  public ReleaseQuotaResponse setReleaseErrors(java.util.List<QuotaError> releaseErrors) {
    this.releaseErrors = releaseErrors;
    return this;
  }

  /**
   * ID of the actual config used to process the request.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceConfigId() {
    return serviceConfigId;
  }

  /**
   * ID of the actual config used to process the request.
   * @param serviceConfigId serviceConfigId or {@code null} for none
   */
  public ReleaseQuotaResponse setServiceConfigId(java.lang.String serviceConfigId) {
    this.serviceConfigId = serviceConfigId;
    return this;
  }

  @Override
  public ReleaseQuotaResponse set(String fieldName, Object value) {
    return (ReleaseQuotaResponse) super.set(fieldName, value);
  }

  @Override
  public ReleaseQuotaResponse clone() {
    return (ReleaseQuotaResponse) super.clone();
  }

}
