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

package com.google.api.services.vision.v1p2beta1.model;

/**
 * Request for performing Google Cloud Vision API tasks over a user-provided image, with user-
 * requested features.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Vision API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudVisionV1p2beta1AnnotateImageRequest extends com.google.api.client.json.GenericJson {

  /**
   * Requested features.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudVisionV1p2beta1Feature> features;

  /**
   * The image to be processed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p2beta1Image image;

  /**
   * Additional context that may accompany the image.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudVisionV1p2beta1ImageContext imageContext;

  /**
   * Requested features.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudVisionV1p2beta1Feature> getFeatures() {
    return features;
  }

  /**
   * Requested features.
   * @param features features or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1AnnotateImageRequest setFeatures(java.util.List<GoogleCloudVisionV1p2beta1Feature> features) {
    this.features = features;
    return this;
  }

  /**
   * The image to be processed.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1Image getImage() {
    return image;
  }

  /**
   * The image to be processed.
   * @param image image or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1AnnotateImageRequest setImage(GoogleCloudVisionV1p2beta1Image image) {
    this.image = image;
    return this;
  }

  /**
   * Additional context that may accompany the image.
   * @return value or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1ImageContext getImageContext() {
    return imageContext;
  }

  /**
   * Additional context that may accompany the image.
   * @param imageContext imageContext or {@code null} for none
   */
  public GoogleCloudVisionV1p2beta1AnnotateImageRequest setImageContext(GoogleCloudVisionV1p2beta1ImageContext imageContext) {
    this.imageContext = imageContext;
    return this;
  }

  @Override
  public GoogleCloudVisionV1p2beta1AnnotateImageRequest set(String fieldName, Object value) {
    return (GoogleCloudVisionV1p2beta1AnnotateImageRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudVisionV1p2beta1AnnotateImageRequest clone() {
    return (GoogleCloudVisionV1p2beta1AnnotateImageRequest) super.clone();
  }

}
