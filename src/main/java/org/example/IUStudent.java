package org.example;

class IUStudent extends Student{
    public IUStudent(String name, int course, int lastExam) {
        super(name, course, lastExam);
    }
    @Override
    void writeExam(){
        System.out.println("IUStudent" + name + "writing exam");
    }
}