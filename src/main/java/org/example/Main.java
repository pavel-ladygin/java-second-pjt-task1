package org.example;

public class Main {
    //test
    public static void main(String[] args) {
        Student iuStudent = new IUStudent("Ladygin Pavel Nikolaivich", 1, 4);
        Student mathStudent = new MathStudent("Olecsenco Vladimir Denisovich", 1, 3);

        iuStudent.writeExam();
        mathStudent.writeExam();
    }
}