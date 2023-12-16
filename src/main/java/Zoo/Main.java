package Zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion());
        animals.add(new Parrot());

        for (Animal animal : animals) {
            animal.makeSound();
        }

        List<Animal> mammals = isMammal(animals);
        for (Animal animal : mammals) {
            System.out.println("Animal is mammal and makes sound: ");
            animal.makeSound();
        }

        List<Animal> isNotMammals = isNotMammal(animals);
        for (Animal animal : isNotMammals) {
            System.out.println("Animal is not a mammal and makes sound: ");
            animal.makeSound();
        }



    }

    public static List isMammal(List<Animal> animals) {
        List<Animal> mammals = new ArrayList();
        for (Animal animal : animals) {
            if(animal.getIsMammal()) {
                mammals.add(animal);
            }
        }
        return mammals;
    }

    public static List isNotMammal(List<Animal> animals) {
        List<Animal> nonMammals = new ArrayList();
        for (Animal animal : animals) {
            if(!animal.getIsMammal()) {
                nonMammals.add(animal);
            }
        }
        return nonMammals;
    }

}
