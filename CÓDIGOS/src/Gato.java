public class Gato extends Pet {
    private String raça;

    public Gato(){};
    public Gato(String nomePet, int idade, String detalhes, String raça){
        super(nomePet, idade, detalhes);
        this.raça = raça;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "raça='" + raça + '\'' +
                '}';
    }
}
