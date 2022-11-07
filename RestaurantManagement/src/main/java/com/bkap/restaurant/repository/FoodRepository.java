package com.bkap.restaurant.repository;

import com.bkap.restaurant.entities.Food;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends PagingAndSortingRepository<Food, Long> {
}