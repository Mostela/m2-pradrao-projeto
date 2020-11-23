package entity;

public class PedidoCancelado implements PedidoCommand{
    @Override
    public void executar(Pedido pedido) {
        System.out.println("O pedido " + pedido.getDescricao() + " foi CANCELADO");
    }
}
