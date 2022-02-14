package memento;

public class ClienteEstadoCadastrado implements ClienteEstado{


    private ClienteEstadoCadastrado(){}

    private static ClienteEstadoCadastrado instance = new ClienteEstadoCadastrado();

    public static ClienteEstadoCadastrado getInstance(){
        return instance;
    }

    @Override
    public String getEstado(){
        return "Cliente cadastrado no sistema!";
    }
    @Override
    public String cadastrar(Cliente cliente) {
        return "cadastro inválido, Cliente já cadastrado no sistema!";
    }

    @Override
    public String ativar(Cliente cliente) {
        cliente.setEstado(ClienteEstadoAtivado.getInstance());
        return "Cliente ativado!";
    }

    @Override
    public String pendencia(Cliente cliente) {
        cliente.setEstado(ClienteEstadoPendente.getInstance());
        return "Cliente com pendencia!";
    }

    @Override
    public String cancelar(Cliente cliente) {
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        return "Cliente cancelado!";
    }
}

