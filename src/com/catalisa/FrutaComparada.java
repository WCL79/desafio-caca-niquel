package com.catalisa;

import java.util.Random;
/**
 * Classe enum com atributos fixo.
 */
public enum FrutaComparada {
    BANANA(10), MORANGO(20), ESTRELA(40), ABACATE (30);
    private int valor;
    /**
     * Escolha um valor aleatório do enum
     * @return a random FrutaComparada.
     */
    FrutaComparada(int valor) {
        this.valor = valor;
    }
    public int getValor() {

        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public static FrutaComparada getFrutaComparada() {
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}