package cse.aakramc.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import cse.aakramc.main.entity.Student;
import cse.aakramc.main.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		/* Student st1 = new Student("Akram", "Chowdhury", "aakramc@gmail.com");
		studentRepository.save(st1);
		
		Student st2 = new Student("Momi", "Chowdhury", "momi21@gmail.com");
		studentRepository.save(st2);
		
		Student st3 = new Student("Thahsin", "Chowdhury", "chytha@gmail.com");
		studentRepository.save(st3);
		*/
	}

}
