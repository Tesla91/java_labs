package part_03;

import java.util.Scanner;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/


class Pound{
    public static void main(String args[]) throws java.io.IOException{

        Cats macie = new Cats("brown", 2, "F");
        Cats bella = new Cats("black", 10, "F");

        Dogs kaya = new Dogs("black", 5, "F");
        Dogs bax = new Dogs("brown", 14, "M");

        System.out.println("Pick a pet:");

        System.out.println("CAT: macie, bella DOG: kaya, bax");

        Scanner input = new Scanner(System.in);
        String pet = input.nextLine();

        if (pet.equalsIgnoreCase("macie"))
            System.out.println(pet + " has the following attributes " + macie.color + " " + macie.sex + " " + macie.age);
        else if (pet.equalsIgnoreCase( "bella"))
            System.out.println(pet + " has the following attributes " + bella.color + " " + bella.sex + " " + bella.age);
        else if (pet.equalsIgnoreCase( "kaya"))
            System.out.println(pet + " has the following attributes " + kaya.color + " " + kaya.sex + " " + kaya.age);
        else if (pet.equalsIgnoreCase( "bax"))
            System.out.println(pet + " has the following attributes " + bax.color + " " + bax.sex + " " + bax.age);
        else
            System.out.println("Sorry that is not one of our pets.");

        System.out.print("Would you like to adopt " + pet );
        System.out.println("?");
        System.out.println("y or n");

        String an = input.next();

        if (an.equalsIgnoreCase( "y")) {
            System.out.print("You have now adopted " + pet);
            System.out.println("! :)");
        }else if (an.equalsIgnoreCase( "n"))
            System.out.println(pet + " is now back in a cage :(");

    }

}

class Cats {
    String color;
    int age;
    String sex;

    Cats(String color, int age, String sex) {
        this.color = color;
        this.age = age;
        this.sex = sex;
    }


}

class Dogs {
    String color;
    int age;
    String sex;

    Dogs(String color, int age, String sex) {
        this.color = color;
        this.age = age;
        this.sex = sex;
    }

}
