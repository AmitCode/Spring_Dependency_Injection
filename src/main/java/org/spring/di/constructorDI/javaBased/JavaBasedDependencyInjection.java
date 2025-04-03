package org.spring.di.constructorDI.javaBased;

import org.spring.di.constructorDI.javaBased.config.AppConfig;
import org.spring.di.constructorDI.javaBased.pojo.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaBasedDependencyInjection {
    public static void main(String[] args){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //Student student = (Student)applicationContext.getBean("student");
        //If you are not providing the required class type(ex = Student.class) than you
        //have to case it into the desired class.
        Student student = applicationContext.getBean("student", Student.class);
        student.showDetails();
    }
}
