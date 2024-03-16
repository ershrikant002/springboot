package com.app.entity;

import jakarta.persistence.Entity;

@Entity
public class Address {
	
	private int id;
	private String address;
	private String cityName;
	private String zipCode;

}
