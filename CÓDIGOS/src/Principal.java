import java.util.InputMismatchException;
import java.util.Scanner;
public class Principal {
    public static void menu() {
        System.out.print("Bem-vindo(a) ao MiAu, digite a opção desejada :) \n" +
        		"1 - Sobre o MiAu. \n" +
                "2- Menu do cliente. \n" +
                "3 - Menu do cuidador. \n" +
                "4 - Sair. \n");
    }
    public static void menuCliente() {
    	System.out.print("Seja bem-vindo(a) ao menu do(a) cliente, o que deseja? :D \n"+ 
    	"1 - Cadastrar cliente. \n" +
        "2 - Cadastrar pet. \n" +
        "3 - Solicitar um serviço. \n" +
        "4 - Exibir lista de clientes. \n" +
        "5 - Editar cliente. \n" +
        "6 - Remover cliente. \n" +
        "7 - Buscar cliente. \n" +
        "8 - Avaliar um cuidador. \n");
    }
    
    public static void menuCuidador() {
    	System.out.print("Seja bem-vindo(a) ao menu do(a) cuidador(a), o que deseja? :D \n" +
    	"1 - Cadastrar cuidador. \n" +
        "2 - Exibir lista de cuidadores. \n" +
    	"3 - Editar cuidador. \n" +
        "4 - Remover cuidador. \n" +
        "5 - Buscar cuidador. \n");
    }
    
    public static void menuPet() {
    	System.out.print("1 - Cadastrar cachorro. \n" +
        "2 - Cadastrar gato. \n");
    	
    }
    			
