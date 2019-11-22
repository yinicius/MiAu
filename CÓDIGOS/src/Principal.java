import java.util.Scanner;
public class Principal {
    public static void menu() {
        System.out.println("Digite 1 para adicionar cliente. \n" +
                "Digite 2 para adicionar cuidador. \n" +
                "Digite 3 para adicionar um pet cachorro. \n" +
                "Digite 4 para adicionar um pet gato. \n" +
                "Digite 5 escolher a atividade \n" +
                "Digite 6 para mostrar os clientes \n"
                + "Digite 7 para ver os cuidadores\n"
                + "Digite 8 para ");
    }
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
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
            String op = scanner.nextLine();
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
                    endereco = scanner.next();
                    gerente.adicionarCliente(nome, sobrenome, idade, CPF, endereco);
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
                    System.out.println("Digite o endere√ßo");
                    endereco = scanner.nextLine();
                    System.out.println("Digite o detalhes");
                    String detalhes = scanner.nextLine();
                    gerenteCuidador.adicionarCuidador(nome, sobrenome, idade, CPF, endereco, detalhes);
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
                    System.out.println("Digite a ra√ßa");
                    raca = scanner.nextLine();
                    gerente.cadastrarGato(CPF, nomePet, idadePet, detalhes, raca);
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
                    System.out.println("Digite a raÁa");
                    raca = scanner.nextLine();
                    gerente.cadastrarCachorro(CPF, nomePet, idadePet, detalhes, raca);
                    break;
                case "5":
                	System.out.println("Digite 1 para hospedagem /n"
                			+ "Digite 2 para passeio /n"
                			+ "Digite 3 para creche");
                	int opcao = scanner.nextInt();
                	switch(opcao){
	                	case 1:
	                		System.out.println("Digite seu CPF");
	                		CPF = scanner.nextLine();
	                		System.out.println("Digite o periodo de hospegame(em dias)");
	                		int periodo = scanner.nextInt();
	                		System.out.println("Digite o local de hospedagem");
	                		String local = scanner.nextLine();
	                		System.out.println("Digite os detalhes da hospedagem");
	                		detalhes = scanner.nextLine();
	                		for (int i = 0; i < gerenteCuidador.getCuidadores().size(); i++) {
	                			System.out.println(i+1);
	                			System.out.println(gerenteCuidador.getCuidadores().get(i).getNome());
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
	            		float hora = scanner.nextFloat();
	            		System.out.println("Digite a duraÁ„o do passeio");
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
	            		System.out.println("Digite seu CPF");
	            		CPF = scanner.nextLine();
	            		System.out.println("Digite a data da creche");
	            		data = scanner.nextLine();
	            		System.out.println("Digite a hora da creche");
	            		hora = scanner.nextFloat();
	            		System.out.println("Digite a duraÁ„o da creche");
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
                    System.out.println("Este n√£o √© uma op√ß√£o v√°lida!");
                    break;
            }
        }
    }
}