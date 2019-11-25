public class Cachorro extends Pet {
    private String raca;

    public Cachorro(){};
    public Cachorro(String nomePet, int idade, String detalhes, String raca){
        super(nomePet, idade, detalhes);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro: " + "Raça: " + raca;
    }
}
