package state;

public class PedidoRecebido implements EstadoPedido {

    @Override
    public String getEstado() {
        return "Pedido recebido";
    }

    @Override
    public boolean preparar(Pedido pedido) {
        pedido.setEstado(new PedidoEmPreparo());
        return true;
    }

    @Override
    public boolean finalizar(Pedido pedido) {
        return false;
    }

    @Override
    public boolean entregar(Pedido pedido) {
        return false;
    }
}
