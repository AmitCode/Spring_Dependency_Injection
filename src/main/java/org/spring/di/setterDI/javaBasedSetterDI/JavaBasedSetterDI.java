package org.spring.di.setterDI.javaBasedSetterDI;

import org.spring.di.pojo.Address;
import org.spring.di.pojo.UserDetail;
import org.spring.di.setterDI.javaBasedSetterDI.config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

public class JavaBasedSetterDI {
    public static void main(String[] args){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(ApplicationConfig.class);
        UserDetail userDetail = applicationContext.
                getBean(UserDetail.class);
        System.out.println(userDetail.toString());
        System.out.print("User Mobile Numbers ---> ");
        for(int numbers: userDetail.getListOfMobileNumber()){
            System.out.print(numbers + " ");
        }

        System.out.println();
        for(Map.Entry<String, Address> addresses : userDetail.getListOfAddress().entrySet()){
            System.out.println(addresses.getKey() + " ----->: " +addresses.getValue().toString());
        }
    }
}
