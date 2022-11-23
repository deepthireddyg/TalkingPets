package io.zipcoder.polymorphism;

import org.junit.Test;

public class MainApplicationTest {
@Test
    public void testSetName(){

    Dog dog = new Dog();
    dog.setName("Milo");
    String expected = "Milo";
    String actual = dog.getName();
}
@Test
public void testSetName1() {

    Cat cat = new Cat();
    cat.setName("Twinkle");
    String expected = "Twinkle";
    String actual = cat.getName();
}
@Test
    public void testGetName(){
    Rooster rooster = new Rooster();
    rooster.getName();
    String expected = "Minnu";
    String actual = rooster.getName();
}

}


