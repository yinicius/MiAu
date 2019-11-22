import java.util.ArrayList;

public class GerenteCuidador {
    private ArrayList<Cuidador> cuidadores;

    public GerenteCuidador(){
        cuidadores = new ArrayList<Cuidador>();
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

    public void adicionarCuidador(String nome, String sobrenome, int idade, String CPF, String endereço, String detalhes){
        Cuidador cuidador = new Cuidador(nome, sobrenome, idade, CPF, endereço, detalhes);
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

    public void editarCuidador(String cpf,String nome, String sobrenome, int idade, String CPF, String endereço, String detalhes){
        int posicao = buscarIndiceCuidador(cpf);
        cuidadores.get(posicao).setNome(nome);
        cuidadores.get(posicao).setSobrenome(sobrenome);
        cuidadores.get(posicao).setIdade(idade);
        cuidadores.get(posicao).setCpf(CPF);
        cuidadores.get(posicao).setEndereço(endereço);
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
}