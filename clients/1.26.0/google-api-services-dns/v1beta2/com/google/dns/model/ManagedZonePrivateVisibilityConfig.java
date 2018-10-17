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

package com.google.dns.model;

/**
 * Model definition for ManagedZonePrivateVisibilityConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ManagedZonePrivateVisibilityConfig extends com.google.api.client.json.GenericJson {

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZonePrivateVisibilityConfig".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The list of GCE private network IDs that can see this zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ManagedZonePrivateVisibilityConfigNetwork> networks;

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZonePrivateVisibilityConfig".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "dns#managedZonePrivateVisibilityConfig".
   * @param kind kind or {@code null} for none
   */
  public ManagedZonePrivateVisibilityConfig setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The list of GCE private network IDs that can see this zone.
   * @return value or {@code null} for none
   */
  public java.util.List<ManagedZonePrivateVisibilityConfigNetwork> getNetworks() {
    return networks;
  }

  /**
   * The list of GCE private network IDs that can see this zone.
   * @param networks networks or {@code null} for none
   */
  public ManagedZonePrivateVisibilityConfig setNetworks(java.util.List<ManagedZonePrivateVisibilityConfigNetwork> networks) {
    this.networks = networks;
    return this;
  }

  @Override
  public ManagedZonePrivateVisibilityConfig set(String fieldName, Object value) {
    return (ManagedZonePrivateVisibilityConfig) super.set(fieldName, value);
  }

  @Override
  public ManagedZonePrivateVisibilityConfig clone() {
    return (ManagedZonePrivateVisibilityConfig) super.clone();
  }

}
