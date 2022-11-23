package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    String speak;
    String name;
    String type;

    public Pet() {
        this.name = "";
        this.speak = "";
        this.type = "Pet";
    }
    @Override
    public String toString(){

        return  "Pet Name: " + getName() + "\n" +
                "> Pet Type: " + getType() + "\n" +
                "> Pet Sound:" + getSpeak();}


    public String getSpeak() {
        return speak;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}