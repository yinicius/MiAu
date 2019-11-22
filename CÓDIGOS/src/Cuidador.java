public class Cuidador {
    private String nome;
    private String sobrenome;
    private int idade;
    private String cpf;
    private String endereço;
    private String detalhes;

    public Cuidador(String n, String s, int ida, String cpf, String end, String det) {
        this.nome = n;
        this.sobrenome = s;
        this.idade = ida;
        this.cpf = cpf;
        this.detalhes = end;
        this.endereço = det;
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
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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