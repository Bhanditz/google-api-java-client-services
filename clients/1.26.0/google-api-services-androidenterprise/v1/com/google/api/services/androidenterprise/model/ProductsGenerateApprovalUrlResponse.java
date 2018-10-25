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
 * Model definition for ProductsGenerateApprovalUrlResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play EMM API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductsGenerateApprovalUrlResponse extends com.google.api.client.json.GenericJson {

  /**
   * A URL that can be rendered in an iframe to display the permissions (if any) of a product. This
   * URL can be used to approve the product only once and only within 24 hours of being generated,
   * using the Products.approve call. If the product is currently unapproved and has no permissions,
   * this URL will point to an empty page. If the product is currently approved, a URL will only be
   * generated if that product has added permissions since it was last approved, and the URL will
   * only display those new permissions that have not yet been accepted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * A URL that can be rendered in an iframe to display the permissions (if any) of a product. This
   * URL can be used to approve the product only once and only within 24 hours of being generated,
   * using the Products.approve call. If the product is currently unapproved and has no permissions,
   * this URL will point to an empty page. If the product is currently approved, a URL will only be
   * generated if that product has added permissions since it was last approved, and the URL will
   * only display those new permissions that have not yet been accepted.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * A URL that can be rendered in an iframe to display the permissions (if any) of a product. This
   * URL can be used to approve the product only once and only within 24 hours of being generated,
   * using the Products.approve call. If the product is currently unapproved and has no permissions,
   * this URL will point to an empty page. If the product is currently approved, a URL will only be
   * generated if that product has added permissions since it was last approved, and the URL will
   * only display those new permissions that have not yet been accepted.
   * @param url url or {@code null} for none
   */
  public ProductsGenerateApprovalUrlResponse setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  @Override
  public ProductsGenerateApprovalUrlResponse set(String fieldName, Object value) {
    return (ProductsGenerateApprovalUrlResponse) super.set(fieldName, value);
  }

  @Override
  public ProductsGenerateApprovalUrlResponse clone() {
    return (ProductsGenerateApprovalUrlResponse) super.clone();
  }

}