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

package com.google.api.services.remotebuildexecution.v1alpha.model;

/**
 * An optional Metadata to attach to any RPC request to tell the server about an external context of
 * the request. The server may use this for logging or other purposes. To use it, the client
 * attaches the header to the call using the canonical proto serialization: name:
 * build.bazel.remote.execution.v2.requestmetadata-bin contents: the base64 encoded binary
 * RequestMetadata message.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2RequestMetadata extends com.google.api.client.json.GenericJson {

  /**
   * An identifier that ties multiple requests to the same action. For example, multiple requests to
   * the CAS, Action Cache, and Execution API are used in order to compile foo.cc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String actionId;

  /**
   * An identifier to tie multiple tool invocations together. For example, runs of foo_test,
   * bar_test and baz_test on a post-submit of a given patch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String correlatedInvocationsId;

  /**
   * The details for the tool invoking the requests.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private BuildBazelRemoteExecutionV2ToolDetails toolDetails;

  /**
   * An identifier that ties multiple actions together to a final result. For example, multiple
   * actions are required to build and run foo_test.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String toolInvocationId;

  /**
   * An identifier that ties multiple requests to the same action. For example, multiple requests to
   * the CAS, Action Cache, and Execution API are used in order to compile foo.cc.
   * @return value or {@code null} for none
   */
  public java.lang.String getActionId() {
    return actionId;
  }

  /**
   * An identifier that ties multiple requests to the same action. For example, multiple requests to
   * the CAS, Action Cache, and Execution API are used in order to compile foo.cc.
   * @param actionId actionId or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2RequestMetadata setActionId(java.lang.String actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * An identifier to tie multiple tool invocations together. For example, runs of foo_test,
   * bar_test and baz_test on a post-submit of a given patch.
   * @return value or {@code null} for none
   */
  public java.lang.String getCorrelatedInvocationsId() {
    return correlatedInvocationsId;
  }

  /**
   * An identifier to tie multiple tool invocations together. For example, runs of foo_test,
   * bar_test and baz_test on a post-submit of a given patch.
   * @param correlatedInvocationsId correlatedInvocationsId or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2RequestMetadata setCorrelatedInvocationsId(java.lang.String correlatedInvocationsId) {
    this.correlatedInvocationsId = correlatedInvocationsId;
    return this;
  }

  /**
   * The details for the tool invoking the requests.
   * @return value or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ToolDetails getToolDetails() {
    return toolDetails;
  }

  /**
   * The details for the tool invoking the requests.
   * @param toolDetails toolDetails or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2RequestMetadata setToolDetails(BuildBazelRemoteExecutionV2ToolDetails toolDetails) {
    this.toolDetails = toolDetails;
    return this;
  }

  /**
   * An identifier that ties multiple actions together to a final result. For example, multiple
   * actions are required to build and run foo_test.
   * @return value or {@code null} for none
   */
  public java.lang.String getToolInvocationId() {
    return toolInvocationId;
  }

  /**
   * An identifier that ties multiple actions together to a final result. For example, multiple
   * actions are required to build and run foo_test.
   * @param toolInvocationId toolInvocationId or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2RequestMetadata setToolInvocationId(java.lang.String toolInvocationId) {
    this.toolInvocationId = toolInvocationId;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2RequestMetadata set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2RequestMetadata) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2RequestMetadata clone() {
    return (BuildBazelRemoteExecutionV2RequestMetadata) super.clone();
  }

}
