package org.spring.di.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class UserDetail {
    private int userId;
    private String userName;
    //private Map<Integer,String> userName;
    private String userEmail;
    private List<Integer> listOfMobileNumber;
//    private Map<String,String> listOfAddress;
    //private Map<String,Map<String,String>> listOfAddress;
    //private Address listOfAddress;
private Map<String,Address> listOfAddress;

    //Error creating bean with name 'userDtl'
    //defined in class path resource [config1.xml]: Failed to instantiate
    //[org.spring.di.pojo.UserDetails]: No default constructor found
    //In setter it required to use a default constructor.
    //It is required to use setter methods for the property which you are assigning in property tag.
    @Autowired
    public UserDetail(){

    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<Integer> getListOfMobileNumber() {
        return listOfMobileNumber;
    }

    public void setListOfMobileNumber(List<Integer> listOfMobileNumber) {
        this.listOfMobileNumber = listOfMobileNumber;
    }

    //    public UserDetails(int id,Map<Integer,String> name,String email,List<Integer> mobileNumber,List<Address> listOfAddress){
//        this.userId = id;
//        this.userName = name;
//        this.userEmail = email;
//        this.listOfMobileNumber = mobileNumber;
//        this.listOfAddress = listOfAddress;
//    }
//    public UserDetails(int id){
//        this.userId = id;
//    }

    @Override
    public String toString(){
        return "UserId is: " + getUserId() + ", UserName is: " + getUserName() +
                ", UserEmail is: "+ getUserEmail();
    }

    public Map<String,Address> getListOfAddress() {
        return listOfAddress;
    }

    public void setListOfAddress(Map<String,Address> listOfAddress) {
        this.listOfAddress = listOfAddress;
    }

    public void showDetails(){
        System.out.println(toString());
        System.out.print("User Mobile Numbers ---> ");
        for(int numbers: listOfMobileNumber){
            System.out.print(numbers + " ");
        }

        //for(Map.Entry<String,String> address : listOfAddress.entrySet())
    }
}
