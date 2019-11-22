import java.util.ArrayList;

public class Gerente {
    private ArrayList<Cliente> clientes;

    public Gerente( ) {
        this.clientes = new ArrayList<Cliente>();
    }

    @Override
    public String toString() {
        return "Gerente \n" +
                "clientes = " + clientes;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void adicionarCliente(String nome, String sobrenome, int idade, String CPF, String endereco){
        Cliente cliente = new Cliente(nome, sobrenome, idade, CPF, endereco);
        clientes.add(cliente);
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

    public void editarCliente(String cpf,String nome, String sobrenome, int idade, String CPF, String endereco){
        int posicao = buscarIndiceCliente(cpf);
        clientes.get(posicao).setNome(nome);
        clientes.get(posicao).setSobrenome(sobrenome);
        clientes.get(posicao).setIdade(idade);
        clientes.get(posicao).setCPF(CPF);
        clientes.get(posicao).setEndereco(endereco);

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