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

    @GetMapping("/parents")
    List<Parent> all() {
        return repository.findAll();
    }

    @PostMapping("/parents")
    Parent newParent(@RequestBody Parent newParent) {
        return repository.save(newParent);
    }

    // Single item

    @GetMapping("/parents/{id}")
    Parent one(@PathVariable Long id) {

        return repository.findById(id)
                .orElseThrow(() -> new ParentNotFoundException(id));
    }

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

    @DeleteMapping("/parents/{id}")
    void deleteParent(@PathVariable Long id) {
        repository.deleteById(id);
    }
}
