package org.spring.di.constructorDI.xmlBased;


import org.spring.di.pojo.UserDetail;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class XmlBasedConstructorDI {
    public static void main(String[] args){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("config.xml");
        UserDetail userDetails = (UserDetail) applicationContext.getBean("users");
        userDetails.showDetails();
    }
}
