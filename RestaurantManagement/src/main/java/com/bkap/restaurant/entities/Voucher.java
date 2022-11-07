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
@Table(name = "Voucher")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Voucher implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "voucherId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long voucherId;

    @Column(name = "voucherName")
    private String voucherName;

    @Column(name = "description")
    private String description;

    @Column(name = "percent")
    private Double percent;

    @Column(name = "amount")
    private Double amount;

    @Column(name = "type")
    private String type;

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
