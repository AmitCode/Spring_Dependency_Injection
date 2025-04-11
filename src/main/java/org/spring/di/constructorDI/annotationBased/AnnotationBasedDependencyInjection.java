package org.spring.di.constructorDI.annotationBased;

import org.spring.di.constructorDI.annotationBased.config.AnnotationAppConfig;
import org.spring.di.constructorDI.annotationBased.pojo.UserDetails;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationBasedDependencyInjection {
    public static void main(String[] args){
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AnnotationAppConfig.class);
        UserDetails userDetails = applicationContext.getBean(UserDetails.class);
        userDetails.getMessage();
    }
}
