package cse.aakramc.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cse.aakramc.main.entity.Student;
import cse.aakramc.main.service.StudentService;

@Controller
public class StudentController {

	
	private StudentService studentService;

	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	// handle method to handle list students and return mode and view
	@GetMapping("/students")
	public String listStudents(Model m) {
		m.addAttribute("students", studentService.getStudents());
		
		return "students";
	}
	
	@GetMapping("/students/new")
	public String createStudentForm (Model m) {
		
		// create student object to hold student from data
		Student student = new Student ();
		m.addAttribute("student", student);
		
		return "create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student) {
		studentService.saveStudent(student);
		return "redirect:/students";
	}
	
	@GetMapping ("/students/edit/{id}")
	public String editStudentForm (@PathVariable Long id, Model m) {
		
		m.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model m) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		// save update student object
		studentService.updateStudent(existingStudent);
		
		return "redirect:/students";
	}
	
	// handle method to handle delete student request
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		
		studentService.deleteStudentById(id);
		return "redirect:/students";
	}
}
