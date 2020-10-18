package com.homeschooltracker.domain.users;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParentTest {
    // Initialize test data
    String parentName = "Anya";

    Parent parent = new Parent(parentName);

    @Test
    public void testGetName() {
        assertEquals(parentName, parent.getName());
    }

    @Test
    public void testAddStudent() {
        Student student = new Student("Gwendolyn");
        parent.add(student);

        assertEquals("Gwendolyn", parent.getChild(0).getName());
    }

    @Test
    public void testGetStudentAtPosition() {
        Student student1 = new Student("Gwendolyn");
        Student student2 = new Student("Eustace");
        parent.add(student1);
        parent.add(student2);

        assertEquals("Eustace", parent.getChild(1).getName());
    }
}