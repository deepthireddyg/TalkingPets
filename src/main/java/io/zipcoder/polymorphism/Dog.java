package io.zipcoder.polymorphism;


    public class Dog extends Pet{
        public Dog(){
            this.name = "";
            this.type = "cat";
            this.speak = "Meow";
        }
        public Dog(String name) {
            this.name = name;
            this.type = "cat" ;
            this.speak = "Meow";
        }
    }

