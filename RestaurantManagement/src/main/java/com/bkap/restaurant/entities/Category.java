package com.bkap.restaurant.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name = "Category")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Category implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "cateId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cateId;

    @Column(name = "cateName")
    private String cateName;

    @Column(name = "description")
    private String description;

    @Column(name = "createdBy")
    private Integer createdBy;

    @Column(name = "updatedBy")
    private Integer updatedBy;

    @Column(name = "createdAt")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updatedAt")
    @UpdateTimestamp
    private Date updatedAt;
}
