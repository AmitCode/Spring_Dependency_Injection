package org.spring.di.constructorDI.xmlBased;


import org.spring.di.constructorDI.xmlBased.pojo.UserDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBasedConstructorDI {
    public static void main(String[] args){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("config.xml");
        UserDetails userDetails = (UserDetails) applicationContext.getBean("users");
        userDetails.showDetails();
    }
}
