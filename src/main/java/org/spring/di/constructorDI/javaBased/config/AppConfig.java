package org.spring.di.constructorDI.javaBased.config;

import org.spring.di.constructorDI.javaBased.pojo.Student;
import org.spring.di.constructorDI.xmlBased.pojo.UserDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Configuration
//This annotation is used to denote that this class is containing configuration which
// is specifying the bean definition.
public class AppConfig {
    @Bean
    //This annotation is used to denote that this method is providing the bean definition
    //which will provide the instance of the bean with required constructor.
    public Student student(){
        List<Integer> bookIds = new ArrayList<>();
        bookIds.add(9378);
        bookIds.add(45468);
        bookIds.add(90820);
        Map<String,String> studentAddress = new HashMap<>();
        Map<String,Map<String,String>> studentAddresses = new HashMap<>();
        studentAddress.put("Village/Town","Churihari");
        studentAddress.put("District","Siddharth Nagar");
        studentAddress.put("State","Uttar Pradesh");
        studentAddress.put("Country","India");
        studentAddress.put("Pin Code","272207");
        studentAddresses.put("Permanent Addesss",studentAddress);
        Map<String,String> studentAddress1 = new HashMap<>();
        studentAddress1.put("Village/Town","Kanahai");
        studentAddress1.put("District","Gurugram");
        studentAddress1.put("State","Haryana");
        studentAddress1.put("Country","India");
        studentAddress1.put("Pin Code","122003");
        studentAddresses.put("Current Address",studentAddress1);
        return new Student(0014,"Amit Kumar Pandey",bookIds,studentAddresses);
    }



}
