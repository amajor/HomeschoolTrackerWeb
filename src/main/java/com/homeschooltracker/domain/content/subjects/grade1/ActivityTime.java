package com.homeschooltracker.domain.content.subjects.grade1;

import com.homeschooltracker.domain.content.Lesson;
import com.homeschooltracker.domain.content.Subject;

public class ActivityTime extends Subject {
    public ActivityTime() {
        name = "Activity Time, Grade 1";

        // Build Lesson 16
        Lesson lesson16 = new Lesson("Lesson 16");

        // Add lesson to this subject.
        this.add(lesson16);
    }
}
