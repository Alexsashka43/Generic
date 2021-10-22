package fruit;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Box<Apple> aBox = new Box<Apple>();
        Box<Apple> aBox2 = new Box<Apple>();
        Box<Orange> oBox = new Box<Orange>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        aBox.add(apple1, apple2, apple3);
        oBox.add(orange1, orange2, orange3);
        aBox.putTo(aBox2);
        System.out.println(aBox2.getWeight());
        System.out.println(aBox.getWeight());
        System.out.println(oBox.getWeight());
        System.out.println(aBox.compare(oBox));
    }
}
