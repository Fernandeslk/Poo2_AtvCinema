public class Sessao {
    private Sala sala;
    private Filme filme;
    private String horario;
    private int ingressosMax;

    public Sessao(){}

    public Sessao(Sala sala, Filme filme, String horario, int ingressosMax) {
        this.sala = sala;
        this.filme = filme;
        this.horario = horario;
        this.ingressosMax = ingressosMax;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getIngressosMax() {
        return ingressosMax;
    }

    public void setIngressosMax(int ingressosMax) {
        this.ingressosMax = ingressosMax;
    }
}
