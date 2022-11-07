package com.bkap.restaurant.repository;

import com.bkap.restaurant.entities.Combo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComboRepository extends PagingAndSortingRepository<Combo, Long> {
}