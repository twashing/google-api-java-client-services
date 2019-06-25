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

package com.google.api.services.firebase.v1beta1.model;

/**
 * A `FirebaseProject` is the top-level Firebase entity. It is the container for Firebase Apps,
 * Firebase Hosting sites, storage systems (Firebase Realtime Database, Cloud Firestore, Cloud
 * Storage buckets) and other Firebase and Google Cloud Platform (GCP) resources.
 *
 * You can create a new `FirebaseProject` in the [Firebase
 * console](https://console.firebase.google.com/), or you can add Firebase resources to an existing
 * [GCP `Project`](https://cloud.google.com/resource-manager/reference/rest/v1/projects) by calling
 * AddFirebase.
 *
 * A `FirebaseProject` is actually also a GCP `Project`, so a `FirebaseProject` uses underlying GCP
 * identifiers (most importantly, `projectId`) as its own for easy interop with GCP APIs.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirebaseProject extends com.google.api.client.json.GenericJson {

  /**
   * The user-assigned display name of the Project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The fully qualified resource name of the Project, in the format: projects/projectId
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Immutable. The globally unique, user-assigned ID of the Project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * The globally unique, Google-assigned identifier of the Project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long projectNumber;

  /**
   * The default Firebase resources associated with the Project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DefaultResources resources;

  /**
   * The user-assigned display name of the Project.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The user-assigned display name of the Project.
   * @param displayName displayName or {@code null} for none
   */
  public FirebaseProject setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The fully qualified resource name of the Project, in the format: projects/projectId
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The fully qualified resource name of the Project, in the format: projects/projectId
   * @param name name or {@code null} for none
   */
  public FirebaseProject setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Immutable. The globally unique, user-assigned ID of the Project.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Immutable. The globally unique, user-assigned ID of the Project.
   * @param projectId projectId or {@code null} for none
   */
  public FirebaseProject setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The globally unique, Google-assigned identifier of the Project.
   * @return value or {@code null} for none
   */
  public java.lang.Long getProjectNumber() {
    return projectNumber;
  }

  /**
   * The globally unique, Google-assigned identifier of the Project.
   * @param projectNumber projectNumber or {@code null} for none
   */
  public FirebaseProject setProjectNumber(java.lang.Long projectNumber) {
    this.projectNumber = projectNumber;
    return this;
  }

  /**
   * The default Firebase resources associated with the Project.
   * @return value or {@code null} for none
   */
  public DefaultResources getResources() {
    return resources;
  }

  /**
   * The default Firebase resources associated with the Project.
   * @param resources resources or {@code null} for none
   */
  public FirebaseProject setResources(DefaultResources resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public FirebaseProject set(String fieldName, Object value) {
    return (FirebaseProject) super.set(fieldName, value);
  }

  @Override
  public FirebaseProject clone() {
    return (FirebaseProject) super.clone();
  }

}
