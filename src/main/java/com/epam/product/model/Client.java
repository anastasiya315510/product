/*
 author Anastasiya
 created on 12/07/2021
 */


package com.epam.product.model;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@JsonTypeInfo( use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = GoldClient.class, name = "GOLDEN"),
        @JsonSubTypes.Type(value = SilverClient.class, name = "SILVER"),
        @JsonSubTypes.Type(value = Response.class, name ="REGULAR")
})
public abstract class Client {
  private String firstName;
  private String   lastName;
  private Type type;
  private Long clientId;
  public abstract double getDiscount(Product product);
  public abstract String getDiscountName(Product product);

}
