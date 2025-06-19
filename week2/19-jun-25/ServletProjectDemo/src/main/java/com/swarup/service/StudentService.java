package com.swarup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.swarup.entity.Student;
import com.swarup.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository repository;
	
	public Student saveStudent(Student student){
		return repository.save(student); // insert into Student(name,email,age) values(?,?,?);// CREATE //POST
		
	}
	public List<Student> getAllStudents(){
		return repository.findAll(); // select * from student; // READ // GET
		
	}
	public Student updateStudent(Long id, Student std) {  // UPDATE // PUT
		
		Student existing = repository.findById(id).orElse(null);
		if(existing != null) {
			existing.setName(std.getName());
			existing.setEmail(std.getEmail());
			existing.setAge(std.getAge());
			return repository.save(existing);
			}
		return null;	
	}
	public void deleteStudent(Long id) { 
		repository.deleteById(id); // delete student where id = ?; // DELETE
	}
}
