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

package com.google.api.services.firebaserules.v1.model;

/**
 * The response for FirebaseRulesService.TestRuleset.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase Rules API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestRulesetResponse extends com.google.api.client.json.GenericJson {

  /**
   * Syntactic and semantic `Source` issues of varying severity. Issues of `ERROR` severity will
   * prevent tests from executing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Issue> issues;

  static {
    // hack to force ProGuard to consider Issue used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Issue.class);
  }

  /**
   * The set of test results given the test cases in the `TestSuite`. The results will appear in the
   * same order as the test cases appear in the `TestSuite`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TestResult> testResults;

  static {
    // hack to force ProGuard to consider TestResult used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TestResult.class);
  }

  /**
   * Syntactic and semantic `Source` issues of varying severity. Issues of `ERROR` severity will
   * prevent tests from executing.
   * @return value or {@code null} for none
   */
  public java.util.List<Issue> getIssues() {
    return issues;
  }

  /**
   * Syntactic and semantic `Source` issues of varying severity. Issues of `ERROR` severity will
   * prevent tests from executing.
   * @param issues issues or {@code null} for none
   */
  public TestRulesetResponse setIssues(java.util.List<Issue> issues) {
    this.issues = issues;
    return this;
  }

  /**
   * The set of test results given the test cases in the `TestSuite`. The results will appear in the
   * same order as the test cases appear in the `TestSuite`.
   * @return value or {@code null} for none
   */
  public java.util.List<TestResult> getTestResults() {
    return testResults;
  }

  /**
   * The set of test results given the test cases in the `TestSuite`. The results will appear in the
   * same order as the test cases appear in the `TestSuite`.
   * @param testResults testResults or {@code null} for none
   */
  public TestRulesetResponse setTestResults(java.util.List<TestResult> testResults) {
    this.testResults = testResults;
    return this;
  }

  @Override
  public TestRulesetResponse set(String fieldName, Object value) {
    return (TestRulesetResponse) super.set(fieldName, value);
  }

  @Override
  public TestRulesetResponse clone() {
    return (TestRulesetResponse) super.clone();
  }

}
