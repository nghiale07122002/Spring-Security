package com.Spring.mvc.Model;

import javax.persistence.*;

@Entity
@Table(name="user_role", uniqueConstraints = { @UniqueConstraint(name = "USER_ROLE_UK", columnNames = {"id", "role_id"})})

public class userrole {
    @Id
    @GeneratedValue
    @Column(name = "id_role2", nullable = false)
    private long id_role2;

    ;;
    private long id;
    ;;
    private long role_id;
}
