package com.catalisa;

/**
 * @author Weslley.candido
 * Classe modelo para a regra de negócio do jogo
 */
public class Sistema {

    StringBuilder builder = new StringBuilder();
    /**
     * metodo que executa a lógica com 3 jogada aleatoria, porém é possivel aumentar a
     * dificuldade ao mencionar no parametro o valor e aumentar ATRIBUTO na classe
     * FrutaComparada para que o jogo aumente a complexidade.
     */
    public void executarSistema() {
        int sumnumber = 0;
        int controle = 1;
        while (controle < 5) {
            //Escolha um FrutaComparada aleatório por 4 vezes
            FrutaComparada frutaComparada = FrutaComparada.getFrutaComparada();
            System.out.printf("Caça NIGQUEL[%d] = %s", controle, frutaComparada);
            EntradaSaida.mostrarTexto("  "+frutaComparada.getValor());
            sumnumber += frutaComparada.getValor();
            builder.append(frutaComparada.getValor());
            controle++;
        }
        EntradaSaida.mostrarTexto("Total da soma: " + sumnumber);
    }
}

