package memento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveArmazenarEstados(){
        Cliente cliente = new Cliente();
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        cliente.setEstado(ClienteEstadoAtivado.getInstance());
        assertEquals(2,cliente.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial(){
        Cliente cliente = new Cliente();
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        cliente.setEstado(ClienteEstadoAtivado.getInstance());
        cliente.restauraEstado(0);
        assertEquals(ClienteEstadoCadastrado.getInstance(),cliente.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior(){
        Cliente cliente = new Cliente();
        cliente.setEstado(ClienteEstadoCadastrado.getInstance());
        cliente.setEstado(ClienteEstadoAtivado.getInstance());
        cliente.setEstado(ClienteEstadoPendente.getInstance());
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        cliente.restauraEstado(1);
        assertEquals(ClienteEstadoAtivado.getInstance(),cliente.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido(){
        try{
            Cliente cliente = new Cliente();
            cliente.restauraEstado(0);
            fail();
        }catch (IllegalArgumentException e){
            assertEquals("Indice inválido!",e.getMessage());
        }
    }

}