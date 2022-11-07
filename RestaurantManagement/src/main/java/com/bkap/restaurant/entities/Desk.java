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
@Table(name = "Desk")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Desk implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "deskId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long deskId;

    @Column(name = "deskName")
    private String deskName;

    @Column(name = "maxCustomer")
    private Integer maxCustermer;

    @Column(name =  "description")
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
