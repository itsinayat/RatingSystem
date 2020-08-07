package com.oyerikshaw.module.ratingservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.oyerikshaw.module.ratingservice.entity.Rating;

public interface RatingRepository extends CrudRepository<Rating, Integer> {
}
