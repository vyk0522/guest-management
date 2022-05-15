package com.onejava.dtos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@NoArgsConstructor
@Getter
public class GuestDto implements Serializable {
    private long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    @JsonProperty("postalAddress") // postalAddress during serialization(json string)
    @JsonAlias("address")  // address during deserialization(class)
    private String city;
    private String country;
    private String state;
    @JsonIgnore
    private String phoneNumber;
}
