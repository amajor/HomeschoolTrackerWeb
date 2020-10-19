package com.homeschooltracker.api;

class StudentNotFoundException extends RuntimeException {
    StudentNotFoundException(Long id) {
        super("Could not find student " + id);
    }
}