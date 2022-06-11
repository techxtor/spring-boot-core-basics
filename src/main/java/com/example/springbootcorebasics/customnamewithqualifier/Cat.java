package com.example.springbootcorebasics.customnamewithqualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cat")
public class Cat implements Animal {

    @Override
    public String name() {
        return "Cat";
    }
}
