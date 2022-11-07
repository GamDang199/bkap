package com.bkap.restaurant.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class User {

    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long userId;

    @Column(name = "fullName")
    private String fullName;

    @Column(name = "email")
    private String email;

    @JsonIgnore
    @Column(name = "password")
    private String password;

    @Column(name = "phoneNumber")
    private String phoneNumber;

    @Column(name = "address")
    private String address;

    @Column(name = "role")
    private Role role;

    @Column(name = "createdBy")
    private Integer createdBy;

    @Column(name = "updatedBy")
    private Integer updatedBy;

    @Column(name = "createdAt", nullable = false, updatable = false)
    @CreationTimestamp
    private Date createdAt;

    @UpdateTimestamp
    @Column(name = "updatedAt")
    private LocalDateTime updatedAt;

    public enum Role {
        ADMIN,
        STAFF,
        CUSTOMER
    }

}
