package dk.kea.dat19c.Factory;

import dk.kea.dat19c.Product.Animal;
import dk.kea.dat19c.Product.Rabbit;

public class RabbitShelter extends AnimalShelter {

    @Override
    public Animal createAnimal() {
        return new Rabbit();
    }
}
