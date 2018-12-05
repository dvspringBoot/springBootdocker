package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ObligorService;
import com.example.demo.model.Obligor;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;

@RestController
public class ObligorController {
	
	@Autowired
	private ObligorService obligorService;
	
	@RequestMapping("/create")
	public String create(@RequestParam String obn,@RequestParam String fName,@RequestParam String lName) {
		Obligor o = obligorService.create(obn, fName, lName);
		return o.toString();
	}
	
	@RequestMapping("/getByFN")
	public List<Obligor> getObligorByFn(@RequestParam String firstName) {
		
		
		return obligorService.getAllByFN(firstName);
		
	}
	
	@RequestMapping("/getByLN")
	public List<Obligor> getObligorByLn(@RequestParam String lastName) {
		
		
		return obligorService.getAllByLN(lastName);
		
	}
	
	@RequestMapping("/getByOBN")
	public Obligor getObligorByOBN(@RequestParam String obligorNumber) {
		
		
		return obligorService.getAllByOBN(obligorNumber);
		
	}
	
	@RequestMapping("/getAll")
	public List<Obligor> getAll(){
		return obligorService.getAll();
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam String name) {
		
		obligorService.delete(name);
		return "Deleted"+ name;
	}
	
	@RequestMapping("/deleteAll")
	public String deleteAll() {
		obligorService.deleteAll();
		return "Deleted All Record";
	}

}
