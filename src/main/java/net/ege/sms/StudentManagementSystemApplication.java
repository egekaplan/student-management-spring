package net.ege.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.ege.sms.entity.Student;
import net.ege.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {

		/*
		 * Student student1 = new Student("Ege", "Kaplan", "egekaplann@gmail.com");
		 * studentRepository.save(student1);
		 * 
		 * Student student2 = new Student("Gurcan", "Kaplan",
		 * "gurcankaplann@gmail.com"); studentRepository.save(student2);
		 * 
		 * Student student3 = new Student("Meryem", "Kaplan",
		 * "meryemkaplann@gmail.com"); studentRepository.save(student3);
		 * 
		 * Student student4 = new Student("Beril", "Corum", "berilcorum@gmail.com");
		 * studentRepository.save(student4);
		 * 
		 * Student student5 = new Student("Bora", "Corum", "boracorum@gmail.com");
		 * studentRepository.save(student5);
		 * 
		 * Student student6 = new Student("Aycan", "Corum", "aycancorum@gmail.com");
		 * studentRepository.save(student6);
		 * 
		 * Student student7 = new Student("Kaan", "Corum", "kaancorum@gmail.com");
		 * studentRepository.save(student7);
		 * 
		 * Student student8 = new Student("Ecem", "Kirimlikurt", "ecnak@gmail.com");
		 * studentRepository.save(student8);
		 */

	}

}
