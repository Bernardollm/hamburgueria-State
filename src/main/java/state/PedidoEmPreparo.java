package state;

public class PedidoEmPreparo implements EstadoPedido {

    @Override
    public String getEstado() {
        return "Pedido em preparo";
    }

    @Override
    public boolean preparar(Pedido pedido) {
        return false;
    }

    @Override
    public boolean finalizar(Pedido pedido) {
        pedido.setEstado(new PedidoPronto());
        return true;
    }

    @Override
    public boolean entregar(Pedido pedido) {
        return false;
    }
}
