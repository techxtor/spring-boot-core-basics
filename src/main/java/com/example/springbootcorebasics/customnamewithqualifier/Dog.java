package com.example.springbootcorebasics.customnamewithqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("dog")
public class Dog implements Animal {
    @Override
    public String name() {
        return "Dog";
    }
}
