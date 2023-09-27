package anminalHerencia;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal");
        Mammal mammal = new Mammal("Generic Mammal");
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Buddy");

        System.out.println(animal.toString());
        System.out.println(mammal.toString());
        System.out.println(cat.toString());
        System.out.println(dog.toString());

        cat.greets();
        dog.greets();
        dog.greets(dog);
    }
}