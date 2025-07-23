package com.example.SpringJDBCEx;

import com.example.SpringJDBCEx.model.Student;
import com.example.SpringJDBCEx.service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcExApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(SpringJdbcExApplication.class, args);
		Student s = context.getBean(Student.class);
		s.setMarks(90);
		s.setName("John");
		s.setRollNo(104);
		StudentService service = context.getBean(StudentService.class);
		service.addStudent(s);
		System.out.println(service.getStudents());
	}

}
