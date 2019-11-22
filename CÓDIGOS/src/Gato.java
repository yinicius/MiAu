public class Gato extends Pet {
    private String raça;
    private String tipo;

    public Gato(){};
    public Gato(String nomePet, int idade, String detalhes, String raça){
        super(nomePet, idade, detalhes);
        this.raça = raça;
        this.tipo = "gato";
    };
}
