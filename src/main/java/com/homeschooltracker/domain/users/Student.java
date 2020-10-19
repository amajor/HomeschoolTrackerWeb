package com.homeschooltracker.domain.users;

import com.homeschooltracker.domain.content.Task;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

@Entity
public class Student {
    private @Id @GeneratedValue Long id;
    private String name;
    private ArrayList<Task> taskArrayList = new ArrayList<>();

    public Student() {}
    public Student(String name)
    {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Task subject) {
        taskArrayList.add(subject);
    }

    public Task getChild(int position) {
        return taskArrayList.get(position);
    }

    public ArrayList<Task> getTaskArrayList() {
        return taskArrayList;
    }

    public void print() {
        System.out.println("\nStudent: " + getName());
    }

    public void printTasks() {
        System.out.println("\n TODO LIST FOR " + getName());
        System.out.println("==========================================");

        Iterator<Task> iterator = taskArrayList.iterator();
        while (iterator.hasNext()) {
            Task subject = iterator.next();
            ArrayList<Task> tasks = subject.getStudentTaskArrayList();
            if(tasks.size() > 0) {
                System.out.println("\n" + subject.getName());
            }
            tasks.forEach(
                (task) -> task.printStudentTasks()
            );
        }
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Student))
            return false;
        Student student = (Student) o;
        return Objects.equals(this.id, student.id) && Objects.equals(this.name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
        return String.format("Student{id='%d', name='%s'}", id, name);
    }
}
