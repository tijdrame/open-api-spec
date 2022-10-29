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
import org.threeten.bp.LocalDate;
/**
 * Laptop
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2022-10-28T23:56:02.208Z[GMT]")
public class Laptop extends Product implements OneOfoneOfOrderBodyProducts {
  /**
   * Gets or Sets ram
   */
  @JsonAdapter(RamEnum.Adapter.class)
  public enum RamEnum {
    _8_GB("8 GB"),
    _16_GB("16 GB"),
    _32_GB("32 GB");

    private String value;

    RamEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RamEnum fromValue(String input) {
      for (RamEnum b : RamEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RamEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RamEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public RamEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return RamEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("ram")
  private RamEnum ram = null;

  public Laptop ram(RamEnum ram) {
    this.ram = ram;
    return this;
  }

   /**
   * Get ram
   * @return ram
  **/
  @Schema(required = true, description = "")
  public RamEnum getRam() {
    return ram;
  }

  public void setRam(RamEnum ram) {
    this.ram = ram;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Laptop laptop = (Laptop) o;
    return Objects.equals(this.ram, laptop.ram) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ram, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Laptop {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
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
