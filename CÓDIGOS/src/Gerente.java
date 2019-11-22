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
}