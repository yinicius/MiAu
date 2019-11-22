public class Cachorro extends Pet {
    private String raça;
    private String tipo;

    public Cachorro(){};
    public Cachorro(String nomePet, int idade, String detalhes, String raça){
        super(nomePet, idade, detalhes);
        this.raça = raça;
        this.tipo = "cachorro";
    };
}
