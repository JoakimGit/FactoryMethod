package dk.kea.dat19c.Factory;

import dk.kea.dat19c.Product.Animal;
import dk.kea.dat19c.Product.Dog;

public class DogShelter extends AnimalShelter {

    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
