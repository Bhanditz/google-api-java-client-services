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

package com.google.api.services.streetviewpublish.v1.model;

/**
 * Response payload for a single Photo in batch operations including BatchGetPhotos and
 * BatchUpdatePhotos.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Street View Publish API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PhotoResponse extends com.google.api.client.json.GenericJson {

  /**
   * The Photo resource, if the request was successful.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Photo photo;

  /**
   * The status for the operation to get or update a single photo in the batch request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Status status;

  /**
   * The Photo resource, if the request was successful.
   * @return value or {@code null} for none
   */
  public Photo getPhoto() {
    return photo;
  }

  /**
   * The Photo resource, if the request was successful.
   * @param photo photo or {@code null} for none
   */
  public PhotoResponse setPhoto(Photo photo) {
    this.photo = photo;
    return this;
  }

  /**
   * The status for the operation to get or update a single photo in the batch request.
   * @return value or {@code null} for none
   */
  public Status getStatus() {
    return status;
  }

  /**
   * The status for the operation to get or update a single photo in the batch request.
   * @param status status or {@code null} for none
   */
  public PhotoResponse setStatus(Status status) {
    this.status = status;
    return this;
  }

  @Override
  public PhotoResponse set(String fieldName, Object value) {
    return (PhotoResponse) super.set(fieldName, value);
  }

  @Override
  public PhotoResponse clone() {
    return (PhotoResponse) super.clone();
  }

}
