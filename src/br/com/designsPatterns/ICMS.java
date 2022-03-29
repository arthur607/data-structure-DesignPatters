package br.com.designsPatterns;

import java.math.BigDecimal;

public class ICMS implements  Imposto{
    @Override
    public boolean canCreate(String nomeImposto) {
        return nomeImposto.equalsIgnoreCase("ICMS");
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.5"));
    }
}
