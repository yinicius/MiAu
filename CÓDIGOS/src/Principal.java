import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String line = scanner.nextLine();
            Gerente gerente = new Gerente();
            String ui[] = line.split(" ");
            try {
                System.out.println("Escreva..... ");  //aqui fica o textinho com orientações pro menu
                if (ui[0].equals("addCliente")) {
                    Cliente cliente = new Cliente(ui[1], ui[2], Integer.parseInt(ui[3]), ui[4], ui[5]);
                    cliente.cadastrarPet(ui[6], Integer.parseInt(ui[7]), ui[8], ui[9]);
                } else if (ui[0].equals("show")) {
                    System.out.println(gerente);
                } else if (ui[0].equals("end")) {
                    break;
                } else {
                    System.out.println("ERRO: COMANDO INVALIDO");
                }
            }catch(RuntimeException rt){
                System.out.println(rt.getMessage());
            }
        }
    }
}