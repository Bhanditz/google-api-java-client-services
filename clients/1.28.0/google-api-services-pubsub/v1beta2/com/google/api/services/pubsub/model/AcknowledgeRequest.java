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

package com.google.api.services.pubsub.model;

/**
 * Request for the Acknowledge method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Pub/Sub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AcknowledgeRequest extends com.google.api.client.json.GenericJson {

  /**
   * The acknowledgment ID for the messages being acknowledged that was returned by the Pub/Sub
   * system in the `Pull` response. Must not be empty.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> ackIds;

  /**
   * The acknowledgment ID for the messages being acknowledged that was returned by the Pub/Sub
   * system in the `Pull` response. Must not be empty.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAckIds() {
    return ackIds;
  }

  /**
   * The acknowledgment ID for the messages being acknowledged that was returned by the Pub/Sub
   * system in the `Pull` response. Must not be empty.
   * @param ackIds ackIds or {@code null} for none
   */
  public AcknowledgeRequest setAckIds(java.util.List<java.lang.String> ackIds) {
    this.ackIds = ackIds;
    return this;
  }

  @Override
  public AcknowledgeRequest set(String fieldName, Object value) {
    return (AcknowledgeRequest) super.set(fieldName, value);
  }

  @Override
  public AcknowledgeRequest clone() {
    return (AcknowledgeRequest) super.clone();
  }

}