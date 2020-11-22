package entity;

import com.company.Status;

public class RelatorioFactory {
    public RelatorioTemplate create(Status status){
        return switch (status){
            case PENDENTE -> new RelatorioPedidosPendentes();
            case CANCELADO -> new RelatorioPedidosCancelados();
            case CONFIRMADO -> new RelatorioPedidosConfirmados();
        };
    }
}
