package org.example;

class MathStudent extends Student{
    public MathStudent(String name, int course, int lastExam) {
        super(name, course, lastExam);
    }
    @Override
    void writeExam(){
        System.out.println("MathStudent" + name + "writing exam");
    }
}