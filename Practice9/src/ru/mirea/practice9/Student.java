package ru.mirea.practice9;

public class Student implements Comparable<Student> {
    private int GPA;
    private String name;

    public Student( String name,int GPA) {
        this.GPA = GPA;
        this.name = name;
    }


    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }





    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.GPA, student.GPA);
    }

    @Override
    public String toString() {
        return "Student "+this.name+" "+ this.GPA;
    }

}
