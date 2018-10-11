package com.company;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> animalList;
    int slot;

    public Farm(){
        animalList = new ArrayList<>();
        slot = 100;
    }

    public void breed(){
        if (slot>0) {
            Animal animal = new Animal();
            animalList.add(animal);
        }
    }

    public void slaughter(){
        Animal least_hungry = this.animalList.get(0);
        for (Animal animal: this.animalList){
            if (animal.hunger < least_hungry.hunger) {
                least_hungry = animal;
            }
        }
        this.animalList.remove(least_hungry);
    }
}
