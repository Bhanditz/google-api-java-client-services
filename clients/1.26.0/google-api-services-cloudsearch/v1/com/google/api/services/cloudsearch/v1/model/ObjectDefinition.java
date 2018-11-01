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

package com.google.api.services.cloudsearch.v1.model;

/**
 * The definition for an object within a data source.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ObjectDefinition extends com.google.api.client.json.GenericJson {

  /**
   * Name for the object, which then defines its type. Item indexing requests should set the
   * objectType field equal to this value. For example, if *name* is *Document*, then indexing
   * requests for items of type Document should set objectType equal to *Document*. Each object
   * definition must be uniquely named within a schema. The name must start with a letter and can
   * only contain letters (A-Z, a-z) or numbers (0-9). The maximum length is 256 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The optional object-specific options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ObjectOptions options;

  /**
   * The property definitions for the object. The maximum number of elements is 1000.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PropertyDefinition> propertyDefinitions;

  static {
    // hack to force ProGuard to consider PropertyDefinition used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PropertyDefinition.class);
  }

  /**
   * Name for the object, which then defines its type. Item indexing requests should set the
   * objectType field equal to this value. For example, if *name* is *Document*, then indexing
   * requests for items of type Document should set objectType equal to *Document*. Each object
   * definition must be uniquely named within a schema. The name must start with a letter and can
   * only contain letters (A-Z, a-z) or numbers (0-9). The maximum length is 256 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name for the object, which then defines its type. Item indexing requests should set the
   * objectType field equal to this value. For example, if *name* is *Document*, then indexing
   * requests for items of type Document should set objectType equal to *Document*. Each object
   * definition must be uniquely named within a schema. The name must start with a letter and can
   * only contain letters (A-Z, a-z) or numbers (0-9). The maximum length is 256 characters.
   * @param name name or {@code null} for none
   */
  public ObjectDefinition setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The optional object-specific options.
   * @return value or {@code null} for none
   */
  public ObjectOptions getOptions() {
    return options;
  }

  /**
   * The optional object-specific options.
   * @param options options or {@code null} for none
   */
  public ObjectDefinition setOptions(ObjectOptions options) {
    this.options = options;
    return this;
  }

  /**
   * The property definitions for the object. The maximum number of elements is 1000.
   * @return value or {@code null} for none
   */
  public java.util.List<PropertyDefinition> getPropertyDefinitions() {
    return propertyDefinitions;
  }

  /**
   * The property definitions for the object. The maximum number of elements is 1000.
   * @param propertyDefinitions propertyDefinitions or {@code null} for none
   */
  public ObjectDefinition setPropertyDefinitions(java.util.List<PropertyDefinition> propertyDefinitions) {
    this.propertyDefinitions = propertyDefinitions;
    return this;
  }

  @Override
  public ObjectDefinition set(String fieldName, Object value) {
    return (ObjectDefinition) super.set(fieldName, value);
  }

  @Override
  public ObjectDefinition clone() {
    return (ObjectDefinition) super.clone();
  }

}