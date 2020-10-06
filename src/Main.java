import oop.simpleExample.Person;

public class Main {

    public static void main(String[] args) {
        A aa = new A();
        System.out.println("x - " + aa.x);

        int a = 3;
        int b = 8;
        f(a, b, a+b);
        System.out.println(a);

        int[] t = {3, 31, 1, -28, 5};
        int w = t[1] + t[3];
        System.out.print(t[w]);
        System.out.print(t[t[2] + 3]);
    }

    public static void f(int... t) {
        if(t[1] > 5) {
            System.out.print("x");
        } else {
            System.out.print("y");
        }
        int s = 0;
        for (int j: t) {
            s += j;
            System.out.print(s);
        }
    }
}
