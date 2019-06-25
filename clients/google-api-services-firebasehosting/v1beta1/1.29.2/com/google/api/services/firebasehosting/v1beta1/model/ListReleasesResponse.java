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

package com.google.api.services.firebasehosting.v1beta1.model;

/**
 * Model definition for ListReleasesResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Hosting API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListReleasesResponse extends com.google.api.client.json.GenericJson {

  /**
   * If there are additional releases remaining beyond the ones in this response, then supply this
   * token in the next [`list`](../sites.versions.files/list) call to continue with the next set of
   * releases.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * The list of hashes of files that still need to be uploaded, if any exist.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Release> releases;

  /**
   * If there are additional releases remaining beyond the ones in this response, then supply this
   * token in the next [`list`](../sites.versions.files/list) call to continue with the next set of
   * releases.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * If there are additional releases remaining beyond the ones in this response, then supply this
   * token in the next [`list`](../sites.versions.files/list) call to continue with the next set of
   * releases.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListReleasesResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * The list of hashes of files that still need to be uploaded, if any exist.
   * @return value or {@code null} for none
   */
  public java.util.List<Release> getReleases() {
    return releases;
  }

  /**
   * The list of hashes of files that still need to be uploaded, if any exist.
   * @param releases releases or {@code null} for none
   */
  public ListReleasesResponse setReleases(java.util.List<Release> releases) {
    this.releases = releases;
    return this;
  }

  @Override
  public ListReleasesResponse set(String fieldName, Object value) {
    return (ListReleasesResponse) super.set(fieldName, value);
  }

  @Override
  public ListReleasesResponse clone() {
    return (ListReleasesResponse) super.clone();
  }

}
