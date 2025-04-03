package org.spring.di.constructorDI.xmlBased.pojo;

import java.util.List;
import java.util.Map;

public class UserDetails {
    private int userId;
//    private String userName;
    private Map<Integer,String> userName;
    private String userEmail;
    private List<Integer> listOfMobileNumber;
    private List<Address> listOfAddress;

    public UserDetails(){

    }

    public UserDetails(int id,Map<Integer,String> name,String email,List<Integer> mobileNumber,List<Address> listOfAddress){
        this.userId = id;
        this.userName = name;
        this.userEmail = email;
        this.listOfMobileNumber = mobileNumber;
        this.listOfAddress = listOfAddress;
    }
    public UserDetails(int id){
        this.userId = id;
    }
    @Override
    public String toString(){
        return "UserId is: "+userId+", UserEmail is: "+userEmail;
    }

    public void showDetails(){
        System.out.print("UserName: ");
        for(Map.Entry<Integer,String> names: userName.entrySet()){
            System.out.print(names.getValue() +" ");
        }
        System.out.println();
        System.out.println(toString());
        System.out.print("User Mobile Numbers ---> ");
        for(int numbers: listOfMobileNumber){
            System.out.print(numbers + " ");
        }
        System.out.println("List of Address --->: ");
        for (Address address : listOfAddress)
            System.out.println(address.toString());
    }
}
