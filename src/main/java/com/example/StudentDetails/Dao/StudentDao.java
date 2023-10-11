package com.example.StudentDetails.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.StudentDetails.Entity.Students;
import com.example.StudentDetails.Repository.StudentRepository;

@Repository
public class StudentDao {
	@Autowired
	StudentRepository stuRepo;
	public String addstud(Students add) {
		if(add.getAge()>18) {
			stuRepo.save(add);
			return "Added Successfully";
		}
		else {
			return "your age is below 18";
		}
	}
	public List<Students>listall(){
		return stuRepo.findAll();
	}
	public String delete(int d) {
		return "Deleted";
	}

}
