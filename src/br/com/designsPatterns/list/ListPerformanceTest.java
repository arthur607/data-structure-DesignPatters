package br.com.designsPatterns.list;

import java.util.*;

public class ListPerformanceTest {
    public static void main(String[] args) {

            Collection<Integer> numeros = new ArrayList<>();

            long inicioAdicao = System.currentTimeMillis();

            for (int i = 1; i <= 100000; i++) {
                numeros.add(i);
                Object[] objects = numeros.toArray();
                int i1 = Arrays.binarySearch(objects, 1);
            }
        long fimAdicao = System.currentTimeMillis();

        long tempoDeExecucaoAdicao = fimAdicao - inicioAdicao;
        System.out.println("Tempo gasto para adição: " + tempoDeExecucaoAdicao);

        long inicioContains = System.currentTimeMillis();
            for (Integer numero : numeros) {
                numeros.contains(numero);
            }

            long fimContains = System.currentTimeMillis();

            long tempoDeExecucao = fimContains - inicioContains;

            System.out.println("Tempo gasto: " + tempoDeExecucao);

        }
    }
