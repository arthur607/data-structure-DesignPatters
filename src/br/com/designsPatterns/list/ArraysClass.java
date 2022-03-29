package br.com.designsPatterns.list;

import java.util.*;

public class ArraysClass {

    public static List<String> strings = new ArrayList<>(4);  //default size 10
    public static LinkedList<String> linkedstrings = new LinkedList<>();
    public static Deque<String> dequeStrings = new ArrayDeque<>(10);

    public static void getStringsArrayList() {
        strings.add("ordenação garantida conforme inserção");
        strings.add("another string");
        strings.add("another string in range 2");
        strings.set(2,"another string replaced in range 2 ");


        strings.forEach(System.out::println);
    }

    public static void getStringsLinkedArrayList() {
        //- Otimizado para inserção/exclusão
        //- Lento na indexação/pesquisa
        linkedstrings.add("elementos ligados por nó O(n)");
        linkedstrings.add("inserção de elementos facilitada O(1)");
        linkedstrings.addFirst("sempre primeiro elemento");
        linkedstrings.add("another element");
        linkedstrings.addLast("sempre ultimo elemento");
        linkedstrings.poll();  // This method retrieves and removes the head (first element) of this list.

        String s = linkedstrings.peekFirst(); // == get primeiro ou ultimo elemento


        linkedstrings.forEach(System.out::println);
    }

    public static void main(String[] args) {
        ArraysClass.getStringsArrayList();
        System.out.println("-------------------------------------");
        ArraysClass.getStringsLinkedArrayList();
    }
}
