package inheritance;

import java.util.ArrayList;
import java.util.List;

public class AnimalsDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog2 = new Dog("Reksio", 5);

        Cat cat = new Cat();

        Animal cat2 = new Cat();

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(dog2);
        animals.add(cat);

        for (Animal animal : animals) {
            animal.goToSleep();
        }

        Chicken chicken = new Chicken("Ruda", 1);
        animals.add(chicken);
        Chicken chicken2 = new Chicken();
        animals.add(chicken2);

        Cow cow = new Cow("Mućka", 3);
        animals.add(cow);
        System.out.println(cow.getName());

        for (Animal animal : animals) {
            animal.makeSound();
        }

        chicken.layEgg();
        chicken2.layEgg();

//        Animal someAnimal = new Dog("Pieszczoch",10);
//        someAnimal.makeSound();
//        someAnimal.goToSleep();
    }
}
