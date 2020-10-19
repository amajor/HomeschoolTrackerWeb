package com.homeschooltracker.domain.users;

import com.homeschooltracker.domain.content.Task;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Parent {
    private @Id @GeneratedValue Long id;
    private String name;
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public Parent() {}
    public Parent(String name)
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

    public void add(Student student) {
        studentArrayList.add(student);
    }

    public Student getChild(int position) {
        return studentArrayList.get(position);
    }

    public void print() {
        System.out.println("\nParent: " + getName());
    }

    public void printTasks() {
        System.out.println("\n TODO LIST FOR " + getName());
        System.out.println("==========================================");

        Iterator<Student> iterator = studentArrayList.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println("\n|  PREPARE/GRADE ITEMS FOR " + student.getName());
            System.out.println("------------------------------------------");

            ArrayList<Task> subjects = student.getTaskArrayList();
            subjects.forEach(
                (subject) -> subject.printParentTasks()
            );
        }
    }

    @Override
    public boolean equals(Object o) {

        if (this == o)
            return true;
        if (!(o instanceof Parent))
            return false;
        Parent parent = (Parent) o;
        return Objects.equals(this.id, parent.id) && Objects.equals(this.name, parent.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name);
    }

    @Override
    public String toString() {
        return String.format("Parent{id='%d', name='%s'}", id, name);
    }
}
