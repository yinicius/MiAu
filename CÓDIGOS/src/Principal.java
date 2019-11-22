import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        GerenteCuidador gerenteCuidador = new GerenteCuidador();
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;
        System.out.println("Digite 1 para adicionar cliente. \n" +
                           "Digite 2 para adicionar cuidador. \n" +
                           "Digite 3 para adicionar um pet cachorro. \n" +
                           "Digite 4 para adicionar um pet gato. \n" +
                           "Digite 5 para mostrar \n" +
                           "Digite 6 para sair");
        String nome;
        String nomePet;
        String sobrenome;
        int idade;
        int idadePet;
        String raça;
        String CPF;
        String line;
        String endereço;
        while(stop) {
            String op = scanner.nextLine();
            switch (op){
                case "1":
                    System.out.println("Digite o nome");
                    nome = scanner.nextLine();
                    System.out.println("Digite o sobrenome");
                    sobrenome = scanner.nextLine();
                    System.out.println("Digite a idade");
                    idade = scanner.nextInt();
                    System.out.println("Digite o CPF");
                    CPF = scanner.nextLine();
                    line = scanner.nextLine();
                    System.out.println("Digite o endereço");
                    endereço = scanner.nextLine();
                    gerente.adicionarCliente(nome, sobrenome, idade, CPF, endereço);
                    break;
                case "2":
                    System.out.println("Digite o nome");
                    nome = scanner.nextLine();
                    System.out.println("Digite o sobrenome");
                    sobrenome = scanner.nextLine();
                    System.out.println("Digite a idade");
                    idade = scanner.nextInt();
                    System.out.println("Digite o CPF");
                    CPF = scanner.nextLine();
                    System.out.println("Digite o endereço");
                    endereço = scanner.nextLine();
                    System.out.println("Digite o detalhes");
                    String detalhes = scanner.nextLine();
                    gerenteCuidador.adicionarCuidador(nome, sobrenome, idade, CPF, endereço, detalhes);
                    break;
                case "3":
                    System.out.println("Digite o CPF");
                    CPF = scanner.nextLine();
                    System.out.println("Digite o nome do Pet");
                    nomePet = scanner.nextLine();
                    System.out.println("Digite a idade do Pet");
                    idadePet = scanner.nextInt();
                    System.out.println("Digite os detalhes");
                    detalhes = scanner.nextLine();
                    System.out.println("Digite a raça");
                    raça = scanner.nextLine();
                    gerente.cadastrarGato(CPF, nomePet, idadePet, detalhes, raça);
                    break;
                case "4":
                    System.out.println("Digite o CPF");
                    CPF = scanner.nextLine();
                    System.out.println("Digite o nome do Pet");
                    nomePet = scanner.nextLine();
                    System.out.println("Digite a idade do Pet");
                    idadePet = scanner.nextInt();
                    System.out.println("Digite os detalhes");
                    detalhes = scanner.nextLine();
                    System.out.println("Digite a raça");
                    raça = scanner.nextLine();
                    gerente.cadastrarCachorro(CPF, nomePet, idadePet, detalhes, raça);
                    break;
                case "5":
                    System.out.println(gerente.getClientes());
                    break;
                case "6":
                    stop = false;
                    break;
                default:
                    System.out.println("Este não é uma opção válida!");
                    break;
            }
        }
    }
}