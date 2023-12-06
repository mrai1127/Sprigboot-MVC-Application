package com.rai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rai.entity.Student;
import com.rai.repository.StudentRepository;

@SpringBootApplication
public class SpringbootMvcApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMvcApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Mausam", "Rai", "mau@sam.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("Sumi", "Rai", "sumi@sam.com");
//		studentRepository.save(student2);
		
	}

}
