package com.onejava.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "guest")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GUEST_ID", nullable = false)
    private Long id;

    @Column(name = "FIRST_NAME", length = 64)
    private String firstName;

    @Column(name = "LAST_NAME", length = 64)
    private String lastName;

    @Column(name = "EMAIL_ADDRESS", length = 64)
    private String emailAddress;

    @Column(name = "ADDRESS", length = 64)
    private String address;

    @Column(name = "COUNTRY", length = 32)
    private String country;

    @Column(name = "STATE", length = 12)
    private String state;

    @Column(name = "PHONE_NUMBER", length = 24)
    private String phoneNumber;

}