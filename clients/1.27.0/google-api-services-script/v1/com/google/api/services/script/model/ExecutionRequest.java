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

package com.google.api.services.script.model;

/**
 * A request to run the function in a script. The script is identified by the specified `script_id`.
 * Executing a function on a script returns results based on the implementation of the script.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecutionRequest extends com.google.api.client.json.GenericJson {

  /**
   * If `true` and the user is an owner of the script, the script runs at the most recently saved
   * version rather than the version deployed for use with the Apps Script API. Optional; default is
   * `false`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean devMode;

  /**
   * The name of the function to execute in the given script. The name does not include parentheses
   * or parameters. It can reference a function in an included library such as
   * `Library.libFunction1`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String function;

  /**
   * The parameters to be passed to the function being executed. The object type for each parameter
   * should match the expected type in Apps Script. Parameters cannot be Apps Script-specific object
   * types (such as a `Document` or a `Calendar`); they can only be primitive types such as
   * `string`, `number`, `array`, `object`, or `boolean`. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Object> parameters;

  /**
   * For Android add-ons only. An ID that represents the user's current session in the Android app
   * for Google Docs or Sheets, included as extra data in the
   * [Intent](https://developer.android.com/guide/components/intents-filters.html) that launches the
   * add-on. When an Android add-on is run with a session state, it gains the privileges of a
   * [bound](https://developers.google.com/apps-script/guides/bound) scriptthat is, it can access
   * information like the user's current cursor position (in Docs) or selected cell (in Sheets). To
   * retrieve the state, call
   * `Intent.getStringExtra("com.google.android.apps.docs.addons.SessionState")`. Optional.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sessionState;

  /**
   * If `true` and the user is an owner of the script, the script runs at the most recently saved
   * version rather than the version deployed for use with the Apps Script API. Optional; default is
   * `false`.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDevMode() {
    return devMode;
  }

  /**
   * If `true` and the user is an owner of the script, the script runs at the most recently saved
   * version rather than the version deployed for use with the Apps Script API. Optional; default is
   * `false`.
   * @param devMode devMode or {@code null} for none
   */
  public ExecutionRequest setDevMode(java.lang.Boolean devMode) {
    this.devMode = devMode;
    return this;
  }

  /**
   * The name of the function to execute in the given script. The name does not include parentheses
   * or parameters. It can reference a function in an included library such as
   * `Library.libFunction1`.
   * @return value or {@code null} for none
   */
  public java.lang.String getFunction() {
    return function;
  }

  /**
   * The name of the function to execute in the given script. The name does not include parentheses
   * or parameters. It can reference a function in an included library such as
   * `Library.libFunction1`.
   * @param function function or {@code null} for none
   */
  public ExecutionRequest setFunction(java.lang.String function) {
    this.function = function;
    return this;
  }

  /**
   * The parameters to be passed to the function being executed. The object type for each parameter
   * should match the expected type in Apps Script. Parameters cannot be Apps Script-specific object
   * types (such as a `Document` or a `Calendar`); they can only be primitive types such as
   * `string`, `number`, `array`, `object`, or `boolean`. Optional.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Object> getParameters() {
    return parameters;
  }

  /**
   * The parameters to be passed to the function being executed. The object type for each parameter
   * should match the expected type in Apps Script. Parameters cannot be Apps Script-specific object
   * types (such as a `Document` or a `Calendar`); they can only be primitive types such as
   * `string`, `number`, `array`, `object`, or `boolean`. Optional.
   * @param parameters parameters or {@code null} for none
   */
  public ExecutionRequest setParameters(java.util.List<java.lang.Object> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * For Android add-ons only. An ID that represents the user's current session in the Android app
   * for Google Docs or Sheets, included as extra data in the
   * [Intent](https://developer.android.com/guide/components/intents-filters.html) that launches the
   * add-on. When an Android add-on is run with a session state, it gains the privileges of a
   * [bound](https://developers.google.com/apps-script/guides/bound) scriptthat is, it can access
   * information like the user's current cursor position (in Docs) or selected cell (in Sheets). To
   * retrieve the state, call
   * `Intent.getStringExtra("com.google.android.apps.docs.addons.SessionState")`. Optional.
   * @return value or {@code null} for none
   */
  public java.lang.String getSessionState() {
    return sessionState;
  }

  /**
   * For Android add-ons only. An ID that represents the user's current session in the Android app
   * for Google Docs or Sheets, included as extra data in the
   * [Intent](https://developer.android.com/guide/components/intents-filters.html) that launches the
   * add-on. When an Android add-on is run with a session state, it gains the privileges of a
   * [bound](https://developers.google.com/apps-script/guides/bound) scriptthat is, it can access
   * information like the user's current cursor position (in Docs) or selected cell (in Sheets). To
   * retrieve the state, call
   * `Intent.getStringExtra("com.google.android.apps.docs.addons.SessionState")`. Optional.
   * @param sessionState sessionState or {@code null} for none
   */
  public ExecutionRequest setSessionState(java.lang.String sessionState) {
    this.sessionState = sessionState;
    return this;
  }

  @Override
  public ExecutionRequest set(String fieldName, Object value) {
    return (ExecutionRequest) super.set(fieldName, value);
  }

  @Override
  public ExecutionRequest clone() {
    return (ExecutionRequest) super.clone();
  }

}
