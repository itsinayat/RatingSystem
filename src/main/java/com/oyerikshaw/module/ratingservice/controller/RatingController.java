package com.oyerikshaw.module.ratingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.oyerikshaw.module.ratingservice.model.RatingRequest;
import com.oyerikshaw.module.ratingservice.service.RatingService;

@RestController
@RequestMapping("/rating")
public class RatingController {
	
	@Autowired
	private RatingService ratingService;

	@RequestMapping(value = "/rate", method = RequestMethod.POST)
	public ResponseEntity<String> initiateRefund(@RequestBody RatingRequest ratingRequest) {
		String response = ratingService.rate(ratingRequest);
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getRating/{id}", method = RequestMethod.GET)
	public ResponseEntity<Integer> initiateRefund(@PathVariable("id") String id) {
		int rating = ratingService.getRating(Integer.parseInt(id));
		return new ResponseEntity<>(rating, HttpStatus.OK);
	}

}
