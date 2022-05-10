package br.com.designsPatterns.Algorithm;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>(List.of(3, 2, 5, 1, 1, 10));

        for (int j = 1; j < elements.size(); j++) {
            int key = elements.get(j);
            int i = j - 1;

            while (i >= 0 && elements.get(i) > key) {
                elements.set(i + 1, elements.get(i));
                i = i - 1;
                elements.set(i + 1, key);
            }
        }
        elements.forEach(System.out::println);
    }

}
