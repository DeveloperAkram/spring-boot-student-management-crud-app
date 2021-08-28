package cse.aakramc.main.service.implement;

import java.util.List;

import org.springframework.stereotype.Service;

import cse.aakramc.main.entity.Student;
import cse.aakramc.main.repository.StudentRepository;
import cse.aakramc.main.service.StudentService;

@Service
public class StudentServiceImplement implements StudentService {

	private StudentRepository studentRepository;
	
	
	public StudentServiceImplement(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}


	@Override
	public List<Student> getStudents() {
		
		return studentRepository.findAll();
	}


	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public Student getStudentById(Long id) {
	
		return studentRepository.findById(id).get();
	}


	@Override
	public Student updateStudent(Student student) {
		
		return studentRepository.save(student);
	}


	@Override
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);
		
	}

	
}
