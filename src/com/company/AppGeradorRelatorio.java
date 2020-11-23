package com.company;

import entity.GeradorDeRelatorio;

public class AppGeradorRelatorio {
    public static void main(String[] args) {
        GeradorDeRelatorio geradorDeRelatorio = new GeradorDeRelatorio();

        geradorDeRelatorio.gerar(Status.PENDENTE);
    }
}
