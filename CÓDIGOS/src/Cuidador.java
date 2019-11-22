public class Cuidador {
    private String nome;
    private String sobrenome;
    private int idade;
    private String CPF;
    private String endereço;
    private String detalhes;

    public Cuidador(String nome, String sobrenome, int idade, String CPF, String endereço, String detalhes) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereço = endereço;
        this.detalhes = detalhes;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return CPF;
    }

    public void setCpf(String cpf) {
        this.CPF = CPF;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

}