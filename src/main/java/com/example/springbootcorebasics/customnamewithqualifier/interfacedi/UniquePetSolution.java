package com.example.springbootcorebasics.customnamewithqualifier.interfacedi;

import com.example.springbootcorebasics.customnamewithqualifier.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UniquePetSolution {
    private Animal animal;

    @Autowired
    public UniquePetSolution(@Qualifier("dog") Animal animal) {
        this.animal = animal;
    }

    /*@Autowired
    public ResolveWithQualifier(@Qualifier("cat") Animal animal) {
        this.animal = animal;
    }*/
}

// Or make Dog/Cat Primary :)
