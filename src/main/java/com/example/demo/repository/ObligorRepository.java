package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Obligor;


@Repository
public interface ObligorRepository extends MongoRepository<Obligor, String> {
	
	public Obligor findByFirstName(String firstName);
	
	public List<Obligor> findAllByFirstName(String firstName);
	
	public List<Obligor> findAllByLastName(String lastName);

	public Obligor findByObligorNumber(String obligorNumber);
	
	

	
}
