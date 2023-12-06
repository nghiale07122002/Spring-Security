package com.Spring.mvc.Model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="role", uniqueConstraints = { @UniqueConstraint(name = "USER_ROLE_UK", columnNames = {"role_id"})})

public class role {
    @Getter
    @Setter
    @Id
    @GeneratedValue
    @Column(name = "role_id", nullable = false)
    private long role_id;
    @Column(name = "role_name", length = 100, nullable = false)
    private String role_name;


}
