import java.util.List;

public class Cuidador {
    private String nome;
    private String sobrenome;
    private int idade;
    private String CPF;
    private String endereco;
    private String detalhes;
    private List<Hospedagem> hospedagens;
    private List<Creche> creches;
    private List<Passeio> passeios;
    
    public Cuidador(String nome, String sobrenome, int idade, String CPF, String endereco, String detalhes) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereco = endereco;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }


	public String getCPF() {
		return CPF;
	}


	public void setCPF(String cPF) {
		CPF = cPF;
	}


	public List<Hospedagem> getHospedagens() {
		return hospedagens;
	}


	public void setHospedagens(List<Hospedagem> hospedagens) {
		this.hospedagens = hospedagens;
	}


	public List<Creche> getCreches() {
		return creches;
	}


	public void setCreches(List<Creche> creches) {
		this.creches = creches;
	}


	public List<Passeio> getPasseios() {
		return passeios;
	}


	public void setPasseios(List<Passeio> passeios) {
		this.passeios = passeios;
	}
    
    public void hospedagem(Hospedagem hospedagem){
        hospedagens.add(hospedagem);
    }

    public void creche(Creche creche){
        creches.add(creche);
    }

    public void passeio(Passeio passeio){
        passeios.add(passeio);
    }
}