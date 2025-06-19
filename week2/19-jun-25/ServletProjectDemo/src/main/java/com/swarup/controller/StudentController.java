package com.swarup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swarup.entity.Student;
import com.swarup.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired                        // StudentService service = new StudentService();
	private StudentService service; 
	
	@PostMapping // CREATE
	public Student create(@RequestBody Student student) {
		return service.saveStudent(student);
		
	}
	
	@GetMapping // READ
	public List<Student> getAll(){
		return service.getAllStudents();
	}
	
	@PutMapping("/{id}") // UPDATE
	public Student update(@PathVariable Long id, @RequestBody Student student) {
		return service.updateStudent(id, student);
		
	}

	@DeleteMapping("/{id}") // DELETE
	public void delete(@PathVariable Long id) {
		service.deleteStudent(id);
	}
}
