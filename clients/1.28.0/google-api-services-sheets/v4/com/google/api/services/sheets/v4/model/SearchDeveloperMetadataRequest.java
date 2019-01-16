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

package com.google.api.services.sheets.v4.model;

/**
 * A request to retrieve all developer metadata matching the set of specified criteria.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchDeveloperMetadataRequest extends com.google.api.client.json.GenericJson {

  /**
   * The data filters describing the criteria used to determine which DeveloperMetadata entries to
   * return.  DeveloperMetadata matching any of the specified filters will be included in the
   * response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataFilter> dataFilters;

  static {
    // hack to force ProGuard to consider DataFilter used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DataFilter.class);
  }

  /**
   * The data filters describing the criteria used to determine which DeveloperMetadata entries to
   * return.  DeveloperMetadata matching any of the specified filters will be included in the
   * response.
   * @return value or {@code null} for none
   */
  public java.util.List<DataFilter> getDataFilters() {
    return dataFilters;
  }

  /**
   * The data filters describing the criteria used to determine which DeveloperMetadata entries to
   * return.  DeveloperMetadata matching any of the specified filters will be included in the
   * response.
   * @param dataFilters dataFilters or {@code null} for none
   */
  public SearchDeveloperMetadataRequest setDataFilters(java.util.List<DataFilter> dataFilters) {
    this.dataFilters = dataFilters;
    return this;
  }

  @Override
  public SearchDeveloperMetadataRequest set(String fieldName, Object value) {
    return (SearchDeveloperMetadataRequest) super.set(fieldName, value);
  }

  @Override
  public SearchDeveloperMetadataRequest clone() {
    return (SearchDeveloperMetadataRequest) super.clone();
  }

}
