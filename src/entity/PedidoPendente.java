package entity;

public class PedidoPendente implements PedidoCommand{
    @Override
    public void executar(Pedido pedido) {
        System.out.println("O pedido " + pedido.getDescricao() + " esta PENDENTE. Aguardando aprovação!");
    }
}
