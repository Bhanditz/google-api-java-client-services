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
 * Stores the list of events and times they occured for major events in job execution.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimestampEvent extends com.google.api.client.json.GenericJson {

  /**
   * String indicating the type of event
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * The time this event occured.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestamp;

  /**
   * String indicating the type of event
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * String indicating the type of event
   * @param description description or {@code null} for none
   */
  public TimestampEvent setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * The time this event occured.
   * @return value or {@code null} for none
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * The time this event occured.
   * @param timestamp timestamp or {@code null} for none
   */
  public TimestampEvent setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  @Override
  public TimestampEvent set(String fieldName, Object value) {
    return (TimestampEvent) super.set(fieldName, value);
  }

  @Override
  public TimestampEvent clone() {
    return (TimestampEvent) super.clone();
  }

}
