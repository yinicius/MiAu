import java.util.ArrayList;

public class GerenteCuidador {
    private ArrayList<Cuidador> cuidadores;
    private Gerente gerente;
    public GerenteCuidador(){
        cuidadores = new ArrayList<Cuidador>();
        gerente = Gerente.getInstance();
        Cuidador cuidador =  new Cuidador("Gui", "Rodrigues", 20,"2","aaa", "UHUM");
        cuidadores.add(cuidador);
    }

    @Override
    public String toString() {
        return "Gerente \n" +
                "cuidadores = " + cuidadores;
    }

    public ArrayList<Cuidador> getCuidadores() {
        return cuidadores;
    }

    public void setCuidadores(ArrayList<Cuidador> cuidadores) {
        this.cuidadores = cuidadores;
    }

    public void adicionarCuidador(String nome, String sobrenome, int idade, String CPF, String endereco, String detalhes){
        Cuidador cuidador = new Cuidador(nome, sobrenome, idade, CPF, endereco, detalhes);
        cuidadores.add(cuidador);
    }

    public boolean verificarCuidador (String cpf) {
        for(int i = 0; i < cuidadores.size(); i++) {
            if(cuidadores.get(i).getCpf().equals(cpf)) {
                return true;
            }
        }
        return false;
    }

    public void editarCuidador(String cpf, String nome, String sobrenome, int idade, String CPF, String endereco, String detalhes){
        int posicao = buscarIndiceCuidador(cpf);
        cuidadores.get(posicao).setNome(nome);
        cuidadores.get(posicao).setSobrenome(sobrenome);
        cuidadores.get(posicao).setIdade(idade);
        cuidadores.get(posicao).setCpf(CPF);
        cuidadores.get(posicao).setEndereco(endereco);
        cuidadores.get(posicao).setDetalhes(detalhes);

    }
    public Cuidador buscarCuidador(String cpf) {
        for(int i = 0; i < cuidadores.size(); i++) {
            if(cuidadores.get(i).getCpf().equals(cpf)) {
                return cuidadores.get(i);
            }
        }
        return null;
    }
    public int buscarIndiceCuidador(String cpf) {
        for(int i = 0; i < cuidadores.size(); i++) {
            if(cuidadores.get(i).getCpf().equals(cpf)) {
                return i;
            }
        }
        return -1;
    }
    public boolean removerCuidador (String cpf) {
        int posicao = buscarIndiceCuidador(cpf);
        if (posicao == -1) {
            return false;
        }
        cuidadores.remove(posicao);
        return true;
    }
    
    public void agendarHospedagem(int cuidador,String cpf, int periodo, String local, String detalhes) {
    	if(gerente.verificarCliente(cpf)) {
    		if(gerente.buscarCliente(cpf).getPets().size() > 0) {
    			Hospedagem hospedagem = new Hospedagem(periodo, local, detalhes);
    			cuidadores.get(cuidador-1).hospedagem(hospedagem);
    		}
    	}
    }
    
    public void agendarPasseio(int cuidador,String cpf, String data, float hora, float duracao, String detalhes) {
    	if(gerente.verificarCliente(cpf)) {
    		if(gerente.buscarCliente(cpf).getPets().size() > 0) {
    			Passeio passeio = new Passeio(data, hora, duracao, detalhes);
    			cuidadores.get(cuidador-1).passeio(passeio);
    		}
    	}
    }
    
    public void agendarCreche(int cuidador, String cpf, String data, float hora, float duracao, String detalhes) {
    	if(gerente.verificarCliente(cpf)) {
    		if(gerente.buscarCliente(cpf).getPets().size() > 0) {
    			Creche creche = new Creche(data, hora, duracao, detalhes);
    			cuidadores.get(cuidador-1).creche(creche);
    		}
    	}
    }
    
    
}





