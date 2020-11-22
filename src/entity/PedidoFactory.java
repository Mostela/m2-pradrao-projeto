package entity;

import com.company.Status;

public class PedidoFactory {
    public PedidoCommand create(Status status){
        return switch (status){
            case CONFIRMADO -> new PedidoConfirmado();
            case CANCELADO -> new PedidoCancelado();
            case PENDENTE -> new PedidoPendente();
        };
    }
}
