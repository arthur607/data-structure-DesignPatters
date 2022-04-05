package br.com.designsPatterns.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Ex {
    public static void main(String[] args) {
        Collection<Integer> list = new HashSet<>();
        Collection<Integer> list2 = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 20; i >= 5; i--) {
            list2.add(i);
        }

        long inicioAdicao = System.currentTimeMillis();
        for (Integer integer: list){

            if (list2.contains(integer)){
                System.out.println("elemento " + integer + " foi encontrado");
                }else {
                System.out.println("elemento " + integer + " não foi encontrado");
                }

        }
        long fimAdicao = System.currentTimeMillis();
        long tempoDeExecucaoAdicao = fimAdicao - inicioAdicao;
        System.out.println("Tempo gasto: " + tempoDeExecucaoAdicao);

        for (Integer integer: list){
            int i = Arrays.binarySearch(list2.toArray(), integer);
            System.out.println("elemento na busca binária " +i);
        }





    }
}