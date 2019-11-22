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

    public void adicionarCliente(String nome, String sobrenome, int idade, String CPF, String endereço){
        Cliente cliente = new Cliente(nome, sobrenome, idade, CPF, endereço);
        clientes.add(cliente);
    }

    public void cadastrarGato(String CPF, String nomePet, int idadePet, String detalhes, String raça){
        Gato gato = new Gato(nomePet, idadePet, detalhes, raça);
        int posicao = buscarIndiceCliente(CPF);
        clientes.get(posicao).cadastrarGato(gato);
    }

    public void cadastrarCachorro(String CPF, String nomePet, int idadePet, String detalhes, String raça){
        Cachorro cachorro = new Cachorro(nomePet, idadePet, detalhes, raça);
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
}