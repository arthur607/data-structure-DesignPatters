package br.com.designsPatterns;

import java.math.BigDecimal;

public class IRFF implements  Imposto{

    @Override
    public boolean canCreate(String nomeImposto) {
        return nomeImposto.equalsIgnoreCase("IRFF");
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
