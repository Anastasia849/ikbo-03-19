package ru.mirea.practice9;

import java.util.ArrayList;

public class LabClass {
    private final ArrayList<Student> studentArrayList;
    Student requiredStudent = null;

    public LabClass() {
        this.studentArrayList = new ArrayList<>();
    }

    public void add(Student student) {
        studentArrayList.add(student);
        studentArrayList.sort(Student::compareTo);
    }

    public Student find(String name) throws StudentNotFoundException {

        studentArrayList.forEach(student -> {
            if (student.getName().equals(name))
                requiredStudent = student;
        });
        if (requiredStudent == null) {
            throw new StudentNotFoundException("Студент " + name + " не найден!");
        }
        return requiredStudent;
    }

    public Student remove() {
        return studentArrayList.remove(0);
    }

    public boolean isEmpty() {
        return studentArrayList.isEmpty();
    }
}
