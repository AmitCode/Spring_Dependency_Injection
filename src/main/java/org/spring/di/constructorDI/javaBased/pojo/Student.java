package org.spring.di.constructorDI.javaBased.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {
    private int studentId;
    private String studentName;
    private List<Integer> studentBookId;
    //private Map<String,String> studentAddress;
    //private  Map<String,Map<String,String>> studentAddress;
//    private StudentAddress studentAddress;
    private Map<String,StudentAddress> studentAddress = new HashMap<>();

    public Student(int studentId, String studentName,List<Integer> studentBookId,Map<String,StudentAddress> studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentBookId = studentBookId;
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString(){
        return "Student Id: "+studentId+", Student Name: "+studentName;
    }

    public void showDetails(){
        System.out.println(toString());
        System.out.print("Book Ids:-->: ");
        for(int bookId : studentBookId){
            System.out.print(bookId + " ");
        }
        System.out.println();
//        System.out.println("Address:--->  ");
//        for(Map.Entry<String,String> address: studentAddress.entrySet()){
//            System.out.println(address.getKey() + "---->: "+address.getValue());
//        }

//        for(Map.Entry<String,Map<String,String>> addresses: studentAddress.entrySet()){
//            System.out.print(addresses.getKey() + "---->: ");
//            for (Map.Entry<String,String> address : addresses.getValue().entrySet()){
//                System.out.print(address.getKey() + ": " + address.getValue() + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("Student Address: "+studentAddress.toString());
        for(Map.Entry<String,StudentAddress> studentAddress : studentAddress.entrySet()){
            System.out.println(studentAddress.getKey() + " --->: " +studentAddress.getValue().toString());
        }
    }
}
