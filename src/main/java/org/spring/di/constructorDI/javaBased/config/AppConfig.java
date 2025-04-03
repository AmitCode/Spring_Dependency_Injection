package org.spring.di.constructorDI.javaBased.config;

import org.spring.di.constructorDI.javaBased.pojo.Student;
import org.spring.di.constructorDI.xmlBased.pojo.UserDetails;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//This annotation is used to denote that this class is containing configuration which
// is specifying the bean definition.
public class AppConfig {
    @Bean
    //This annotation is used to denote that this method is providing the bean definition
    //which will provide the instance of the bean with required constructor.
    public Student student(){
        return new Student(0014,"Amit Kumar Pandey");
    }
}
