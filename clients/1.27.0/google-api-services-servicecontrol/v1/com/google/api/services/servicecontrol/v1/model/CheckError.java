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
 * Defines the errors to be returned in google.api.servicecontrol.v1.CheckResponse.check_errors.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Control API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CheckError extends com.google.api.client.json.GenericJson {

  /**
   * The error code.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String code;

  /**
   * Free-form text providing details on the error cause of the error.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String detail;

  /**
   * Subject to whom this error applies. See the specific code enum for more details on this field.
   * For example:     - “project:”     - “folder:”     - “organization:”
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subject;

  /**
   * The error code.
   * @return value or {@code null} for none
   */
  public java.lang.String getCode() {
    return code;
  }

  /**
   * The error code.
   * @param code code or {@code null} for none
   */
  public CheckError setCode(java.lang.String code) {
    this.code = code;
    return this;
  }

  /**
   * Free-form text providing details on the error cause of the error.
   * @return value or {@code null} for none
   */
  public java.lang.String getDetail() {
    return detail;
  }

  /**
   * Free-form text providing details on the error cause of the error.
   * @param detail detail or {@code null} for none
   */
  public CheckError setDetail(java.lang.String detail) {
    this.detail = detail;
    return this;
  }

  /**
   * Subject to whom this error applies. See the specific code enum for more details on this field.
   * For example:     - “project:”     - “folder:”     - “organization:”
   * @return value or {@code null} for none
   */
  public java.lang.String getSubject() {
    return subject;
  }

  /**
   * Subject to whom this error applies. See the specific code enum for more details on this field.
   * For example:     - “project:”     - “folder:”     - “organization:”
   * @param subject subject or {@code null} for none
   */
  public CheckError setSubject(java.lang.String subject) {
    this.subject = subject;
    return this;
  }

  @Override
  public CheckError set(String fieldName, Object value) {
    return (CheckError) super.set(fieldName, value);
  }

  @Override
  public CheckError clone() {
    return (CheckError) super.clone();
  }

}
