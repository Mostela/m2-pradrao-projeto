package entity;

public class PedidoConfirmado implements PedidoCommand{
    @Override
    public void executar(Pedido pedido) {
        System.out.println("O pedido " + pedido.getDescricao() + " foi confirmado.");
    }
}
