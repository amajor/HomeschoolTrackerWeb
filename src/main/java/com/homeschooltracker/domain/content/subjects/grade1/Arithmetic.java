package com.homeschooltracker.domain.content.subjects.grade1;

import com.homeschooltracker.domain.content.Lesson;
import com.homeschooltracker.domain.content.Material;
import com.homeschooltracker.domain.content.Subject;

public class Arithmetic extends Subject {
    public Arithmetic() {
        name = "Arithmetic, Grade 1";

        // Build Lesson 16
        Lesson lesson16 = new Lesson("Arithmetic Lesson 16");

        // Add Materials for Lesson 16
        Material task1 = new Material("Objects for counting");
        lesson16.add(task1);

        Material task2 = new Material("Mini Sheet / Scrap Paper");
        lesson16.add(task2);

        Material task3 = new Material("Lesson 16 Speed Drill (p6)");
        lesson16.add(task3);

        Material task4 = new Material("Arithmetic p31-32");
        lesson16.add(task4);

        // Add lesson to this subject.
        this.add(lesson16);
    }
}
