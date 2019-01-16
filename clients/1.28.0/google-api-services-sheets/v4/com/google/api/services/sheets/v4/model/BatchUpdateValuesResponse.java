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
 * The response when updating a range of values in a spreadsheet.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Sheets API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BatchUpdateValuesResponse extends com.google.api.client.json.GenericJson {

  /**
   * One UpdateValuesResponse per requested range, in the same order as the requests appeared.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UpdateValuesResponse> responses;

  /**
   * The spreadsheet the updates were applied to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String spreadsheetId;

  /**
   * The total number of cells updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalUpdatedCells;

  /**
   * The total number of columns where at least one cell in the column was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalUpdatedColumns;

  /**
   * The total number of rows where at least one cell in the row was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalUpdatedRows;

  /**
   * The total number of sheets where at least one cell in the sheet was updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalUpdatedSheets;

  /**
   * One UpdateValuesResponse per requested range, in the same order as the requests appeared.
   * @return value or {@code null} for none
   */
  public java.util.List<UpdateValuesResponse> getResponses() {
    return responses;
  }

  /**
   * One UpdateValuesResponse per requested range, in the same order as the requests appeared.
   * @param responses responses or {@code null} for none
   */
  public BatchUpdateValuesResponse setResponses(java.util.List<UpdateValuesResponse> responses) {
    this.responses = responses;
    return this;
  }

  /**
   * The spreadsheet the updates were applied to.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpreadsheetId() {
    return spreadsheetId;
  }

  /**
   * The spreadsheet the updates were applied to.
   * @param spreadsheetId spreadsheetId or {@code null} for none
   */
  public BatchUpdateValuesResponse setSpreadsheetId(java.lang.String spreadsheetId) {
    this.spreadsheetId = spreadsheetId;
    return this;
  }

  /**
   * The total number of cells updated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalUpdatedCells() {
    return totalUpdatedCells;
  }

  /**
   * The total number of cells updated.
   * @param totalUpdatedCells totalUpdatedCells or {@code null} for none
   */
  public BatchUpdateValuesResponse setTotalUpdatedCells(java.lang.Integer totalUpdatedCells) {
    this.totalUpdatedCells = totalUpdatedCells;
    return this;
  }

  /**
   * The total number of columns where at least one cell in the column was updated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalUpdatedColumns() {
    return totalUpdatedColumns;
  }

  /**
   * The total number of columns where at least one cell in the column was updated.
   * @param totalUpdatedColumns totalUpdatedColumns or {@code null} for none
   */
  public BatchUpdateValuesResponse setTotalUpdatedColumns(java.lang.Integer totalUpdatedColumns) {
    this.totalUpdatedColumns = totalUpdatedColumns;
    return this;
  }

  /**
   * The total number of rows where at least one cell in the row was updated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalUpdatedRows() {
    return totalUpdatedRows;
  }

  /**
   * The total number of rows where at least one cell in the row was updated.
   * @param totalUpdatedRows totalUpdatedRows or {@code null} for none
   */
  public BatchUpdateValuesResponse setTotalUpdatedRows(java.lang.Integer totalUpdatedRows) {
    this.totalUpdatedRows = totalUpdatedRows;
    return this;
  }

  /**
   * The total number of sheets where at least one cell in the sheet was updated.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalUpdatedSheets() {
    return totalUpdatedSheets;
  }

  /**
   * The total number of sheets where at least one cell in the sheet was updated.
   * @param totalUpdatedSheets totalUpdatedSheets or {@code null} for none
   */
  public BatchUpdateValuesResponse setTotalUpdatedSheets(java.lang.Integer totalUpdatedSheets) {
    this.totalUpdatedSheets = totalUpdatedSheets;
    return this;
  }

  @Override
  public BatchUpdateValuesResponse set(String fieldName, Object value) {
    return (BatchUpdateValuesResponse) super.set(fieldName, value);
  }

  @Override
  public BatchUpdateValuesResponse clone() {
    return (BatchUpdateValuesResponse) super.clone();
  }

}
