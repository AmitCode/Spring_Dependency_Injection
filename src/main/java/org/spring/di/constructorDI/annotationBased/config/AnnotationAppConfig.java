package org.spring.di.constructorDI.annotationBased.config;

import org.spring.di.constructorDI.annotationBased.pojo.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "org.spring.di.constructorDI.annotationBased"
)
public class AnnotationAppConfig {
}
