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

package com.google.api.services.mirror.model;

/**
 * A single value that is part of a MenuItem.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Mirror API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class MenuValue extends com.google.api.client.json.GenericJson {

  /**
   * The name to display for the menu item. If you specify this property for a built-in menu item,
   * the default contextual voice command for that menu item is not shown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * URL of an icon to display with the menu item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String iconUrl;

  /**
   * The state that this value applies to. Allowed values are: - DEFAULT - Default value shown when
   * displayed in the menuItems list.  - PENDING - Value shown when the menuItem has been selected
   * by the user but can still be cancelled.  - CONFIRMED - Value shown when the menuItem has been
   * selected by the user and can no longer be cancelled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The name to display for the menu item. If you specify this property for a built-in menu item,
   * the default contextual voice command for that menu item is not shown.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name to display for the menu item. If you specify this property for a built-in menu item,
   * the default contextual voice command for that menu item is not shown.
   * @param displayName displayName or {@code null} for none
   */
  public MenuValue setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * URL of an icon to display with the menu item.
   * @return value or {@code null} for none
   */
  public java.lang.String getIconUrl() {
    return iconUrl;
  }

  /**
   * URL of an icon to display with the menu item.
   * @param iconUrl iconUrl or {@code null} for none
   */
  public MenuValue setIconUrl(java.lang.String iconUrl) {
    this.iconUrl = iconUrl;
    return this;
  }

  /**
   * The state that this value applies to. Allowed values are: - DEFAULT - Default value shown when
   * displayed in the menuItems list.  - PENDING - Value shown when the menuItem has been selected
   * by the user but can still be cancelled.  - CONFIRMED - Value shown when the menuItem has been
   * selected by the user and can no longer be cancelled.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * The state that this value applies to. Allowed values are: - DEFAULT - Default value shown when
   * displayed in the menuItems list.  - PENDING - Value shown when the menuItem has been selected
   * by the user but can still be cancelled.  - CONFIRMED - Value shown when the menuItem has been
   * selected by the user and can no longer be cancelled.
   * @param state state or {@code null} for none
   */
  public MenuValue setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public MenuValue set(String fieldName, Object value) {
    return (MenuValue) super.set(fieldName, value);
  }

  @Override
  public MenuValue clone() {
    return (MenuValue) super.clone();
  }

}
