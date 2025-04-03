package org.spring.di.constructorDI.javaBased.pojo;

public class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    @Override
    public String toString(){
        return "Student Id: "+studentId+", Student Name: "+studentName;
    }
}
