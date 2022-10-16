package net.ege.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ege.sms.entity.Student;

/*	first parameter is type of the JPA entity and the second is 
	type of the primary key*/


public interface StudentRepository extends JpaRepository<Student, Long> {
	
}
