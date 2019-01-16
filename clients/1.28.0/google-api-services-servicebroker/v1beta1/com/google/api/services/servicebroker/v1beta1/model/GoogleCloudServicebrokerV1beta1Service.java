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

package com.google.api.services.servicebroker.v1beta1.model;

/**
 * The resource model mostly follows the Open Service Broker API, as described here:
 * https://github.com/openservicebrokerapi/servicebroker/blob/master/_spec.md Though due to Google
 * Specifics it has additional optional fields.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Service Broker API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudServicebrokerV1beta1Service extends com.google.api.client.json.GenericJson {

  /**
   * Specifies whether instances of the service can be bound to applications. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean bindable;

  /**
   * Whether the service provides an endpoint to get service bindings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("binding_retrievable")
  private java.lang.Boolean bindingRetrievable;

  /**
   * Whether the service provides an endpoint to get service bindings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("bindings_retrievable")
  private java.lang.Boolean bindingsRetrievable;

  /**
   * Information to activate Dashboard SSO feature.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("dashboard_client")
  private GoogleCloudServicebrokerV1beta1DashboardClient dashboardClient;

  /**
   * Textual description of the service. Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * ID is a globally unique identifier used to uniquely identify the service. ID is an opaque
   * string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Whether the service provides an endpoint to get service instances.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("instances_retrievable")
  private java.lang.Boolean instancesRetrievable;

  /**
   * A list of metadata for a service offering. Metadata is an arbitrary JSON object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * User friendly service name. Name must match [a-z0-9]+ regexp. The name must be globally unique
   * within GCP project. Note, which is different from ("This must be globally unique within a
   * platform marketplace"). Required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Whether the service supports upgrade/downgrade for some plans.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("plan_updateable")
  private java.lang.Boolean planUpdateable;

  /**
   * A list of plans for this service. At least one plan is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudServicebrokerV1beta1Plan> plans;

  static {
    // hack to force ProGuard to consider GoogleCloudServicebrokerV1beta1Plan used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudServicebrokerV1beta1Plan.class);
  }

  /**
   * Tags provide a flexible mechanism to expose a classification, attribute, or base technology of
   * a service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Specifies whether instances of the service can be bound to applications. Required.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBindable() {
    return bindable;
  }

  /**
   * Specifies whether instances of the service can be bound to applications. Required.
   * @param bindable bindable or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setBindable(java.lang.Boolean bindable) {
    this.bindable = bindable;
    return this;
  }

  /**
   * Whether the service provides an endpoint to get service bindings.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBindingRetrievable() {
    return bindingRetrievable;
  }

  /**
   * Whether the service provides an endpoint to get service bindings.
   * @param bindingRetrievable bindingRetrievable or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setBindingRetrievable(java.lang.Boolean bindingRetrievable) {
    this.bindingRetrievable = bindingRetrievable;
    return this;
  }

  /**
   * Whether the service provides an endpoint to get service bindings.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBindingsRetrievable() {
    return bindingsRetrievable;
  }

  /**
   * Whether the service provides an endpoint to get service bindings.
   * @param bindingsRetrievable bindingsRetrievable or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setBindingsRetrievable(java.lang.Boolean bindingsRetrievable) {
    this.bindingsRetrievable = bindingsRetrievable;
    return this;
  }

  /**
   * Information to activate Dashboard SSO feature.
   * @return value or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1DashboardClient getDashboardClient() {
    return dashboardClient;
  }

  /**
   * Information to activate Dashboard SSO feature.
   * @param dashboardClient dashboardClient or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setDashboardClient(GoogleCloudServicebrokerV1beta1DashboardClient dashboardClient) {
    this.dashboardClient = dashboardClient;
    return this;
  }

  /**
   * Textual description of the service. Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Textual description of the service. Required.
   * @param description description or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * ID is a globally unique identifier used to uniquely identify the service. ID is an opaque
   * string.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * ID is a globally unique identifier used to uniquely identify the service. ID is an opaque
   * string.
   * @param id id or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Whether the service provides an endpoint to get service instances.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInstancesRetrievable() {
    return instancesRetrievable;
  }

  /**
   * Whether the service provides an endpoint to get service instances.
   * @param instancesRetrievable instancesRetrievable or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setInstancesRetrievable(java.lang.Boolean instancesRetrievable) {
    this.instancesRetrievable = instancesRetrievable;
    return this;
  }

  /**
   * A list of metadata for a service offering. Metadata is an arbitrary JSON object.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * A list of metadata for a service offering. Metadata is an arbitrary JSON object.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * User friendly service name. Name must match [a-z0-9]+ regexp. The name must be globally unique
   * within GCP project. Note, which is different from ("This must be globally unique within a
   * platform marketplace"). Required.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * User friendly service name. Name must match [a-z0-9]+ regexp. The name must be globally unique
   * within GCP project. Note, which is different from ("This must be globally unique within a
   * platform marketplace"). Required.
   * @param name name or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Whether the service supports upgrade/downgrade for some plans.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPlanUpdateable() {
    return planUpdateable;
  }

  /**
   * Whether the service supports upgrade/downgrade for some plans.
   * @param planUpdateable planUpdateable or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setPlanUpdateable(java.lang.Boolean planUpdateable) {
    this.planUpdateable = planUpdateable;
    return this;
  }

  /**
   * A list of plans for this service. At least one plan is required.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudServicebrokerV1beta1Plan> getPlans() {
    return plans;
  }

  /**
   * A list of plans for this service. At least one plan is required.
   * @param plans plans or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setPlans(java.util.List<GoogleCloudServicebrokerV1beta1Plan> plans) {
    this.plans = plans;
    return this;
  }

  /**
   * Tags provide a flexible mechanism to expose a classification, attribute, or base technology of
   * a service.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Tags provide a flexible mechanism to expose a classification, attribute, or base technology of
   * a service.
   * @param tags tags or {@code null} for none
   */
  public GoogleCloudServicebrokerV1beta1Service setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  @Override
  public GoogleCloudServicebrokerV1beta1Service set(String fieldName, Object value) {
    return (GoogleCloudServicebrokerV1beta1Service) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudServicebrokerV1beta1Service clone() {
    return (GoogleCloudServicebrokerV1beta1Service) super.clone();
  }

}
