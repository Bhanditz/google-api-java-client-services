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

package com.google.api.services.servicebroker.v1beta1.model;

/**
 * Response for the `DeleteBinding()` method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Broker API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudServicebrokerV1beta1DeleteBindingResponse extends com.google.api.client.json.GenericJson {

  /**
   * Used to communicate description of the response. Usually for non-standard error codes.
   * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * If broker executes operation asynchronously, this is the operation ID that can be polled to
   * check the completion status of said operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operation;

  /**
   * Used to communicate description of the response. Usually for non-standard error codes.
   * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Used to communicate description of the response. Usually for non-standard error codes.
   * https://github.com/openservicebrokerapi/servicebroker/blob/master/spec.md#service-broker-errors
   * @param description description or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1DeleteBindingResponse setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * If broker executes operation asynchronously, this is the operation ID that can be polled to
   * check the completion status of said operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperation() {
    return operation;
  }

  /**
   * If broker executes operation asynchronously, this is the operation ID that can be polled to
   * check the completion status of said operation.
   * @param operation operation or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1DeleteBindingResponse setOperation(java.lang.String operation) {
    this.operation = operation;
    return this;
  }

  @Override
  public GoogleCloudServicebrokerV1beta1DeleteBindingResponse set(String fieldName, Object value) {
    return (GoogleCloudServicebrokerV1beta1DeleteBindingResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudServicebrokerV1beta1DeleteBindingResponse clone() {
    return (GoogleCloudServicebrokerV1beta1DeleteBindingResponse) super.clone();
  }

}
