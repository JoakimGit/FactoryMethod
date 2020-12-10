package dk.kea.dat19c;

import dk.kea.dat19c.Factory.AnimalShelter;
import dk.kea.dat19c.Factory.CatShelter;
import dk.kea.dat19c.Factory.DogShelter;
import dk.kea.dat19c.Factory.RabbitShelter;
import dk.kea.dat19c.Product.Animal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Which animal would you like to rescue? (Dog, Cat or Rabbit)");
        String animalType = input.nextLine();

        AnimalShelter shelter = loadFactory(animalType);

        if (shelter != null) {
            Animal animal = shelter.rescueAnimal();
            animal.speak();
        }
    }
    
    private static AnimalShelter loadFactory(String animalType) {
        AnimalShelter factory = null;
        if (animalType == null || animalType.length() < 1) {
            return null;
        }
        switch (animalType.toUpperCase()) {
            case "DOG" -> factory = new DogShelter();
            case "CAT" -> factory = new CatShelter();
            case "RABBIT" -> factory = new RabbitShelter();
            default -> System.out.println("We don't have that kind of animal in this shelter");
        }
        return factory;
    }
}
