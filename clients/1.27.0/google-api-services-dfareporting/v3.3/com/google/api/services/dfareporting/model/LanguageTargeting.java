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

package com.google.api.services.dfareporting.model;

/**
 * Language Targeting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DCM/DFA Reporting And Trafficking API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LanguageTargeting extends com.google.api.client.json.GenericJson {

  /**
   * Languages that this ad targets. For each language only languageId is required. The other fields
   * are populated automatically when the ad is inserted or updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Language> languages;

  static {
    // hack to force ProGuard to consider Language used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Language.class);
  }

  /**
   * Languages that this ad targets. For each language only languageId is required. The other fields
   * are populated automatically when the ad is inserted or updated.
   * @return value or {@code null} for none
   */
  public java.util.List<Language> getLanguages() {
    return languages;
  }

  /**
   * Languages that this ad targets. For each language only languageId is required. The other fields
   * are populated automatically when the ad is inserted or updated.
   * @param languages languages or {@code null} for none
   */
  public LanguageTargeting setLanguages(java.util.List<Language> languages) {
    this.languages = languages;
    return this;
  }

  @Override
  public LanguageTargeting set(String fieldName, Object value) {
    return (LanguageTargeting) super.set(fieldName, value);
  }

  @Override
  public LanguageTargeting clone() {
    return (LanguageTargeting) super.clone();
  }

}
