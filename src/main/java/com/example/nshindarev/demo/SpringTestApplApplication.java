package com.example.nshindarev.demo;

import com.example.nshindarev.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cglib.core.Local;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringTestApplApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringTestApplApplication.class, args);
	}
}
