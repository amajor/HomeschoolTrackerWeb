package com.homeschooltracker.domain.content.subjects.grade1;

import com.homeschooltracker.domain.content.Lesson;
import com.homeschooltracker.domain.content.Material;
import com.homeschooltracker.domain.content.Subject;

public class Writing extends Subject {
    public Writing() {
        name = "Writing, Grade 1";

        // Build Lesson 16
        Lesson lesson16 = new Lesson("Writing Lesson 16");

        // Add Materials for Lesson 16
        Material task1 = new Material("Writing Tablet page");
        lesson16.add(task1);
        Material task2 = new Material("Another writing task");
        lesson16.add(task2);

        // Add lesson to this subject.
        this.add(lesson16);
    }
}
