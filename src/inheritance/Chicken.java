package inheritance;

public class Chicken extends Animal {

    public Chicken() {
        super("Kokoszka", 1);
    }

    public Chicken(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(getName() + " - kokoko");
    }

    public void layEgg() {
        System.out.println(getName() + " znosi jajko");
    }

}
