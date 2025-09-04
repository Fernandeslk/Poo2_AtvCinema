public class Ingresso {
    private String tipo;
    private Cliente cliente;
    private Sessao sessao;

    public Ingresso(){}

    public Ingresso(String tipo, Cliente cliente, Sessao sessao) {
        this.tipo = tipo;
        this.cliente = cliente;
        this.sessao = sessao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
}
