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

package com.google.api.services.androidenterprise.model;

/**
 * The Auto install constraint. Defines a set of restrictions for installation. At least one of the
 * fields must be set.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AutoInstallConstraint extends com.google.api.client.json.GenericJson {

  /**
   * Charging state to constrain on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String chargingStateConstraint;

  /**
   * The idle state of the device to constrain on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deviceIdleStateConstraint;

  /**
   * Network type to constrain on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkTypeConstraint;

  /**
   * Charging state to constrain on.
   * @return value or {@code null} for none
   */
  public java.lang.String getChargingStateConstraint() {
    return chargingStateConstraint;
  }

  /**
   * Charging state to constrain on.
   * @param chargingStateConstraint chargingStateConstraint or {@code null} for none
   */
  public AutoInstallConstraint setChargingStateConstraint(java.lang.String chargingStateConstraint) {
    this.chargingStateConstraint = chargingStateConstraint;
    return this;
  }

  /**
   * The idle state of the device to constrain on.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeviceIdleStateConstraint() {
    return deviceIdleStateConstraint;
  }

  /**
   * The idle state of the device to constrain on.
   * @param deviceIdleStateConstraint deviceIdleStateConstraint or {@code null} for none
   */
  public AutoInstallConstraint setDeviceIdleStateConstraint(java.lang.String deviceIdleStateConstraint) {
    this.deviceIdleStateConstraint = deviceIdleStateConstraint;
    return this;
  }

  /**
   * Network type to constrain on.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkTypeConstraint() {
    return networkTypeConstraint;
  }

  /**
   * Network type to constrain on.
   * @param networkTypeConstraint networkTypeConstraint or {@code null} for none
   */
  public AutoInstallConstraint setNetworkTypeConstraint(java.lang.String networkTypeConstraint) {
    this.networkTypeConstraint = networkTypeConstraint;
    return this;
  }

  @Override
  public AutoInstallConstraint set(String fieldName, Object value) {
    return (AutoInstallConstraint) super.set(fieldName, value);
  }

  @Override
  public AutoInstallConstraint clone() {
    return (AutoInstallConstraint) super.clone();
  }

}
