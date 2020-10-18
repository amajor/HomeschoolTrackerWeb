package com.homeschooltracker.domain.users;

import com.homeschooltracker.domain.content.subjects.grade1.ReadingAmLevel2;
import com.homeschooltracker.domain.content.subjects.grade1.Seatwork;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTest {
    // Initialize test data
    String studentName = "Eustace";

    Student student = new Student(studentName);

    @Test
    public void testGetName() {
        assertEquals(studentName, student.getName());
    }

    @Test
    public void testAddSubject() {
        ReadingAmLevel2 subject = new ReadingAmLevel2();
        student.add(subject);

        assertEquals("Reading AM 2, Grade 1", student.getChild(0).getName());
    }

    @Test
    public void testGetSubjectAtPosition() {
        ReadingAmLevel2 subject1 = new ReadingAmLevel2();
        student.add(subject1);
        Seatwork subject2 = new Seatwork();
        student.add(subject2);

        assertEquals("Seatwork, Grade 1", student.getChild(1).getName());
    }
}