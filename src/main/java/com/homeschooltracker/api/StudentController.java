package com.homeschooltracker.api;

import com.homeschooltracker.domain.users.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    private final StudentRepository repository;

    StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    // Aggregate root

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/students")
    List<Student> all() {
        return repository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/students")
    Student newStudent(@RequestBody Student newStudent) {
        return repository.save(newStudent);
    }

    // Single item

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/students/{id}")
    Student one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/students/{id}")
    Student replaceStudent(@RequestBody Student newStudent, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newStudent.getName());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newStudent.setId(id);
                    return repository.save(newStudent);
                });
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
