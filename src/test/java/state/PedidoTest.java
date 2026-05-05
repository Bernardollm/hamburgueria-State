package state;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveIniciarPedidoComoRecebido() {
        Pedido pedido = new Pedido();

        assertEquals("Pedido recebido", pedido.getEstado());
    }

    @Test
    void devePrepararPedidoRecebido() {
        Pedido pedido = new Pedido();

        assertTrue(pedido.preparar());
        assertEquals("Pedido em preparo", pedido.getEstado());
    }

    @Test
    void deveFinalizarPedidoEmPreparo() {
        Pedido pedido = new Pedido();

        pedido.preparar();

        assertTrue(pedido.finalizar());
        assertEquals("Pedido pronto", pedido.getEstado());
    }

    @Test
    void deveEntregarPedidoPronto() {
        Pedido pedido = new Pedido();

        pedido.preparar();
        pedido.finalizar();

        assertTrue(pedido.entregar());
        assertEquals("Pedido entregue", pedido.getEstado());
    }

    @Test
    void naoDeveEntregarPedidoRecebido() {
        Pedido pedido = new Pedido();

        assertFalse(pedido.entregar());
        assertEquals("Pedido recebido", pedido.getEstado());
    }
}

