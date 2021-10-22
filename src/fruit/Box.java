package fruit;

import java.util.ArrayList;
import java.util.Arrays;


public class Box<T extends Fruit> {

    private ArrayList<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public Box(T... fruits) {
        this.list = new ArrayList<>(Arrays.asList(fruits));
    }

    public float getWeight() {
        float weight = 0.0f;

        for (T s : list) {
            weight += s.getWeight();
        }

        return weight;
    }

    public void add(T... fruits) {
        for (T s: fruits
             ) {
            list.add(s);
        }
    }

    public void putTo(Box<T> another) {
        another.list.addAll(list);
        list.clear();
    }

    public boolean compare(Box<?> v) {
        return Math.abs(this.getWeight() - v.getWeight()) < 0.001;
    }
}