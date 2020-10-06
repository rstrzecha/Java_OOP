package inheritance;

public class Cow extends Animal {

    public Cow(){
        super("Krasula", 3);
    }

    public Cow(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(getName() + " - muu!");
    }

    public void giveMilk() {
        System.out.println("Krowa daje mleko");
    }
}
