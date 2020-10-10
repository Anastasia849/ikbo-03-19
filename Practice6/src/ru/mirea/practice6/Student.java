package ru.mirea.practice6;

public class Student implements Comparable <Student> {
    private int IDNumber;
    private int GPA;

    public Student(int IDNumber, int GPA) {
        this.IDNumber = IDNumber;
        this.GPA = GPA;
    }

    public Student() {
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    public int getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(int IDNumber) {
        this.IDNumber = IDNumber;
    }


    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.IDNumber, student.IDNumber);
    }

    @Override
    public String toString() {
        return "Student "+this.IDNumber+" "+this.GPA;
    }

}
