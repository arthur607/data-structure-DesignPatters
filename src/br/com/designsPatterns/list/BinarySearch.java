package br.com.designsPatterns.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int target = 500;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        long startTime = System.nanoTime();
        int index = Arrays.binarySearch(array, target);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Element found in: " + duration);
        if (index == -1){
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element founf at: " + index);
        }

        var strings = new ArrayList<String>();
        for (int i = 0; i < 5000; i++) {
            strings.add("String numero "+i);
        }
        Object[] objects = strings.toArray();
        char charArr[] = { 'g', 'p', 'q', 'c', 'i' };
        Arrays.sort(objects);
        Arrays.sort(charArr);
        int i = Arrays.binarySearch(charArr,'i');

        if (i == -1){
            System.out.println(target + " not found");
        }
        else {
            System.out.println("Element founf at: " + i);
        }
    }



}
