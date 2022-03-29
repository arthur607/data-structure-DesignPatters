package br.com.designsPatterns;

import java.math.BigDecimal;

public interface Imposto {

    boolean canCreate(String nomeImposto);

    BigDecimal calcular(Orcamento orcamento);
}
