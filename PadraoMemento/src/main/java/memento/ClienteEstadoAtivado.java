package memento;

public class ClienteEstadoAtivado implements ClienteEstado{

    private ClienteEstadoAtivado(){}

    private static ClienteEstadoAtivado instance = new ClienteEstadoAtivado();

    public static ClienteEstadoAtivado getInstance(){
        return instance;
    }

    @Override
    public String getEstado(){
        return "Cliente ativado!";
    }
    @Override
    public String cadastrar(Cliente cliente) {
        return "Cadastro inválido, cliente já cadastro!";
    }

    @Override
    public String ativar(Cliente cliente) {
        return "Ativação inválida, cliente já ativo!";
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
