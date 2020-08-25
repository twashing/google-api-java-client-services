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

package com.google.api.services.securitycenter.v1beta1.model;

/**
 * Security Command Center finding. A finding is a record of assessment data (security, risk, health
 * or privacy) ingested into Security Command Center for presentation, notification, analysis,
 * policy testing, and enforcement. For example, an XSS vulnerability in an App Engine application
 * is a finding.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudSecuritycenterV1beta1Finding extends com.google.api.client.json.GenericJson {

  /**
   * The additional taxonomy group within findings from a given source. This field is immutable
   * after creation time. Example: "XSS_FLASH_INJECTION"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * The time at which the finding was created in Security Command Center.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The time at which the event took place, or when an update to the finding occurred. For example,
   * if the finding represents an open firewall it would capture the time the detector believes the
   * firewall became open. The accuracy is determined by the detector. If the finding were to be
   * resolved afterward, this time would reflect when the finding was resolved.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String eventTime;

  /**
   * The URI that, if available, points to a web page outside of Security Command Center where
   * additional information about the finding can be found. This field is guaranteed to be either
   * empty or a well formed URL.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String externalUri;

  /**
   * The relative resource name of this finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. The relative resource name of the source the finding belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name This field is
   * immutable after creation time. For example:
   * "organizations/{organization_id}/sources/{source_id}"
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String parent;

  /**
   * For findings on Google Cloud resources, the full resource name of the Google Cloud resource
   * this finding is for. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name When the finding is for
   * a non-Google Cloud resource, the resourceName can be a customer or partner defined string. This
   * field is immutable after creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceName;

  /**
   * Output only. User specified security marks. These marks are entirely managed by the user and
   * come from the SecurityMarks resource that belongs to the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudSecuritycenterV1beta1SecurityMarks securityMarks;

  /**
   * Source specific properties. These properties are managed by the source that writes the finding.
   * The key names in the source_properties map must be between 1 and 255 characters, and must start
   * with a letter and contain alphanumeric characters or underscores only.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> sourceProperties;

  /**
   * The state of the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The additional taxonomy group within findings from a given source. This field is immutable
   * after creation time. Example: "XSS_FLASH_INJECTION"
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * The additional taxonomy group within findings from a given source. This field is immutable
   * after creation time. Example: "XSS_FLASH_INJECTION"
   * @param category category or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1beta1Finding setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * The time at which the finding was created in Security Command Center.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time at which the finding was created in Security Command Center.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1beta1Finding setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * The time at which the event took place, or when an update to the finding occurred. For example,
   * if the finding represents an open firewall it would capture the time the detector believes the
   * firewall became open. The accuracy is determined by the detector. If the finding were to be
   * resolved afterward, this time would reflect when the finding was resolved.
   * @return value or {@code null} for none
   */
  public String getEventTime() {
    return eventTime;
  }

  /**
   * The time at which the event took place, or when an update to the finding occurred. For example,
   * if the finding represents an open firewall it would capture the time the detector believes the
   * firewall became open. The accuracy is determined by the detector. If the finding were to be
   * resolved afterward, this time would reflect when the finding was resolved.
   * @param eventTime eventTime or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1beta1Finding setEventTime(String eventTime) {
    this.eventTime = eventTime;
    return this;
  }

  /**
   * The URI that, if available, points to a web page outside of Security Command Center where
   * additional information about the finding can be found. This field is guaranteed to be either
   * empty or a well formed URL.
   * @return value or {@code null} for none
   */
  public java.lang.String getExternalUri() {
    return externalUri;
  }

  /**
   * The URI that, if available, points to a web page outside of Security Command Center where
   * additional information about the finding can be found. This field is guaranteed to be either
   * empty or a well formed URL.
   * @param externalUri externalUri or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1beta1Finding setExternalUri(java.lang.String externalUri) {
    this.externalUri = externalUri;
    return this;
  }

  /**
   * The relative resource name of this finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The relative resource name of this finding. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name Example:
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}"
   * @param name name or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1beta1Finding setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. The relative resource name of the source the finding belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name This field is
   * immutable after creation time. For example:
   * "organizations/{organization_id}/sources/{source_id}"
   * @return value or {@code null} for none
   */
  public java.lang.String getParent() {
    return parent;
  }

  /**
   * Immutable. The relative resource name of the source the finding belongs to. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name This field is
   * immutable after creation time. For example:
   * "organizations/{organization_id}/sources/{source_id}"
   * @param parent parent or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1beta1Finding setParent(java.lang.String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * For findings on Google Cloud resources, the full resource name of the Google Cloud resource
   * this finding is for. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name When the finding is for
   * a non-Google Cloud resource, the resourceName can be a customer or partner defined string. This
   * field is immutable after creation time.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceName() {
    return resourceName;
  }

  /**
   * For findings on Google Cloud resources, the full resource name of the Google Cloud resource
   * this finding is for. See:
   * https://cloud.google.com/apis/design/resource_names#full_resource_name When the finding is for
   * a non-Google Cloud resource, the resourceName can be a customer or partner defined string. This
   * field is immutable after creation time.
   * @param resourceName resourceName or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1beta1Finding setResourceName(java.lang.String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Output only. User specified security marks. These marks are entirely managed by the user and
   * come from the SecurityMarks resource that belongs to the finding.
   * @return value or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1beta1SecurityMarks getSecurityMarks() {
    return securityMarks;
  }

  /**
   * Output only. User specified security marks. These marks are entirely managed by the user and
   * come from the SecurityMarks resource that belongs to the finding.
   * @param securityMarks securityMarks or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1beta1Finding setSecurityMarks(GoogleCloudSecuritycenterV1beta1SecurityMarks securityMarks) {
    this.securityMarks = securityMarks;
    return this;
  }

  /**
   * Source specific properties. These properties are managed by the source that writes the finding.
   * The key names in the source_properties map must be between 1 and 255 characters, and must start
   * with a letter and contain alphanumeric characters or underscores only.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getSourceProperties() {
    return sourceProperties;
  }

  /**
   * Source specific properties. These properties are managed by the source that writes the finding.
   * The key names in the source_properties map must be between 1 and 255 characters, and must start
   * with a letter and contain alphanumeric characters or underscores only.
   * @param sourceProperties sourceProperties or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1beta1Finding setSourceProperties(java.util.Map<String, java.lang.Object> sourceProperties) {
    this.sourceProperties = sourceProperties;
    return this;
  }

  /**
   * The state of the finding.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state of the finding.
   * @param state state or {@code null} for none
   */
  public GoogleCloudSecuritycenterV1beta1Finding setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudSecuritycenterV1beta1Finding set(String fieldName, Object value) {
    return (GoogleCloudSecuritycenterV1beta1Finding) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudSecuritycenterV1beta1Finding clone() {
    return (GoogleCloudSecuritycenterV1beta1Finding) super.clone();
  }

}
