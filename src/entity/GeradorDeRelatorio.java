package entity;

import com.company.Status;

import java.util.ArrayList;

public class GeradorDeRelatorio {
    public void gerar(Status status){
        LeitorDeArquivo leitorDeArquivo = new LeitorDeArquivo();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        RelatorioFactory factory = new RelatorioFactory();
        for (Pedido pedido : leitorDeArquivo.ler()){
            if(pedido.getStatus() == status){
                pedidos.add(pedido);
            }
        }

        RelatorioTemplate relatorioTemplate = factory.create(status);
        relatorioTemplate.gerar(pedidos);
    }
}
