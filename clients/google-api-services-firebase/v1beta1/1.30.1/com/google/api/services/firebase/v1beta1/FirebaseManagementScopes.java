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

package com.google.api.services.firebase.v1beta1;

/**
 * Available OAuth 2.0 scopes for use with the Firebase Management API.
 *
 * @since 1.4
 */
public class FirebaseManagementScopes {

  /** View and manage your data across Google Cloud Platform services. */
  public static final String CLOUD_PLATFORM = "https://www.googleapis.com/auth/cloud-platform";

  /** View your data across Google Cloud Platform services. */
  public static final String CLOUD_PLATFORM_READ_ONLY = "https://www.googleapis.com/auth/cloud-platform.read-only";

  /** View and administer all your Firebase data and settings. */
  public static final String FIREBASE = "https://www.googleapis.com/auth/firebase";

  /** View all your Firebase data and settings. */
  public static final String FIREBASE_READONLY = "https://www.googleapis.com/auth/firebase.readonly";

  /**
   * Returns an unmodifiable set that contains all scopes declared by this class.
   *
   * @since 1.16
   */
  public static java.util.Set<String> all() {
    java.util.Set<String> set = new java.util.HashSet<String>();
    set.add(CLOUD_PLATFORM);
    set.add(CLOUD_PLATFORM_READ_ONLY);
    set.add(FIREBASE);
    set.add(FIREBASE_READONLY);
    return java.util.Collections.unmodifiableSet(set);
  }

  private FirebaseManagementScopes() {
  }
}
