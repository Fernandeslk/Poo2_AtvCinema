import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Sala> salas;
    private List<Filme> filmes;

    public Cinema() {
        this.salas = new ArrayList<>();
        this.filmes = new ArrayList<>();
    }

    public Cinema(List<Sala> salas, List<Filme> filmes) {
        this.salas = salas;
        this.filmes = filmes;
    }

    public List<Sala> getSalas() {
        return salas;
    }

    public void setSalas(List<Sala> salas) {
        this.salas = salas;
    }

    public List<Filme> getFilmes() {
        return filmes;
    }

    public void setFilmes(List<Filme> filmes) {
        this.filmes = filmes;
    }
}
