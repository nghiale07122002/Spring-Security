package com.Spring.mvc.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="user", uniqueConstraints = { @UniqueConstraint(name = "USER_ROLE_UK", columnNames = {"id"})})

public class user1 {
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private long id;
    @Getter
    @Setter
    @Column(name = "fullname", length = 100, nullable = false)
    private String full_name;
    @Column(name = "user_name", length = 50, nullable = false)
    private String user_name;
    @Column(name = "user_password", length = 50, nullable = false)
    private String user_password;
    @Column(name = "email", length = 100, nullable = false)
    private String email;
    @Column(name = "phone", length = 45, nullable = false)
    private String phone;


}
