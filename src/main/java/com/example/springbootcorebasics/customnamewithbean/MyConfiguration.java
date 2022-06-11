package com.example.springbootcorebasics.customnamewithbean;

import com.example.springbootcorebasics.customnameatclasslevel.MyCustomComponent;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfiguration {
    @Bean("beanComponent")
    public MyCustomComponent myComponent() {
        return new MyCustomComponent();
    }
}
