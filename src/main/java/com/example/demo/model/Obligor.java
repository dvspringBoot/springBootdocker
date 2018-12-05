package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Obligor {
	
	@Id
	String id;
	
	@Indexed(unique = true)
	String obligorNumber;
	String firstName;
	String lastName;
	public Obligor(String obligorNumber, String firstName, String lastName) {
		super();
		this.obligorNumber = obligorNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getObligorNumber() {
		return obligorNumber;
	}
	public void setObligorNumber(String obligorNumber) {
		this.obligorNumber = obligorNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Obligor [obligorNumber=" + obligorNumber + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
	

}
