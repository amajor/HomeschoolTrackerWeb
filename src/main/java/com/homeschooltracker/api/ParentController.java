package com.homeschooltracker.api;

import com.homeschooltracker.domain.users.Parent;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ParentController {
    private final ParentRepository repository;

    ParentController(ParentRepository repository) {
        this.repository = repository;
    }

    // Aggregate root

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/parents")
    List<Parent> all() {
        return repository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/parents")
    Parent newParent(@RequestBody Parent newParent) {
        return repository.save(newParent);
    }

    // Single item

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/parents/{id}")
    Parent one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new ParentNotFoundException(id));
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/parents/{id}")
    Parent replaceParent(@RequestBody Parent newParent, @PathVariable Long id) {

        return repository.findById(id)
                .map(employee -> {
                    employee.setName(newParent.getName());
                    return repository.save(employee);
                })
                .orElseGet(() -> {
                    newParent.setId(id);
                    return repository.save(newParent);
                });
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/parents/{id}")
    void deleteParent(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
