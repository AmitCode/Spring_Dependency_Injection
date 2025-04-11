package org.spring.di.setterDI.annotationBasedSetterDI;

import org.spring.di.pojo.UserDetail;
import org.spring.di.setterDI.annotationBasedSetterDI.config.AnnotationAppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBasedSetterDI {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
        UserDetail userDetail = applicationContext.getBean(UserDetail.class);
        if(userDetail != null){
            System.out.println("User Detail is initiated!...");
        }
    }
}
