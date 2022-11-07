package com.bkap.restaurant.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Combo")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Combo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "comboId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comboId;

    @Column(name = "comboName")
    private String comboName;

    @Column(name = "price")
    private Double price;

    @Column(name = "description")
    private String description;

    @Column(name = "createdBy")
    private Long createdBy;

    @Column(name = "updatedBy")
    private Long updatedBy;

    @Column(name = "createdAt")
    @CreationTimestamp
    private Date createdAt;

    @Column(name = "updatedAt")
    @UpdateTimestamp
    private Date updatedAt;
}
