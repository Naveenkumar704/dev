package com.example.StudentDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentDetails.Entity.Students;
import com.example.StudentDetails.Service.StudentService;

@RestController
@RequestMapping(value="students")
public class StudentController {
	@Autowired
	StudentService stuSer;
	@PostMapping(value="/add")
	public String addstud(@RequestBody Students add) {
		return stuSer.addstud(add);
		
	}
	@GetMapping(value="/all")
	public List<Students> listall(){
		return stuSer.listall();
		
	}
	@DeleteMapping(value="/delete/{del}")
	public String delete(@PathVariable int del) {
		return stuSer.delete(del);
	}
	
	
	

}
