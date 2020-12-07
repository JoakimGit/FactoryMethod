package dk.kea.dat19c.Product;

public abstract class Animal {

    public abstract void speak();

    public void medicalCheckup() {
        System.out.println("Passed the health check with flying colors");
    }

    public void clean() {
        System.out.println("I've been cleaned in preperation for leaving the shelter");
    }
}
