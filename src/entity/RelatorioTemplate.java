package entity;

import java.util.ArrayList;

public abstract class RelatorioTemplate {
    private ArrayList<Pedido> pedidos;

    public void gerar(ArrayList<Pedido> list_pedidos){
        System.out.println("Relatorio dos pedidos gerado!!");
        this.montaCabecalho();
        this.montaConteudo(list_pedidos);
        this.montaRodape();
    }

    public void montaCabecalho(){

    }

    public void montaConteudo(ArrayList<Pedido> list_pedidos){
        for(Pedido pedido: list_pedidos){
            System.out.println(pedido);
        }
    }

    public void montaRodape(){

    }

}
