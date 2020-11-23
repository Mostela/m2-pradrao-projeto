package entity;

import com.company.Status;

public class GeradorDeRelatorio {
    public void gerar(Status status){
        LeitorDeArquivo leitorDeArquivo = new LeitorDeArquivo();

        RelatorioFactory factory = new RelatorioFactory();
        for (Pedido pedido : leitorDeArquivo.ler()){
            if(pedido.getStatus() == status){
                RelatorioTemplate relatorioTemplate = factory.create(status);
                relatorioTemplate.gerar();
            }
        }
    }
}
