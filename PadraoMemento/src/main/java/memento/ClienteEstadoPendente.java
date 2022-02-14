package memento;

public class ClienteEstadoPendente implements ClienteEstado{

    private ClienteEstadoPendente(){}

    private static ClienteEstadoPendente instance = new ClienteEstadoPendente();

    public static ClienteEstadoPendente getInstance(){
        return instance;
    }

    @Override
    public String getEstado(){
        return "Cliente pendente!";
    }
    @Override
    public String cadastrar(Cliente cliente) {
        return "cadastro inválido, Cliente já cadastrado!";
    }

    @Override
    public String ativar(Cliente cliente) {
        cliente.setEstado(ClienteEstadoAtivado.getInstance());
        return "Cliente ativado!";
    }

    @Override
    public String pendencia(Cliente cliente) {
        return "Cliente ja pendente!";
    }

    @Override
    public String cancelar(Cliente cliente) {
        cliente.setEstado(ClienteEstadoCancelado.getInstance());
        return "Cliente cancelado!";
    }
}
