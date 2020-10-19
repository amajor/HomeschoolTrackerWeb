package com.homeschooltracker.api;

import com.homeschooltracker.domain.users.Student;
import org.springframework.data.jpa.repository.JpaRepository;

interface StudentRepository extends JpaRepository<Student, Long> {
    //    Supports:
    //      * Creating new instances
    //      * Updating existing ones
    //      * Deleting
    //      * Finding (one, all, by simple or complex properties)
}
