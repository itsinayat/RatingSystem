package com.oyerikshaw.module.ratingservice.repository;

import org.springframework.data.repository.CrudRepository;

import com.oyerikshaw.module.ratingservice.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
