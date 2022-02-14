package memento;

public interface ClienteEstado {

    public String getEstado();

    public String cadastrar(Cliente cliente);

    public String ativar(Cliente cliente);

    public String pendencia(Cliente cliente);

    public String cancelar(Cliente cliente);

}
