package org.spring.di.constructorDI.annotationBased.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserDetails {
    private String userId;
    private String userName;
    private String userEmail;
    private String userPhoneNumber;
    private String userPassword;

    //@Autowired If your class is having only one constructor then it is optional to
    // use these annotations.
    public UserDetails() {
    }

    public void getMessage(){
        System.out.println("This is my message!...");
    }

}
