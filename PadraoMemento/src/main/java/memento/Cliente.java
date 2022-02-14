package memento;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private List<ClienteEstado> memento = new ArrayList<ClienteEstado>();
    private String nome;
    private int cod;
    private ClienteEstado estado;

    public Cliente(){
        this.estado = ClienteEstadoCadastrado.getInstance();
    }

    public void setEstado(ClienteEstado estado){
        this.estado = estado;
        this.memento.add(this.estado);
    }

    public List<ClienteEstado> getEstados(){
        return this.memento;
    }

    public void restauraEstado(int indice){
        if(indice < 0 || indice > this.memento.size() - 1){
            throw  new IllegalArgumentException("Indice inválido!");
        }

        this.estado = this.memento.get(indice);
    }
    public String getNomeEstado(){
        return estado.getEstado();
    }

    public String Ativo(){
        return estado.ativar(this);
    }

    public String Pendencia(){
        return estado.pendencia(this);
    }

    public String Cancelado(){
        return estado.cancelar(this);
    }

    public String Cadastrar(){
        return estado.cadastrar(this);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCod() {
        return this.cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public ClienteEstado getEstado(){
        return this.estado;
    }
}
