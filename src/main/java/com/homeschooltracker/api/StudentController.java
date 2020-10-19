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

    @GetMapping("/students")
    List<Student> all() {
        return repository.findAll();
    }

    @PostMapping("/students")
    Student newStudent(@RequestBody Student newStudent) {
        return repository.save(newStudent);
    }

    // Single item

    @GetMapping("/students/{id}")
    Student one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

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

    @DeleteMapping("/students/{id}")
    void deleteStudent(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
