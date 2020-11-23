package entity;

import java.util.ArrayList;

public abstract class RelatorioTemplate {
    private ArrayList<Pedido> pedidos;

    public void gerar(){
        System.out.println("Relatorio dos pedidos gerado!!");
    }

    public void montaCabecalho(){

    }

    public void montaConteudo(){

    }

    public void montaRodape(){

    }

}
