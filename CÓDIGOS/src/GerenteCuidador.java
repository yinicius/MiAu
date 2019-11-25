import java.util.ArrayList;

public class GerenteCuidador {
    private ArrayList<Cuidador> cuidadores;
    private GerenteCliente gerente;
    private static GerenteCuidador gerenteCuidador;
    public GerenteCuidador(){
        cuidadores = new ArrayList<Cuidador>();
        gerente = GerenteCliente.getInstance();
        Cuidador cuidador1 =  new Cuidador("Beatriz", "Sgobi", 18,"1","Rua Jos� de Queiroz Pessoa", "Adoro cuidar de todo tipo de pet. <3");
        cuidadores.add(cuidador1);
        Cuidador cuidador2 =  new Cuidador("Leth�ssia", "Sousa", 19,"2","Rua Tropical", "Eu AMO cachorro!!!");
        cuidadores.add(cuidador2);
        Cuidador cuidador3 =  new Cuidador("Nery", "Filho", 21,"3","Rua Linha do Trem", "Prefiro gatos.");
        cuidadores.add(cuidador3);
    }
    public static GerenteCuidador getInstance(){
        if(gerenteCuidador == null){
            gerenteCuidador = new GerenteCuidador();
        }
        return gerenteCuidador;
    }

    @Override
    public String toString() {
        return "Gerente de cuidadores! \n" +
                "Lista de cuidadores: \n" + cuidadores;
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
        if (buscarIndiceCuidador(cpf) == -1) {
            return false;
        }
        cuidadores.remove(buscarIndiceCuidador(cpf));
        return true;
    }
    
    public boolean agendarHospedagem(int cuidador,String cpf, int periodo, String local, String detalhes) throws Exception {
    	if(gerente.verificarCliente(cpf)) {
    		if(gerente.buscarCliente(cpf).getPets().size() > 0) {
    			Hospedagem hospedagem = new Hospedagem(periodo, local, detalhes);
    			cuidadores.get(cuidador-1).hospedagem(hospedagem);	
    			return true;
    		}
    	}
    	throw new IndexOutOfBoundsException("Erro cuidador selecionado inválido! Tente novamente.");
    	
    }
    
    public void pagamentoHospedagem (int cuidador) {
    	cuidadores.get(cuidador-1).getHospedagens().get(cuidadores.get(cuidador-1).getHospedagens().size()-1).pagamento();
    }
    
    public boolean agendarPasseio(int cuidador,String cpf, String data, float hora, float duracao, String detalhes) {
    	if(gerente.verificarCliente(cpf)) {
    		if(gerente.buscarCliente(cpf).getPets().size() > 0) {
    			Passeio passeio = new Passeio(data, hora, duracao, detalhes);
    			cuidadores.get(cuidador-1).passeio(passeio);
    			return true;
    		}
    	}
    	throw new IndexOutOfBoundsException("Erro cuidador selecionado inv�lido! Tente novamente.");
    }
    
    public void pagamentoPasseio (int cuidador) {
    	cuidadores.get(cuidador-1).getPasseios().get(cuidadores.get(cuidador-1).getPasseios().size()-1).pagamento();
    }
    
    public boolean agendarCreche(int cuidador, String cpf, String data, float hora, float duracao, String detalhes) {
    	if(gerente.verificarCliente(cpf)) {
    		if(gerente.buscarCliente(cpf).getPets().size() > 0) {
    			Creche creche = new Creche(data, hora, duracao, detalhes);
    			cuidadores.get(cuidador-1).creche(creche);
    			return true;
    		}
    	}
    	throw new IndexOutOfBoundsException("Erro cuidador selecionado inv�lido! Tente novamente.");
    }
    
    public void pagamentoCreche (int cuidador) {
    	cuidadores.get(cuidador-1).getCreches().get(cuidadores.get(cuidador-1).getCreches().size()-1).pagamento();
    }
    
    public void avaliarCuidador (int cuidador, float nota, String detalhes) {
    	Avaliacao avaliacao = new Avaliacao(nota, detalhes);
    	cuidadores.get(cuidador).avaliacao(avaliacao);
    }
}





