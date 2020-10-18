package com.homeschooltracker.domain.content.subjects.grade1;

import com.homeschooltracker.domain.content.Lesson;
import com.homeschooltracker.domain.content.Material;
import com.homeschooltracker.domain.content.Subject;

public class Seatwork extends Subject {
    public Seatwork() {
        name = "Seatwork, Grade 1";

        // Build Lesson 16
        Lesson lesson16 = new Lesson("Seatwork Lesson 16");

        // Add Materials for Lesson 16
        Material task1 = new Material("Arithmetic 1, Page 31");
        lesson16.add(task1);
        Material task2 = new Material("Letters and Sounds 1, page 16");
        lesson16.add(task2);
        Material task3 = new Material("Language 1, page 16");
        lesson16.add(task3);
        Material task4 = new Material("Bible Friends, page 13");
        lesson16.add(task4);
        Material task5 = new Material("Count the pens in your mug. Write it on your AR worksheet.");
        lesson16.add(task5);
        Material task6 = new Material("Writing Tablet: see sample from Lesson 15");
        lesson16.add(task6);
        Material task7 = new Material("Draw a picture of your classroom.");
        lesson16.add(task7);

        // Add lesson to this subject.
        this.add(lesson16);
    }
}
