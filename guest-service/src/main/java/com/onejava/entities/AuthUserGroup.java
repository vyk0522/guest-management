package com.onejava.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "auth_user_group")
public class AuthUserGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "AUTH_USER_GROUP_ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USERNAME", nullable = false, referencedColumnName = "USERNAME")
    private User username;

    @Column(name = "AUTH_GROUP", nullable = false, length = 128)
    private String authGroup;

}