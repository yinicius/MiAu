public class Avaliacao{
    private float nota;
    private String detalhes;

    public Avaliacao(){};
    public Avaliacao(float nota, String detalhes) {
        this.nota = nota;
        this.detalhes = detalhes;
    }

    @Override
    public String toString() {
        return "\nNota:" + nota + "\nDetalhes: " + detalhes;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
}
