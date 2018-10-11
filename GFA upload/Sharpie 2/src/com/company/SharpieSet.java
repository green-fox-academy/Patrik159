package com.company;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

    List<Sharpie> Set;

    public SharpieSet(){
        this.Set = new ArrayList<>();
    }

    public int countUsable(){
        int counter = 0;
        for (Sharpie sharpie: this.Set){
            if (sharpie.inkAmount > 0) {
                counter++;
            }
        }
        return counter;
    }

    public void removeTrash(){
        for (Sharpie sharpie: this.Set){
            if (sharpie.inkAmount == 0){
                Set.remove(sharpie);
            }
        }
    }
}
