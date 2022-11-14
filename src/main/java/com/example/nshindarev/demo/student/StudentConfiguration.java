package com.example.nshindarev.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student daria = new Student(
                    "Daria",
                    LocalDate.of(1991, Month.JULY, 4),
                    "dariachupyrkina@gmail.com"
            );
            Student nikita = new Student(
                    "Nikita",
                    LocalDate.of(1996, Month.JANUARY, 2),
                    "nikitashindarev@gmail.com"
            );

            repository.saveAll(List.of(daria, nikita));
        };
    }

}
