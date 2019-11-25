import java.util.ArrayList;

public class GerenteCliente {
    private ArrayList<Cliente> clientes;
    private static GerenteCliente gerente;
    private GerenteCliente( ) {
        this.clientes = new ArrayList<Cliente>();
        Cliente cliente4 =  new Cliente("Vinícius", "Melo", 20, "4","Rua Epitácio Pessoa");
        clientes.add(cliente4);
        Cliente cliente5 =  new Cliente("Letícia", "Mirella", 19, "5","Rua Ramlive");
        clientes.add(cliente5);
        Cliente cliente6 =  new Cliente("Carlos", "Almeida", 21, "6","Rua Praça Leão");
        clientes.add(cliente6);

    }

    public static GerenteCliente getInstance(){
        if(gerente == null){
            gerente = new GerenteCliente();
        }
        return gerente;
    }

    @Override
    public String toString() {
        return "Gerente de clientes! \n" +
                "Lista de clientes: \n" + clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void adicionarCliente(String nome, String sobrenome, int idade, String CPF, String endereco) throws Exception {
        if(buscarCliente(CPF) == null){
            Cliente cliente = new Cliente(nome, sobrenome, idade, CPF, endereco);
            clientes.add(cliente);
        }else  {
            throw  new Exception("Erro CPF já, cadastrado");
            
        }
    }

    public void cadastrarGato(String CPF, String nomePet, int idadePet, String detalhes, String raca){
        Gato gato = new Gato(nomePet, idadePet, detalhes, raca);
        int posicao = buscarIndiceCliente(CPF);
        clientes.get(posicao).cadastrarGato(gato);
    }

    public void cadastrarCachorro(String CPF, String nomePet, int idadePet, String detalhes, String raca){
        Cachorro cachorro = new Cachorro(nomePet, idadePet, detalhes, raca);
        int posicao = buscarIndiceCliente(CPF);
        clientes.get(posicao).cadastrarCachorro(cachorro);
    }

    public Cliente buscarCliente(String cpf) {
        for(int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getCPF().equals(cpf)) {
                return clientes.get(i);
            }
        }
        return null;
    }
    public int buscarIndiceCliente(String cpf) {
        for(int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getCPF().equals(cpf)) {
                return i;
            }
        }
        return -1;
    }

    public boolean editarCliente(String cpf,String nome, String sobrenome, int idade, String CPF, String endereco){
        if(verificarCliente(cpf)) {
        	int posicao = buscarIndiceCliente(cpf);
            clientes.get(posicao).setNome(nome);
            clientes.get(posicao).setSobrenome(sobrenome);
            clientes.get(posicao).setIdade(idade);
            clientes.get(posicao).setCPF(CPF);
            clientes.get(posicao).setEndereco(endereco);
            return true;
        }
    	return false;
    }

    public boolean removerCliente (String cpf) {
        int posicao = buscarIndiceCliente(cpf);
        if (posicao == -1) {
            return false;
        }
        clientes.remove(posicao);
        return true;
    }

    public boolean verificarCliente (String cpf) {
        for(int i = 0; i < clientes.size(); i++) {
            if(clientes.get(i).getCPF().equals(cpf)) {
                return true;
            }
        }
        return false;
    }
}