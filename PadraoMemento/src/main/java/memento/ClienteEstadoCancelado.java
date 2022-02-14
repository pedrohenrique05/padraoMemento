package memento;

public class ClienteEstadoCancelado implements ClienteEstado{

    private ClienteEstadoCancelado(){}

    private static ClienteEstadoCancelado instance = new ClienteEstadoCancelado();

    public static ClienteEstadoCancelado getInstance(){
        return instance;
    }

    @Override
    public String getEstado(){
        return "Cliente cancelado";
    }
    @Override
    public String cadastrar(Cliente cliente) {
        return "cadastrado inválido, Cliente já cancelado!";
    }

    @Override
    public String ativar(Cliente cliente) {
        return "Ativação inválida, Cliente já cancelado!";
    }

    @Override
    public String pendencia(Cliente cliente) {
        return "Pendencia inválida, Cliente já cancelado!";
    }

    @Override
    public String cancelar(Cliente cliente) {
        return "Cliente já cancelado!";
    }
}

