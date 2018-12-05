package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Obligor;
import com.example.demo.repository.ObligorRepository;

@Service
public class ObligorService {

	@Autowired
	ObligorRepository obligorRepository;
	
	public Obligor create(String obn,String fname, String lName) {
		
		return obligorRepository.save(new Obligor(obn,fname, lName));
		
	}
	
	public List<Obligor> getAll(){
		return obligorRepository.findAll();
	}
	
	public Obligor getByFirstName(String fname) {
		return obligorRepository.findByFirstName(fname);
	}
	
	public void deleteAll() {
		obligorRepository.deleteAll();
	}
	
	public void delete(String name) {
		Obligor p = obligorRepository.findByFirstName(name);
		obligorRepository.delete(p);
	}

	public List<Obligor> getAllByFN(String firstName) {
		// TODO Auto-generated method stub
		return obligorRepository.findAllByFirstName(firstName);
	}

	public List<Obligor> getAllByLN(String lastName) {
		// TODO Auto-generated method stub
		return obligorRepository.findAllByLastName(lastName);
	}

	public Obligor getAllByOBN(String obligorNumber) {
		// TODO Auto-generated method stub
		return obligorRepository.findByObligorNumber(obligorNumber);
	}

	

	
}
