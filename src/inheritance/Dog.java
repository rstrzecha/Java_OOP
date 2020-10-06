package inheritance;

public class Dog extends Animal {

    public Dog() {
        super("Fafik", 3);
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    public void makeSound() {
        System.out.println(getName() + " - barks! Woof! Wrrr");
    }

}
