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

package com.google.api.services.binaryauthorization.v1beta1.model;

/**
 * An attestator public key that will be used to verify attestations signed by this attestor.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Binary Authorization API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AttestorPublicKey extends com.google.api.client.json.GenericJson {

  /**
   * ASCII-armored representation of a PGP public key, as the entire output by the command `gpg
   * --export --armor foo@example.com` (either LF or CRLF line endings).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String asciiArmoredPgpPublicKey;

  /**
   * Optional. A descriptive comment. This field may be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String comment;

  /**
   * Output only. This field will be overwritten with key ID information, for example, an identifier
   * extracted from a PGP public key. This field may not be updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * ASCII-armored representation of a PGP public key, as the entire output by the command `gpg
   * --export --armor foo@example.com` (either LF or CRLF line endings).
   * @return value or {@code null} for none
   */
  public java.lang.String getAsciiArmoredPgpPublicKey() {
    return asciiArmoredPgpPublicKey;
  }

  /**
   * ASCII-armored representation of a PGP public key, as the entire output by the command `gpg
   * --export --armor foo@example.com` (either LF or CRLF line endings).
   * @param asciiArmoredPgpPublicKey asciiArmoredPgpPublicKey or {@code null} for none
   */
  public AttestorPublicKey setAsciiArmoredPgpPublicKey(java.lang.String asciiArmoredPgpPublicKey) {
    this.asciiArmoredPgpPublicKey = asciiArmoredPgpPublicKey;
    return this;
  }

  /**
   * Optional. A descriptive comment. This field may be updated.
   * @return value or {@code null} for none
   */
  public java.lang.String getComment() {
    return comment;
  }

  /**
   * Optional. A descriptive comment. This field may be updated.
   * @param comment comment or {@code null} for none
   */
  public AttestorPublicKey setComment(java.lang.String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Output only. This field will be overwritten with key ID information, for example, an identifier
   * extracted from a PGP public key. This field may not be updated.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Output only. This field will be overwritten with key ID information, for example, an identifier
   * extracted from a PGP public key. This field may not be updated.
   * @param id id or {@code null} for none
   */
  public AttestorPublicKey setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  @Override
  public AttestorPublicKey set(String fieldName, Object value) {
    return (AttestorPublicKey) super.set(fieldName, value);
  }

  @Override
  public AttestorPublicKey clone() {
    return (AttestorPublicKey) super.clone();
  }

}
