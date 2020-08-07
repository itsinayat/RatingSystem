package com.oyerikshaw.module.ratingservice.model;

public class RatingRequest {
	private Integer sourceUserId;
	private Integer targetUserId;
	private Integer rating;
	public Integer getSourceUserId() {
		return sourceUserId;
	}
	public void setSourceUserId(Integer sourceUserId) {
		this.sourceUserId = sourceUserId;
	}
	public Integer getTargetUserId() {
		return targetUserId;
	}
	public void setTargetUserId(Integer targetUserId) {
		this.targetUserId = targetUserId;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
}
