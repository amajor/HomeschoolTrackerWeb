package com.homeschooltracker.api;

import com.homeschooltracker.domain.users.Parent;
import com.homeschooltracker.domain.users.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(ParentRepository pRepo, StudentRepository sRepo) {
        Parent parent = new Parent("Alison");
        Student student1 = new Student("Ewan");
        Student student2 = new Student("Gwynnie");
        
        return args -> {
            log.info("Preloading " + pRepo.save(parent));
            log.info("Preloading " + sRepo.save(student1));
            log.info("Preloading " + sRepo.save(student2));
        };
    }
}
