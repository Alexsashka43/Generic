package swap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//smth - something
public class BoxWithSmth<T>{
    private T[] smth;

    public BoxWithSmth(T... smth) {
        this.smth = smth;
    }

    public BoxWithSmth() {
    }

    public T[] getSmth() {
        return smth;
    }

    public void setSmth(T[] smth) {
        this.smth = smth;
    }
//
//    private void swap(T[] arr, int i, int j) {
//        T tmp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = tmp;
//    }
    public T[] swapPlaces(T[] smth, int i, int j) {
        List <T> list = Arrays.asList(smth);
        Collections.swap(list, i, j);
        return (T[]) list.toArray();
    }
}


