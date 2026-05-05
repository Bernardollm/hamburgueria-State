package state;

public interface EstadoPedido {
    String getEstado();

    boolean preparar(Pedido pedido);
    boolean finalizar(Pedido pedido);
    boolean entregar(Pedido pedido);
}
