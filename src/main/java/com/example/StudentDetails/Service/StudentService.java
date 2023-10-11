package com.example.StudentDetails.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.StudentDetails.Dao.StudentDao;
import com.example.StudentDetails.Entity.Students;

@Service
public class StudentService {
@Autowired
StudentDao stuDao;
public String addstud(Students add) {
	return stuDao.addstud(add);
}
public List<Students>listall(){
	return stuDao.listall();
}
public String delete(int del) {
	
	return stuDao.delete(del);
}

}
