package br.com.designsPatterns;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<Imposto> pilhaImposto = new Stack<>();
        pilhaImposto.add(new IRFF());
        pilhaImposto.add(new ICMS());


        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos(pilhaImposto);

        System.out.println(calculadoraDeImpostos.calcular(orcamento,new IRFF()));
    }
}
