package dk.kea.dat19c.Factory;

import dk.kea.dat19c.Product.Animal;
import dk.kea.dat19c.Product.Cat;

public class CatShelter extends AnimalShelter {

    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
