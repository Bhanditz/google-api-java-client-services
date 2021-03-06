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

package com.google.api.services.partners.v2.model;

/**
 * Analytics data for a `Company` within a single day.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Partners API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Analytics extends com.google.api.client.json.GenericJson {

  /**
   * Instances of users contacting the `Company` on the specified date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AnalyticsDataPoint contacts;

  /**
   * Date on which these events occurred.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date eventDate;

  /**
   * Instances of users viewing the `Company` profile on the specified date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AnalyticsDataPoint profileViews;

  /**
   * Instances of users seeing the `Company` in Google Partners Search results on the specified
   * date.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AnalyticsDataPoint searchViews;

  /**
   * Instances of users contacting the `Company` on the specified date.
   * @return value or {@code null} for none
   */
  public AnalyticsDataPoint getContacts() {
    return contacts;
  }

  /**
   * Instances of users contacting the `Company` on the specified date.
   * @param contacts contacts or {@code null} for none
   */
  public Analytics setContacts(AnalyticsDataPoint contacts) {
    this.contacts = contacts;
    return this;
  }

  /**
   * Date on which these events occurred.
   * @return value or {@code null} for none
   */
  public Date getEventDate() {
    return eventDate;
  }

  /**
   * Date on which these events occurred.
   * @param eventDate eventDate or {@code null} for none
   */
  public Analytics setEventDate(Date eventDate) {
    this.eventDate = eventDate;
    return this;
  }

  /**
   * Instances of users viewing the `Company` profile on the specified date.
   * @return value or {@code null} for none
   */
  public AnalyticsDataPoint getProfileViews() {
    return profileViews;
  }

  /**
   * Instances of users viewing the `Company` profile on the specified date.
   * @param profileViews profileViews or {@code null} for none
   */
  public Analytics setProfileViews(AnalyticsDataPoint profileViews) {
    this.profileViews = profileViews;
    return this;
  }

  /**
   * Instances of users seeing the `Company` in Google Partners Search results on the specified
   * date.
   * @return value or {@code null} for none
   */
  public AnalyticsDataPoint getSearchViews() {
    return searchViews;
  }

  /**
   * Instances of users seeing the `Company` in Google Partners Search results on the specified
   * date.
   * @param searchViews searchViews or {@code null} for none
   */
  public Analytics setSearchViews(AnalyticsDataPoint searchViews) {
    this.searchViews = searchViews;
    return this;
  }

  @Override
  public Analytics set(String fieldName, Object value) {
    return (Analytics) super.set(fieldName, value);
  }

  @Override
  public Analytics clone() {
    return (Analytics) super.clone();
  }

}
