public class Gato extends Pet {
    private String raca;

    public Gato(){};
    public Gato(String nomePet, int idade, String detalhes, String raca){
        super(nomePet, idade, detalhes);
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raça='" + raca + '\'' +
                '}';
    }
}
