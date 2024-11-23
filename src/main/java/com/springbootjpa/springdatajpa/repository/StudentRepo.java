package com.springbootjpa.springdatajpa.repository;

import com.springbootjpa.springdatajpa.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Integer> {
}
