package com.example.springbootcorebasics.customnamewithqualifier.interfacedi;

import com.example.springbootcorebasics.customnamewithqualifier.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniquePetIssue {
    private Animal animal;

/*    @Autowired
    public UniquePetShow(Animal animal) {
        this.animal = animal;
    }*/

    /*
    Could not autowire. There is more than one bean of 'Animal' type.
    Beans:
    cat   (Cat.java)
    dog   (Dog.java)
    */
}
