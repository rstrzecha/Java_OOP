package inheritance;

public class Cat extends Animal {

    public Cat() {
        super("Puszek", 2);
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(getName() + " - miałczy, miał! ");
    }

}
