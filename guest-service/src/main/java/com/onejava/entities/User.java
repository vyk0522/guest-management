package com.onejava.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID", nullable = false)
    private Long id;

    @Column(name = "USERNAME", nullable = false, length = 128)
    private String username;

    @Column(name = "PASSWORD", nullable = false, length = 256)
    private String password;

    @OneToMany(mappedBy = "username")
    private Set<AuthUserGroup> authUserGroups = new LinkedHashSet<>();

}