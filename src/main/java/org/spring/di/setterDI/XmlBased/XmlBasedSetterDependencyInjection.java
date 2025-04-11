package org.spring.di.setterDI.XmlBased;

import org.spring.di.pojo.Address;
import org.spring.di.pojo.UserDetail;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;


public class XmlBasedSetterDependencyInjection {
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "config1.xml"
        );

        UserDetail userDetails = applicationContext.getBean("userDtl", UserDetail.class);
        System.out.println(userDetails.toString());
            System.out.print("User Mobile Numbers ---> ");
            for(int numbers: userDetails.getListOfMobileNumber()){
                System.out.print(numbers + " ");
            }
        System.out.println();
//        System.out.println("User Address: " +userDetails.getListOfAddress());
        for(Map.Entry<String, Address> addresses : userDetails.getListOfAddress().entrySet()){
            System.out.println(addresses.getKey() + " ----->: " +addresses.getValue().toString());
        }
//        System.out.println();
//            for(Map.Entry<String,Map<String,String>> addresses : userDetails.getListOfAddress().entrySet()){
//                System.out.println(addresses.getKey() + ":---->: ");
//                for (Map.Entry<String,String> address : addresses.getValue().entrySet()){
//                    System.out.print(address.getKey() +": " + address.getValue() + ", ");
//                }
//            }
    }
}
