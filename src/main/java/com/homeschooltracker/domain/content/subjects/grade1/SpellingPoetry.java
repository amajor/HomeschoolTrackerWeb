package com.homeschooltracker.domain.content.subjects.grade1;

import com.homeschooltracker.domain.content.Lesson;
import com.homeschooltracker.domain.content.Material;
import com.homeschooltracker.domain.content.Subject;

public class SpellingPoetry extends Subject {
    public SpellingPoetry() {
        name = "Spelling & Poetry, Grade 1";

        // Build Lesson 16
        Lesson lesson16 = new Lesson("Lesson 16");

        // Add Materials for Lesson 16
        Material task1 = new Material("Drawing paper and crayons");
        lesson16.add(task1);

        // Add lesson to this subject.
        this.add(lesson16);
    }
}
