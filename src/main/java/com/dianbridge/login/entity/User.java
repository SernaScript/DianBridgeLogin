package com.dianbridge.login.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="user")
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User {
    public String getRole;
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private String password;
    private String role;
}
