package com.homeschooltracker.api;

class ParentNotFoundException extends RuntimeException {
    ParentNotFoundException(Long id) {
        super("Could not find parent " + id);
    }
}