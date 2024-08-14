package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList<T extends Comparable<T>> extends ArrayList<T> {

    @Override
    public boolean add(T element) {
        if (!this.contains(element)) {
            return super.add(element);
        }
        return false;
    }

    public void sort() {
        Collections.sort(this);
    }

    @Override
    public boolean remove(Object o) {
        boolean removed = super.remove(o);
        if (removed) {
            sort();
        }
        return removed;
    }

    public static void main(String[] args) {
        WorkintechList<String> list = new WorkintechList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Tekrar eden veri eklenmeyecek
        list.add("Orange");
        list.sort();
        System.out.println(list); // [Apple, Banana, Orange]
        list.remove("Banana");
        System.out.println(list); // [Apple, Orange]
    }
}
