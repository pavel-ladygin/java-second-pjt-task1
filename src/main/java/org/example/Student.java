package org.example;

abstract class Student {
    String name;
    int course;
    int lastExam;

    public Student(String name, int course, int lastExam) {
        this.name = name;
        this.course = course;
        this.lastExam = lastExam;
    }
    abstract void writeExam();
}