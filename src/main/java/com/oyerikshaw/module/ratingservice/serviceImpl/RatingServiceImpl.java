	package com.oyerikshaw.module.ratingservice.serviceImpl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oyerikshaw.module.ratingservice.entity.Rating;
import com.oyerikshaw.module.ratingservice.entity.User;
import com.oyerikshaw.module.ratingservice.model.RatingRequest;
import com.oyerikshaw.module.ratingservice.repository.RatingRepository;
import com.oyerikshaw.module.ratingservice.repository.UserRepository;
import com.oyerikshaw.module.ratingservice.service.RatingService;
@Service
public class RatingServiceImpl implements RatingService {
	@Autowired
	RatingRepository ratingRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public String rate(RatingRequest ratingRequest) {
		Integer sourceUserId = ratingRequest.getSourceUserId();
		Integer targetUserId = ratingRequest.getTargetUserId();
		Rating rating =new Rating();
		rating.setRatedBy(sourceUserId);
		rating.setUser(userRepository.findById(targetUserId).get());
		rating.setValue(ratingRequest.getRating());
		ratingRepository.save(rating);
		return "SUCCESS";
	}

	@Override
	public int getRating(Integer userId) {
		User user = userRepository.findById(userId).get();
		Set<Rating> ratings = user.getRatings();
		int ratingSum = 0;
		for (Rating rating : ratings) {
			ratingSum = ratingSum + rating.getValue();
		}
		int avg = ratingSum / ratings.size();
		return avg;
	}

}
