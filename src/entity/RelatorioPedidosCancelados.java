package entity;

import java.util.ArrayList;

public class RelatorioPedidosCancelados extends RelatorioTemplate{
    @Override
    public void montaCabecalho() {
        super.montaCabecalho();
    }

    @Override
    public void montaConteudo(ArrayList<Pedido> list_pedidos) {
        super.montaConteudo(list_pedidos);
    }

    @Override
    public void montaRodape() {
        super.montaRodape();
    }
}
