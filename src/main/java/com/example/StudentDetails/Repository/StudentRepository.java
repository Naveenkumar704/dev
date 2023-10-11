package com.example.StudentDetails.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentDetails.Entity.Students;

public interface StudentRepository extends JpaRepository<Students,Integer> {

}
