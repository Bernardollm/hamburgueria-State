package state;

public class PedidoPronto implements EstadoPedido {

    @Override
    public String getEstado() {
        return "Pedido pronto";
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
        pedido.setEstado(new PedidoEntregue());
        return true;
    }
}