    @SuppressWarnings("finally")
	public static void main(String[] args) {
        GerenteCliente gerenteCliente = GerenteCliente.getInstance();
        GerenteCuidador gerenteCuidador = GerenteCuidador.getInstance();
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;
        String nome;
        String nomePet;
        String sobrenome;
        int idade;
        int idadePet;
        String raca, data, CPF;
        String endereco;
        String detalhes; 
        int cuidador;
        float hora, duracao;
        while(stop) {
            menu();
            String op = scanner.next();
            switch (op){
            	case "1": //sobre o MiAu
            		System.out.print("O MiAu é um sistema de trocas entre donos de pet e cuidadores,"
            		+ " oferecendo serviços essenciais: \nhospedagem, passeio e creche com preços que cabem no seu bolso. :D \n"); 
            		break;
            		
            	case "2"://menu cliente 
            		menuCliente();
            		int opCliente=scanner.nextInt();
            		switch (opCliente){
                    case 1: //adicionar cliente
                        
                        try{
                        	System.out.print("Nome: \n");
                            nome = scanner.next();
                            System.out.print("Sobrenome: \n");
                            sobrenome = scanner.next();
                            scanner = new Scanner(System.in);
                            System.out.print("Idade: \n");
                            idade = scanner.nextInt();
                            System.out.print("CPF: \n");
                            CPF = scanner.next();
                            System.out.print("Endereço: \n");
                            scanner = new Scanner(System.in);
                            endereco = scanner.nextLine();
                        	gerenteCliente.adicionarCliente(nome, sobrenome, idade, CPF, endereco);
                        	 System.out.print("Eba, cadastro realizado com sucesso! :D \n");
                        }catch(InputMismatchException a){
                            System.err.println("Erro idade precisa ser um número inteiro");
                        }catch(Exception a) {
                        	System.err.println(a.getMessage());
                        }finally {
                            scanner = new Scanner(System.in);
                        	break;
						}
                 
                        
                    case 2: //cadastrar pet cachorro ou gato
                    	menuPet();
                    	int opPet=scanner.nextInt();
                    	switch (opPet) {
                    	case 1: //adicionar cachorro
                    		scanner = new Scanner(System.in);
                            System.out.print("CPF do dono: \n");
                            CPF = scanner.nextLine();
                            System.out.print("Nome do pet: \n");
                            nomePet = scanner.nextLine();
                            System.out.print("Idade do pet: \n");
                            idadePet = scanner.nextInt();
                            scanner = new Scanner(System.in);
                            System.out.print("Detalhes (alergias, restrições, preferências): \n");
                            detalhes = scanner.nextLine();
                            scanner = new Scanner(System.in);
                            System.out.print("Digite a raça: \n");
                            raca = scanner.nextLine();
                            if(gerenteCliente.verificarCliente(CPF)) {
                            	gerenteCliente.cadastrarCachorro(CPF, nomePet, idadePet, detalhes, raca);
                                System.out.print("Eba, cachorrinho cadastrado com sucesso! :D \n");
                            }else {
                            	System.out.print("Ops, erro ao adicionar o Pet, verifique o CPF do dono. :( \n");
                            }
                             
                            break;
                    	
                    	case 2: //adicionar gato
                    		scanner = new Scanner(System.in);
                            System.out.print("CPF do dono: \n");
                            CPF = scanner.nextLine();
                            System.out.print("Nome do pet: \n");
                            nomePet = scanner.nextLine();
                            System.out.print("Idade do pet: \n");
                            idadePet = scanner.nextInt();
                            scanner = new Scanner(System.in);
                            System.out.print("Detalhes (alergias, restrições, preferências): \n");
                            detalhes = scanner.nextLine();
                            scanner = new Scanner(System.in);
                            System.out.print("Digite a raça: \n");
                            raca = scanner.nextLine(); 
	                        if(gerenteCliente.verificarCliente(CPF)) {
	                        	gerenteCliente.cadastrarGato(CPF, nomePet, idadePet, detalhes, raca);
	                        	System.out.print("Eba, gatinho cadastrado com sucesso! :D \n");
	                        }else {
	                        	System.out.print("Ops, erro ao adicionar o Pet, verifique o CPF do dono. :( \n");
	                        }
                    	}
                    	break;
                    	
                    case 3: //solicitar serviço
                    	scanner = new Scanner(System.in);
                        System.out.print("1 - Hospedagem \n"
                    			+ "2 - Passeio \n"
                    			+ "3 - Creche \n");
                        scanner = new Scanner(System.in);
                    	int opcao = scanner.nextInt();
                    	
						switch(opcao){
    	                	case 1://hospedagem
    	                		try {
    	                		System.out.print("O serviço de hospedagem cuida do seu pet como uma estrela enquanto você viaja tranquilo! Valor da diária: R$80\n");
                                scanner = new Scanner(System.in);
                                System.out.print("Digite seu CPF: \n");
    	                		CPF = scanner.nextLine();
    	                		System.out.print("Digite a duração da hospedagem (em dias): \n");
    	                		int periodo = scanner.nextInt();
    	                		scanner = new Scanner(System.in);
    	                		System.out.print("Local de hospedagem: \n");
    	                		String local = scanner.nextLine();
    	                		scanner = new Scanner(System.in);
    	                		System.out.print("Detalhes (alergias, restrições, preferências): \n");
    	                		detalhes = scanner.nextLine();
    	                		System.out.print("Escolha o cuidador: \n");
    	                		for (int i = 0; i < gerenteCuidador.getCuidadores().size(); i++) {
    	                			System.out.print(i+1);
    	                			System.out.println(" "+gerenteCuidador.getCuidadores().get(i).getNome());
    	                		}  
    	                		cuidador = scanner.nextInt();
    	                		if (gerenteCuidador.agendarHospedagem(cuidador, CPF, periodo, local, detalhes)) {
    	                			gerenteCuidador.pagamentoHospedagem(cuidador);
    	                			gerenteCliente.buscarCliente(CPF).adicionarCuidador(gerenteCuidador.getCuidadores().get(cuidador-1));
        	                		System.out.print("Eba, hospedagem agendada com sucesso! :D \n");
    	                		}
    	                		else {
    	                			System.out.println("Ops, erro ao agendar a hospedagem. Verifique CPF ou cadastro de pet. :(");
    	                		}
    	                		
    	                		}catch(IndexOutOfBoundsException a) {
    	                			System.err.println(a.getMessage());
    	                		}finally {
    	                			break;
								}
    	                case 2://passeio
    	                	try {
    	                	System.out.print("Sem tempo para mimar e passear com seu pet? Um cuidador faz isso para você! Valor da hora: R$10\n");
    	                	scanner = new Scanner(System.in);
    	                	System.out.print("Digite seu CPF: \n");
    	            		CPF = scanner.nextLine();
    	            		scanner = new Scanner(System.in);
    	            		System.out.print("Data do passeio: \n");
    	            		data = scanner.nextLine();
    	            		scanner = new Scanner(System.in);
    	            		System.out.print("Hora do passeio: \n");
                            scanner = new Scanner(System.in);
    	            		hora = scanner.nextFloat();
    	            		System.out.print("Digite a duração do passeio (em horas): \n");
                            scanner = new Scanner(System.in);
    	            		duracao = scanner.nextFloat();
    	            		scanner = new Scanner(System.in);
    	            		System.out.print("Detalhes (alergias, restrições, preferências): \n");
    	            		detalhes = scanner.nextLine();
    	            		scanner = new Scanner(System.in);
    	            		System.out.print("Escolha o cuidador: \n");
    	            		for (int i = 0; i < gerenteCuidador.getCuidadores().size(); i++) {
    	            			System.out.println(i+1);
    	            			System.out.println(gerenteCuidador.getCuidadores().get(i).getNome());
    	            		}
    	            		cuidador = scanner.nextInt();
    	            		if (gerenteCuidador.agendarPasseio(cuidador, CPF, data, hora, duracao, detalhes)) {
    	            			gerenteCuidador.pagamentoPasseio(cuidador);
    	            			gerenteCliente.buscarCliente(CPF).adicionarCuidador(gerenteCuidador.getCuidadores().get(cuidador-1));
    	                		System.out.print("Eba, passeio agendado com sucesso! :D \n");
	                		}
	                		else {
	                			System.out.println("Ops, erro ao agendar o passeio. Verifique CPF ou cadastro de pet. :(");
	                		}
    	            		break;
    	                	}catch(IndexOutOfBoundsException a) {
    	                		System.err.println(a.getMessage());
    	                	}
    	                case 3://creche
    	                	System.out.print("Passa o dia no trabalho e não quer deixar seu pet sozinho? Um cuidador pode cuidar "
    	                	+ "e brincar com ele! Valor da hora: R$20\n");
                            scanner = new Scanner(System.in);
                            System.out.print("Digite seu CPF: \n");
    	            		CPF = scanner.nextLine();
    	            		System.out.print("Data da creche: \n");
    	            		data = scanner.nextLine();
    	            		System.out.print("Hora da creche: \n");
    	            		hora = scanner.nextFloat();
    	            		System.out.print("Digite a duração da creche (em horas): \n");
    	            		duracao = scanner.nextFloat();
    	            		System.out.print("Detalhes (alergias, restrições, preferências): \n");
    	            		detalhes = scanner.nextLine();
    	            		System.out.print("Escolha o cuidador: \n");
    	            		for (int i = 0; i < gerenteCuidador.getCuidadores().size(); i++) {
    	            			System.out.print(i+1);
    	            			System.out.println(" "+ gerenteCuidador.getCuidadores().get(i).getNome());
    	            		} 
    	            		cuidador = scanner.nextInt();
    	            		if (gerenteCuidador.agendarCreche(cuidador, CPF, data, hora, duracao, detalhes)) {
    	            			gerenteCuidador.pagamentoCreche(cuidador);
	                			gerenteCliente.buscarCliente(CPF).adicionarCuidador(gerenteCuidador.getCuidadores().get(cuidador-1));
    	                		System.out.print("Eba, creche agendada com sucesso! :D \n");
	                		}
	                		else {
	                			System.out.println("Ops, erro ao agendar a creche. Verifique CPF ou cadastro de pet. :(");
	                		}
    	            		break;
                    	}
                    	break;
                    case 4: //exibir lista de clientes
                    	System.out.println(gerenteCliente.getClientes());
                    	break;
                    	
                    case 5: //editar cliente
                    	System.out.print("Digite seu CPF: \n");
                    	String cpf = scanner.next();
                    	System.out.print("Digite o novo nome: \n");
                        nome = scanner.next();
                        System.out.print("Digite o novo sobrenome: \n");
                        sobrenome = scanner.next();
                        System.out.print("Digite a nova idade: \n");
                        idade = scanner.nextInt();
                        System.out.print("Digite o novo CPF: \n");
                        CPF = scanner.next();
                        System.out.print("Digite o novo endereco: \n");
                        scanner = new Scanner(System.in);
                        endereco = scanner.nextLine();
                        if(gerenteCliente.editarCliente(cpf, nome, sobrenome, idade, CPF, endereco)) {
                        	System.out.print("Perfil do cliente editado. :) \n");
                        }else {
                        	System.out.print("Ops, erro ao editar perfil do cliente!) \n");
                        } 
                         
                        break;
                    	
                    case 6: //remover cliente
                    	System.out.print("Digite o CPF: \n");
	                    CPF = scanner.next();
	                    gerenteCliente.removerCliente(CPF);
	                    System.out.print("Tchau! :( \n");
	                    break;
                    	
                    case 7: //buscar cliente
                    	System.out.print("Digite o CPF: \n");
	                    CPF = scanner.next();
	                    if (gerenteCliente.buscarCliente(CPF)==null) {
	                    	System.out.print("Oh não, esse cliente não existe! :( \n");
	                    }
	                    else{
	                    	System.out.print(gerenteCliente.buscarCliente(CPF));
	                    }
                    	break;
                    case 8: //avaliar cuidador
                    	System.out.print("Digite o CPF: \n");
                    	CPF = scanner.next();
                    	if(gerenteCliente.verificarCliente(CPF)) {
                    		System.out.print("Cuidadores para avaliação: ");
                    		for(int i = 0; i < gerenteCliente.buscarCliente(CPF).getCuidadores().size(); i++) {
                    			System.out.print(i+1);
                    			System.out.println(" " + gerenteCliente.buscarCliente(CPF).getCuidadores().get(i).getNome());
                    		}
                    		scanner = new Scanner(System.in);
                    		cuidador = scanner.nextInt();
                    		System.out.println("Nota: ");
                    		float nota = scanner.nextFloat();
                    		System.out.println("Detalhes: ");
                    		scanner=new Scanner(System.in);
                    		detalhes = scanner.nextLine();
                    		gerenteCuidador.avaliarCuidador(cuidador-1, nota, detalhes);
                    		System.out.print("Cuidador avaliado com sucesso! :) ");
                    	}else {
                    		System.out.println("Ops, cliente não cadastrado. :(");
                    	}
                    	
                    	break;
                    }   
            		break;
            		
            	case "3": //menu cuidador
            		menuCuidador();
            		int opCuidador=scanner.nextInt();
            		switch (opCuidador){
            		
            		case 1://adicionar cuidador
	                    System.out.print("Nome: \n");
	                    nome = scanner.next();
	                    System.out.print("Sobrenome: \n");
	                    sobrenome = scanner.next();
	                    System.out.print("Idade: \n");
	                    idade = scanner.nextInt();
	                    System.out.print("CPF: \n");
	                    CPF = scanner.next();
	                    System.out.print("Endereço: \n");
	                    scanner = new Scanner(System.in);
	                    endereco = scanner.nextLine();
	                    System.out.print("Detalhes (qualidades, preferências): \n");
	                    detalhes = scanner.nextLine();
	                    if(!gerenteCuidador.verificarCuidador(CPF)) {
	                    	 gerenteCuidador.adicionarCuidador(nome, sobrenome, idade, CPF, endereco, detalhes);
	 	                    System.out.print("Eba, cadastro realizado com sucesso! :D \n");
	                    }else {
	                    	System.out.println("Ops, já existe um cuidador adicionado com este CPF");
	                    }
	                    
            		break;
            		
            		case 2://exibir lista de cuidadores
            			System.out.println(gerenteCuidador.getCuidadores());
                    break;
                    
            		case 3://editar cuidador
            			System.out.println("Digite seu CPF: ");
                    	String cpf =scanner.next();
                    	System.out.print("Digite o novo nome: \n");
                        nome = scanner.next();
                        System.out.print("Digite o novo sobrenome: \n");
                        sobrenome = scanner.next();
                        System.out.print("Digite a nova idade: \n");
                        idade = scanner.nextInt();
                        System.out.print("Digite o novo CPF: \n");
                        CPF = scanner.next();
                        System.out.print("Digite o endereço: \n");
                        scanner = new Scanner(System.in);
                        endereco = scanner.nextLine();
                        System.out.print("Digite os novos detalhes: \n");
                        detalhes=scanner.next();
                        if(gerenteCuidador.verificarCuidador(cpf)) {
                        	gerenteCuidador.editarCuidador(cpf, nome, sobrenome, idade, CPF, endereco, detalhes);
                            System.out.print("Perfil do cuidador editado. :) \n");
                        }else {
                        	System.out.print("Ops, erro ao editar perfil do cuidador!) \n");
                        }
                         
                        break;
                        
            		case 4: //remover cuidador
            			System.out.print("Digite o CPF: \n");
            			CPF = scanner.next();
	                    if(gerenteCuidador.removerCuidador(CPF)) {
	                    	System.out.print("Tchau! :( \n");
	                    }else {
	                    	System.out.print("Ops, erro ao excluir cuidador \n");
	                    }
	                    
	                    
	                    break;
	                    
            		case 5://buscar cuidador
            			System.out.print("Digite o CPF: \n");
	                    CPF = scanner.next();
	                    if (gerenteCliente.buscarCliente(CPF)==null) {
	                    	System.out.print("Oh não, esse cuidador não existe! :( \n");
	                    }
	                    else{
	                    	System.out.print(gerenteCliente.buscarCliente(CPF));
	                    }
	                    break;
            		}
            		break;
            	case "4"://sair de tudo
                	stop = false;
                	break;
                	
                default://qualquer opção além dos 4 válidos
                    System.out.println("Ops! Opção inválida, tente novamente! :P \n");
                    break;   	
            }
        }
    }
}