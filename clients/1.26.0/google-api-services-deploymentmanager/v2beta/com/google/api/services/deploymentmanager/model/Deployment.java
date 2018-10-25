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

package com.google.api.services.deploymentmanager.model;

/**
 * Model definition for Deployment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Deployment Manager API V2Beta Methods.
 * For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Deployment extends com.google.api.client.json.GenericJson {

  /**
   * An optional user-provided description of the deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Provides a fingerprint to use in requests to modify a deployment, such as update(), stop(), and
   * cancelPreview() requests. A fingerprint is a randomly generated value that must be provided
   * with update(), stop(), and cancelPreview() requests to perform optimistic locking. This ensures
   * optimistic concurrency so that only one request happens at a time.
   *
   * The fingerprint is initially generated by Deployment Manager and changes after every request to
   * modify data. To get the latest fingerprint value, perform a get() request to a deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * Output only. Unique identifier for the resource; defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Output only. Timestamp when the deployment was created, in RFC3339 text format .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String insertTime;

  /**
   * Map of labels; provided by the client when the resource is created or updated. Specifically:
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63 characters long
   * and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DeploymentLabelEntry> labels;

  /**
   * Output only. URL of the manifest representing the last manifest that was successfully deployed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String manifest;

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The Operation that most recently ran, or is currently running, on this deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Operation operation;

  /**
   * Output only. Self link for the deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Input Only] The parameters that define your deployment, including the deployment configuration
   * and relevant templates.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetConfiguration target;

  /**
   * Output only. If Deployment Manager is currently updating or previewing an update to this
   * deployment, the updated configuration appears here.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeploymentUpdate update;

  /**
   * An optional user-provided description of the deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional user-provided description of the deployment.
   * @param description description or {@code null} for none
   */
  public Deployment setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Provides a fingerprint to use in requests to modify a deployment, such as update(), stop(), and
   * cancelPreview() requests. A fingerprint is a randomly generated value that must be provided
   * with update(), stop(), and cancelPreview() requests to perform optimistic locking. This ensures
   * optimistic concurrency so that only one request happens at a time.
   *
   * The fingerprint is initially generated by Deployment Manager and changes after every request to
   * modify data. To get the latest fingerprint value, perform a get() request to a deployment.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Provides a fingerprint to use in requests to modify a deployment, such as update(), stop(), and
   * cancelPreview() requests. A fingerprint is a randomly generated value that must be provided
   * with update(), stop(), and cancelPreview() requests to perform optimistic locking. This ensures
   * optimistic concurrency so that only one request happens at a time.
   *
   * The fingerprint is initially generated by Deployment Manager and changes after every request to
   * modify data. To get the latest fingerprint value, perform a get() request to a deployment.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Provides a fingerprint to use in requests to modify a deployment, such as update(), stop(), and
   * cancelPreview() requests. A fingerprint is a randomly generated value that must be provided
   * with update(), stop(), and cancelPreview() requests to perform optimistic locking. This ensures
   * optimistic concurrency so that only one request happens at a time.
   *
   * The fingerprint is initially generated by Deployment Manager and changes after every request to
   * modify data. To get the latest fingerprint value, perform a get() request to a deployment.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public Deployment setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Provides a fingerprint to use in requests to modify a deployment, such as update(), stop(), and
   * cancelPreview() requests. A fingerprint is a randomly generated value that must be provided
   * with update(), stop(), and cancelPreview() requests to perform optimistic locking. This ensures
   * optimistic concurrency so that only one request happens at a time.
   *
   * The fingerprint is initially generated by Deployment Manager and changes after every request to
   * modify data. To get the latest fingerprint value, perform a get() request to a deployment.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public Deployment encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * Output only. Unique identifier for the resource; defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * Output only. Unique identifier for the resource; defined by the server.
   * @param id id or {@code null} for none
   */
  public Deployment setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Output only. Timestamp when the deployment was created, in RFC3339 text format .
   * @return value or {@code null} for none
   */
  public java.lang.String getInsertTime() {
    return insertTime;
  }

  /**
   * Output only. Timestamp when the deployment was created, in RFC3339 text format .
   * @param insertTime insertTime or {@code null} for none
   */
  public Deployment setInsertTime(java.lang.String insertTime) {
    this.insertTime = insertTime;
    return this;
  }

  /**
   * Map of labels; provided by the client when the resource is created or updated. Specifically:
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63 characters long
   * and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?
   * @return value or {@code null} for none
   */
  public java.util.List<DeploymentLabelEntry> getLabels() {
    return labels;
  }

  /**
   * Map of labels; provided by the client when the resource is created or updated. Specifically:
   * Label keys must be between 1 and 63 characters long and must conform to the following regular
   * expression: [a-z]([-a-z0-9]*[a-z0-9])? Label values must be between 0 and 63 characters long
   * and must conform to the regular expression ([a-z]([-a-z0-9]*[a-z0-9])?)?
   * @param labels labels or {@code null} for none
   */
  public Deployment setLabels(java.util.List<DeploymentLabelEntry> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Output only. URL of the manifest representing the last manifest that was successfully deployed.
   * @return value or {@code null} for none
   */
  public java.lang.String getManifest() {
    return manifest;
  }

  /**
   * Output only. URL of the manifest representing the last manifest that was successfully deployed.
   * @param manifest manifest or {@code null} for none
   */
  public Deployment setManifest(java.lang.String manifest) {
    this.manifest = manifest;
    return this;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource; provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression [a-z]([-a-z0-9]*[a-z0-9])? which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Deployment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The Operation that most recently ran, or is currently running, on this deployment.
   * @return value or {@code null} for none
   */
  public Operation getOperation() {
    return operation;
  }

  /**
   * Output only. The Operation that most recently ran, or is currently running, on this deployment.
   * @param operation operation or {@code null} for none
   */
  public Deployment setOperation(Operation operation) {
    this.operation = operation;
    return this;
  }

  /**
   * Output only. Self link for the deployment.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * Output only. Self link for the deployment.
   * @param selfLink selfLink or {@code null} for none
   */
  public Deployment setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Input Only] The parameters that define your deployment, including the deployment configuration
   * and relevant templates.
   * @return value or {@code null} for none
   */
  public TargetConfiguration getTarget() {
    return target;
  }

  /**
   * [Input Only] The parameters that define your deployment, including the deployment configuration
   * and relevant templates.
   * @param target target or {@code null} for none
   */
  public Deployment setTarget(TargetConfiguration target) {
    this.target = target;
    return this;
  }

  /**
   * Output only. If Deployment Manager is currently updating or previewing an update to this
   * deployment, the updated configuration appears here.
   * @return value or {@code null} for none
   */
  public DeploymentUpdate getUpdate() {
    return update;
  }

  /**
   * Output only. If Deployment Manager is currently updating or previewing an update to this
   * deployment, the updated configuration appears here.
   * @param update update or {@code null} for none
   */
  public Deployment setUpdate(DeploymentUpdate update) {
    this.update = update;
    return this;
  }

  @Override
  public Deployment set(String fieldName, Object value) {
    return (Deployment) super.set(fieldName, value);
  }

  @Override
  public Deployment clone() {
    return (Deployment) super.clone();
  }

}