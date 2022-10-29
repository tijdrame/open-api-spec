/*
 * EazyShop Products APIs Definition
 * # About us `Using` this OpenAPI specification, any consumer can understand the _APIs_ that are exposed by **EasyShop** #Categories supported - Mobile   - Apple   - Samsung   - OnePlus - Laptops - TVs - HeadPhones ``` test highlight  multiline ``` 
 *
 * OpenAPI spec version: 0.0.1
 * Contact: support@eazyshop.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.client.model.Product;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * OrderSummary
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-28T23:56:02.208Z[GMT]")
public class OrderSummary implements InlineResponse2001 {
  @SerializedName("products")
  private List<Product> products = null;

  public OrderSummary products(List<Product> products) {
    this.products = products;
    return this;
  }

  public OrderSummary addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<Product>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  @Schema(description = "")
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSummary orderSummary = (OrderSummary) o;
    return Objects.equals(this.products, orderSummary.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSummary {\n");
    
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
