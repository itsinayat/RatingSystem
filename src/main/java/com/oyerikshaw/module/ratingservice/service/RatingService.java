package com.oyerikshaw.module.ratingservice.service;

import com.oyerikshaw.module.ratingservice.model.RatingRequest;


public interface RatingService {

	public String rate(RatingRequest ratingRequest);
	public int getRating(Integer userId);

}
