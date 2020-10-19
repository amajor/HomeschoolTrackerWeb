package com.homeschooltracker.api;

import com.homeschooltracker.domain.users.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

interface ParentRepository extends JpaRepository<Parent, Long> {
    //    Supports:
    //      * Creating new instances
    //      * Updating existing ones
    //      * Deleting
    //      * Finding (one, all, by simple or complex properties)
}
