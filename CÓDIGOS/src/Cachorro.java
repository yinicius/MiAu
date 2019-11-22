public class Cachorro extends Pet {
    private String raça;

    public Cachorro(){};
    public Cachorro(String nomePet, int idade, String detalhes, String raça){
        super(nomePet, idade, detalhes);
        this.raça = raça;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "raça='" + raça + '\'' +
                '}';
    }
}
