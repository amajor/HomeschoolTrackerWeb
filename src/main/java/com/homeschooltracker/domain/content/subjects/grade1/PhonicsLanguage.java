package com.homeschooltracker.domain.content.subjects.grade1;

import com.homeschooltracker.domain.content.Lesson;
import com.homeschooltracker.domain.content.Material;
import com.homeschooltracker.domain.content.Subject;

public class PhonicsLanguage extends Subject {
    public PhonicsLanguage() {
        name = "Phonics / Language, Grade 1";

        // Build Lesson 16
        Lesson lesson16 = new Lesson("Phonics Lesson 16");

        // Add Materials for Lesson 16
        Material task = new Material("Mini Sheet / Scrap Paper");
        lesson16.add(task);

        // Add lesson to this subject.
        this.add(lesson16);
    }
}
