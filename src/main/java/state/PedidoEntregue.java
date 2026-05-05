package state;

public class PedidoEntregue implements EstadoPedido {

    @Override
    public String getEstado() {
        return "Pedido entregue";
    }

    @Override
    public boolean preparar(Pedido pedido) {
        return false;
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
