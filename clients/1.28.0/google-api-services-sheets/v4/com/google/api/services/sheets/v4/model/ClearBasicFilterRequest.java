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
 * Clears the basic filter, if any exists on the sheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ClearBasicFilterRequest extends com.google.api.client.json.GenericJson {

  /**
   * The sheet ID on which the basic filter should be cleared.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sheetId;

  /**
   * The sheet ID on which the basic filter should be cleared.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSheetId() {
    return sheetId;
  }

  /**
   * The sheet ID on which the basic filter should be cleared.
   * @param sheetId sheetId or {@code null} for none
   */
  public ClearBasicFilterRequest setSheetId(java.lang.Integer sheetId) {
    this.sheetId = sheetId;
    return this;
  }

  @Override
  public ClearBasicFilterRequest set(String fieldName, Object value) {
    return (ClearBasicFilterRequest) super.set(fieldName, value);
  }

  @Override
  public ClearBasicFilterRequest clone() {
    return (ClearBasicFilterRequest) super.clone();
  }

}
