package com.bkap.restaurant.repository;

import com.bkap.restaurant.entities.Desk;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeskRepository extends PagingAndSortingRepository<Desk, Long> {
}