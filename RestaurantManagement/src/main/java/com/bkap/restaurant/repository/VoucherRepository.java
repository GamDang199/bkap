package com.bkap.restaurant.repository;

import com.bkap.restaurant.entities.Voucher;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VoucherRepository extends PagingAndSortingRepository<Voucher, Long> {
}