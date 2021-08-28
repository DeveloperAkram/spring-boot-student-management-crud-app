package cse.aakramc.main.service;

import java.util.List;

import cse.aakramc.main.entity.Student;

public interface StudentService {
	
	List<Student> getStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
	void deleteStudentById (Long id);
	
}
