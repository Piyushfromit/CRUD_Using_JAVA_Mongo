package com.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.crud.entity.Student;

@Repository
public interface StudentRepositorty extends MongoRepository<Student, Integer> {
	
	
	
	

}
