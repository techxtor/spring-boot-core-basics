package com.example.springbootcorebasics.customnamewithqualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PetShow {
    private final Animal dog;
    private final Animal cat;

    public PetShow(@Qualifier("dog")Animal dog, @Qualifier("cat")Animal cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public Animal getDog() {
        return dog;
    }
    public Animal getCat() {
        return cat;
    }
}
