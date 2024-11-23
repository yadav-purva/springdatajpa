package com.springbootjpa.springdatajpa;

import com.springbootjpa.springdatajpa.entities.Student;
import com.springbootjpa.springdatajpa.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

@SpringBootApplication
public class SpringdatajpaApplication {

	public static void main(String[] args) {


		ApplicationContext context =SpringApplication.run(SpringdatajpaApplication.class, args);
StudentRepo studentRepo=context.getBean(StudentRepo.class);
		Student student=new Student();
		/*student.setName("Yash yadav");
		student.setAddress("Khargone");*/
//save
		studentRepo.save(student);
		System.out.println("Updated Data");

//findAll
		/*List<Student> list=(List<Student>) studentRepo.findAll();
		list.forEach(System.out::println);*/
//findById
/*
		Student st=studentRepo.findById(3).get();
*/
		/*st.setName("Ankur yadav");
		st.setAddress("Khargone(M.P.)");
		System.out.println(st);*/
	/*	studentRepo.delete(st);
		System.out.println("Delete Successfully!!!");*/

		//Pagination
		Pageable pageable=Pageable.ofSize(3);
		Page<Student> page=studentRepo.findAll(pageable);
		System.out.println(page.get());
		System.out.println("------------------------------");
		page.get().forEach(System.out::println);
		System.out.println("Size="+page.getSize());
		System.out.println("Elements="+page.getTotalElements());
		System.out.println("Page="+page.getTotalPages());



	}
}
