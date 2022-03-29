package br.com.designsPatterns;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class CalculadoraDeImpostos {

    private Map<String,Imposto> impostoMap;

    public CalculadoraDeImpostos(Stack<Imposto> listImposto) {
        createImpostoHandler(listImposto);
    }

    private void createImpostoHandler(Stack<Imposto> listImposto) {
        this.impostoMap = new HashMap<>(listImposto.size());

        listImposto.forEach(imposto -> impostoMap.put(imposto.getClass().getName(), imposto));
    }

    //private final List<Imposto> impostos;

//
//    public CalculadoraDeImpostos(List<Imposto> impostos) {
//        this.impostos = impostos;
//    }


    public BigDecimal calcular(Orcamento orcamento, Imposto tipoImposto){
        Imposto imposto = impostoMap.get("nomeDoServiceDesejado");

       return tipoImposto.calcular(orcamento);
      //  impostos.add(new ICMS());
       // impostos.add(new IRFF());

//        for (Imposto e : impostos) {
//            bigDecimal = e.calcular(orcamento);
//        }

    }

    public BigDecimal calcularComFiltro(Orcamento orcamento, List<Imposto> tipoImposto,String nomeImposto){
        return tipoImposto.stream().filter(imposto -> imposto.canCreate(nomeImposto))
                .map(e -> e.calcular(orcamento)).findFirst().orElseThrow(RuntimeException::new);
    }

}
