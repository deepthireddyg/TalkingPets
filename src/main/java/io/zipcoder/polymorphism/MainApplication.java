package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        doYouLovePets();
    }

    public static  void doYouLovePets() {
        Scanner scan = new Scanner(System.in);
        String name;
        String type;
        System.out.println("Hello! I would like to know about your pets. How Many Pets do you have?");
        int numPets = scan.nextInt();
        scan.nextLine();

        Pet[] totalPets = new Pet[numPets];

        for (int i = 1; i <= numPets; i++) {

            System.out.println(" What type of pet is pet number " + i + "?\n" +
                    "Only dog, cat or Rooster are valid choices.");
            type = scan.nextLine();
            System.out.println("Sweet! What is the name of the pet ?\n");

            name = scan.nextLine();
            if(type.equals("dog")){
                Dog dog = new Dog(name);
             totalPets[i-1] = (Pet) dog;
            } else if (type.equals("cat")) {
                Cat cat = new Cat(name);
              totalPets[i - 1] = (Pet) cat;
            } else if (type.equals("turtle")) {
                Rooster rooster = new Rooster(name);
                totalPets[i - 1] = (Pet) rooster;
            }
        }
        System.out.println("Cool, so let me see if I remember all of your pets!");


        for (int i = 0 ; i < totalPets.length ; i++){
            System.out.println(totalPets[i].toString());
        }
            }


        }



    

