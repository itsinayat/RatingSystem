package com.oyerikshaw.module.ratingservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.oyerikshaw.module.ratingservice.entity.User;
import com.oyerikshaw.module.ratingservice.repository.UserRepository;
@Component
public class DataLoader implements ApplicationRunner {
	
	@Autowired
	private UserRepository userRepository;

	public void run(ApplicationArguments args) {
		User driver = new  User();
		driver.setId(1);
		driver.setName("DRIVER");
		driver.setRole("DRIVER");
		userRepository.save(driver);
		User rider = new  User();
		rider.setId(2);
		rider.setName("RIDER");
		rider.setRole("RIDER");
		userRepository.save(rider);
	}
}