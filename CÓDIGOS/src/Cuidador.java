import java.util.ArrayList;
import java.util.List;

public class Cuidador {
    private String nome;
    private String sobrenome;
    private int idade;
    private String CPF;
    private String endereco;
    private String detalhes;
    private ArrayList<Hospedagem> hospedagens;
    private ArrayList<Creche> creches;
    private ArrayList<Passeio> passeios;
    private ArrayList<Avaliacao> avaliacoes;
    
    public Cuidador(String nome, String sobrenome, int idade, String CPF, String endereco, String detalhes) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.CPF = CPF;
        this.endereco = endereco;
        this.detalhes = detalhes;
        hospedagens = new ArrayList<Hospedagem>();
        creches = new ArrayList<Creche>();
        passeios = new ArrayList<Passeio>();
        avaliacoes = new ArrayList<Avaliacao>();

    }

    public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	@Override
    public String toString() {
       return "\nPerfil do cuidador :)\n" + "Nome: " + nome + "\n" + "Sobrenome: " + sobrenome + "\n" + "Idade: " + idade 
    		   + "\n" + "CPF: " + CPF + "\n" + "Endereço: " + endereco + "\n" + "Detalhes: " + detalhes + "\n" + "Hospedagens: "
    		   + hospedagens.size() + "\n" + "Creches: " + creches.size() + "\n" + "Passeios: " + passeios.size() + "\n" + 
    		   "Avaliações de clientes: " + avaliacoes;
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
        this.CPF = cpf;
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


	public void setHospedagens(ArrayList<Hospedagem> hospedagens) {
		this.hospedagens = hospedagens;
	}


	public ArrayList<Creche> getCreches() {
		return creches;
	}


	public void setCreches(ArrayList<Creche> creches) {
		this.creches = creches;
	}


	public ArrayList<Passeio> getPasseios() {
		return passeios;
	}


	public void setPasseios(ArrayList<Passeio> passeios) {
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
    
    public void avaliacao(Avaliacao avaliacao) {
    	avaliacoes.add(avaliacao);
    }
}