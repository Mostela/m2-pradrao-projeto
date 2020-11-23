package entity;

public class ProcessadorPedido {
    public void processar(){
        LeitorDeArquivo leitor = new LeitorDeArquivo();

        for (Pedido pedido : leitor.ler()){
            PedidoCommand command;
            switch (pedido.getStatus()){
                case CANCELADO -> command = new PedidoCancelado();
                case PENDENTE -> command = new PedidoPendente();
                case CONFIRMADO -> command =  new PedidoConfirmado();
                default -> throw new IllegalStateException("Unexpected value: " + pedido.getStatus());
            }

            command.executar(pedido);
        }
    }
}
