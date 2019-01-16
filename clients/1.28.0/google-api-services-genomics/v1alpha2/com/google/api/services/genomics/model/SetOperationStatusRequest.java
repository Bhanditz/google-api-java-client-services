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

package com.google.api.services.genomics.model;

/**
 * Request to set operation status. Should only be used by VMs created by the Pipelines Service and
 * not by end users.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SetOperationStatusRequest extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorCode;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMessage;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TimestampEvent> timestampEvents;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger validationToken;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorCode() {
    return errorCode;
  }

  /**
   * @param errorCode errorCode or {@code null} for none
   */
  public SetOperationStatusRequest setErrorCode(java.lang.String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * @param errorMessage errorMessage or {@code null} for none
   */
  public SetOperationStatusRequest setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationId() {
    return operationId;
  }

  /**
   * @param operationId operationId or {@code null} for none
   */
  public SetOperationStatusRequest setOperationId(java.lang.String operationId) {
    this.operationId = operationId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.util.List<TimestampEvent> getTimestampEvents() {
    return timestampEvents;
  }

  /**
   * @param timestampEvents timestampEvents or {@code null} for none
   */
  public SetOperationStatusRequest setTimestampEvents(java.util.List<TimestampEvent> timestampEvents) {
    this.timestampEvents = timestampEvents;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getValidationToken() {
    return validationToken;
  }

  /**
   * @param validationToken validationToken or {@code null} for none
   */
  public SetOperationStatusRequest setValidationToken(java.math.BigInteger validationToken) {
    this.validationToken = validationToken;
    return this;
  }

  @Override
  public SetOperationStatusRequest set(String fieldName, Object value) {
    return (SetOperationStatusRequest) super.set(fieldName, value);
  }

  @Override
  public SetOperationStatusRequest clone() {
    return (SetOperationStatusRequest) super.clone();
  }

}
