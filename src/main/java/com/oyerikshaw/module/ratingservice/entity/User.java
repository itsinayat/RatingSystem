package com.oyerikshaw.module.ratingservice.entity;
import javax.persistence.GeneratedValue;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.GenerationType;
import javax.persistence.Table;
@Entity
@Table(name = "users")
public class User {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   
   @Column(name = "Name")
   private String name;
   
   @Column(name = "Role")
   private String role;
   
   public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

@OneToMany(mappedBy = "user", fetch = FetchType.LAZY,
cascade = CascadeType.ALL)
private Set<Rating> ratings;



public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Rating> getRatings() {
	return ratings;
}
public void setRatings(Set<Rating> ratings) {
	this.ratings = ratings;
}
   
   
}