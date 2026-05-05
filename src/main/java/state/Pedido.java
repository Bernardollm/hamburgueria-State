package state;

public class Pedido {

    private EstadoPedido estado;

    public Pedido() {
        this.estado = new PedidoRecebido();
    }

    public String getEstado() {
        return estado.getEstado();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public boolean preparar() {
        return estado.preparar(this);
    }

    public boolean finalizar() {
        return estado.finalizar(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }
}

