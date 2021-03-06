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

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * Model definition for BuildBazelSemverSemVer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelSemverSemVer extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer major;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer minor;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer patch;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String prerelease;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMajor() {
    return major;
  }

  /**
   * @param major major or {@code null} for none
   */
  public BuildBazelSemverSemVer setMajor(java.lang.Integer major) {
    this.major = major;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMinor() {
    return minor;
  }

  /**
   * @param minor minor or {@code null} for none
   */
  public BuildBazelSemverSemVer setMinor(java.lang.Integer minor) {
    this.minor = minor;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPatch() {
    return patch;
  }

  /**
   * @param patch patch or {@code null} for none
   */
  public BuildBazelSemverSemVer setPatch(java.lang.Integer patch) {
    this.patch = patch;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getPrerelease() {
    return prerelease;
  }

  /**
   * @param prerelease prerelease or {@code null} for none
   */
  public BuildBazelSemverSemVer setPrerelease(java.lang.String prerelease) {
    this.prerelease = prerelease;
    return this;
  }

  @Override
  public BuildBazelSemverSemVer set(String fieldName, Object value) {
    return (BuildBazelSemverSemVer) super.set(fieldName, value);
  }

  @Override
  public BuildBazelSemverSemVer clone() {
    return (BuildBazelSemverSemVer) super.clone();
  }

}
