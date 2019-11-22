import java.util.Scanner;
public class Principal {
    public static void menu() {
        System.out.print("Digite 1 para adicionar cliente. \n" +
                "Digite 2 para adicionar cuidador. \n" +
                "Digite 3 para adicionar um pet cachorro. \n" +
                "Digite 4 para adicionar um pet gato. \n" +
                "Digite 5 escolher a atividade \n" +
                "Digite 6 para mostrar os clientes \n"
                + "Digite 7 para ver os cuidadores\n"
                + "Digite 8 para sair\n");
    }
    public static void main(String[] args) {
        Gerente gerente = Gerente.getInstance();
        GerenteCuidador gerenteCuidador = new GerenteCuidador();
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;
        String nome;
        String nomePet;
        String sobrenome;
        int idade;
        int idadePet;
        String raca;
        String CPF;
        String endereco;
        while(stop) {
            menu();
            String op = scanner.next();
            switch (op){
                case "1":
                    System.out.print("Digite o nome\n");
                    nome = scanner.next();
                    System.out.print("Digite o sobrenome\n");
                    sobrenome = scanner.next();
                    System.out.print("Digite a idade\n");
                    idade = scanner.nextInt();
                    System.out.print("Digite o CPF\n");
                    CPF = scanner.next();
                    System.out.print("Digite o endereco");
                    scanner = new Scanner(System.in);
                    endereco = scanner.nextLine();
                    try{
                        gerente.adicionarCliente(nome, sobrenome, idade, CPF, endereco);
                    }catch(Exception a){
                        System.out.println( a.getMessage());
                    }

                    break;
                case "2":

                    System.out.print("Digite o nome\n");
                    nome = scanner.next();
                    System.out.print("Digite o sobrenome\n");
                    sobrenome = scanner.next();
                    System.out.print("Digite a idade\n");
                    idade = scanner.nextInt();
                    System.out.print("Digite o CPF\n");
                    CPF = scanner.next();
                    System.out.print("Digite o endereço\n");
                    scanner = new Scanner(System.in);
                    endereco = scanner.nextLine();
                    System.out.print("Digite o detalhes\n");
                    String detalhes = scanner.nextLine();
                    gerenteCuidador.adicionarCuidador(nome, sobrenome, idade, CPF, endereco, detalhes);
                    break;
                case "3":
                    scanner = new Scanner(System.in);
                    System.out.print("Digite o CPF\n");
                    CPF = scanner.nextLine();
                    System.out.print("Digite o nome do Pet\n");
                    nomePet = scanner.nextLine();
                    System.out.print("Digite a idade do Pet\n");
                    idadePet = scanner.nextInt();
                    System.out.print("Digite os detalhes\n");
                    detalhes = scanner.nextLine();
                    System.out.print("Digite a raça\n");
                    raca = scanner.nextLine();
                    gerente.cadastrarGato(CPF, nomePet, idadePet, detalhes, raca);
                    break;
                case "4":
                    scanner = new Scanner(System.in);
                    System.out.print("Digite o CPF\n");
                    CPF = scanner.nextLine();
                    System.out.print("Digite o nome do Pet\n");
                    nomePet = scanner.nextLine();
                    System.out.print("Digite a idade do Pet\n");
                    idadePet = scanner.nextInt();
                    System.out.print("Digite os detalhes\n");
                    detalhes = scanner.nextLine();
                    System.out.print("Digite a raca\n");
                    raca = scanner.nextLine();
                    gerente.cadastrarCachorro(CPF, nomePet, idadePet, detalhes, raca);
                    break;
                case "5":
                    scanner = new Scanner(System.in);
                    System.out.println("Digite 1 para hospedagem \n"
                			+ "Digite 2 para passeio \n"
                			+ "Digite 3 para creche");
                    scanner = new Scanner(System.in);
                	int opcao = scanner.nextInt();
                	switch(opcao){
	                	case 1:
                            scanner = new Scanner(System.in);
                            System.out.println("Digite seu CPF");
	                		CPF = scanner.nextLine();
	                		System.out.println("Digite o periodo de hospegame(em dias)");
	                		int periodo = scanner.nextInt();
	                		System.out.println("Digite o local de hospedagem");
	                		String local = scanner.nextLine();
	                		System.out.println("Digite os detalhes da hospedagem");
	                		detalhes = scanner.nextLine();
	                		for (int i = 0; i < gerenteCuidador.getCuidadores().size(); i++) {
	                			System.out.print(i+1);
	                			System.out.println(" "+gerenteCuidador.getCuidadores().get(i).getNome());
	                		} 
	                		int cuidador = scanner.nextInt();
	                		gerenteCuidador.agendarHospedagem(cuidador, CPF, periodo, local, detalhes);
	                		break;
	                case 2:

                        System.out.println("Digite seu CPF");
	            		CPF = scanner.nextLine();
	            		System.out.println("Digite a data do passeio");
	            		String data = scanner.nextLine();
	            		System.out.println("Digite a hora do passeio");
                        scanner = new Scanner(System.in);
	            		float hora = scanner.nextFloat();
	            		System.out.println("Digite a dura��o do passeio");
                        scanner = new Scanner(System.in);
	            		float duracao = scanner.nextFloat();
	            		System.out.println("Digite os detalhes do passeio");
	            		detalhes = scanner.nextLine();
	            		for (int i = 0; i < gerenteCuidador.getCuidadores().size(); i++) {
	            			System.out.println(i+1);
	            			System.out.println(gerenteCuidador.getCuidadores().get(i).getNome());
	            		} 
	            		cuidador = scanner.nextInt();
	            		gerenteCuidador.agendarPasseio(cuidador, CPF, data, hora, duracao, detalhes);
	            		break;
	                case 3:
                        scanner = new Scanner(System.in);
                        System.out.println("Digite seu CPF");
	            		CPF = scanner.nextLine();
	            		System.out.println("Digite a data da creche");
	            		data = scanner.nextLine();
	            		System.out.println("Digite a hora da creche");
	            		hora = scanner.nextFloat();
	            		System.out.println("Digite a dura��o da creche");
	            		duracao = scanner.nextFloat();
	            		System.out.println("Digite os detalhes da creche");
	            		detalhes = scanner.nextLine();
	            		for (int i = 0; i < gerenteCuidador.getCuidadores().size(); i++) {
	            			System.out.println(i+1);
	            			System.out.println(gerenteCuidador.getCuidadores().get(i).getNome());
	            		} 
	            		cuidador = scanner.nextInt();
	            		gerenteCuidador.agendarCreche(cuidador, CPF, data, hora, duracao, detalhes);
	            		break;
            	}
                case "6":
                    System.out.println(gerente.getClientes());
                    break;
                case "7":
                	System.out.println(gerenteCuidador.getCuidadores());
                    break;
                case "8":
                	stop = false;
                	break;
                default:
                    System.out.println("Este não é uma opção válida!");
                    break;
            }
        }
    }
}