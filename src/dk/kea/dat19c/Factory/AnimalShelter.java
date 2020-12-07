package dk.kea.dat19c.Factory;

import dk.kea.dat19c.Product.Animal;

public abstract class AnimalShelter {

    public Animal rescueAnimal() {
        Animal animal = createAnimal();
        animal.clean();
        animal.medicalCheckup();
        System.out.println("All ready to leave the shelter");
        System.out.println(animal.getClass().getSimpleName() + " has been rescued.");
        return animal;
    }

    public abstract Animal createAnimal();
}
