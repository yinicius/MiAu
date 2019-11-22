import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Scanner scanner = new Scanner(System.in);
        boolean stop = true;
        System.out.println("Digite 1 para adicionar cliente. \n" +
                           "Digite 2 para adicionar cuidador. \n" +
                           "Digite 3 para adicionar um pet cachorro. \n" +
                           "Digite 4 para adicionar um pet gato. \n" +
                           "Digite 5 para mostrar \n" +
                           "Digite 6 para sair");
        while(stop) {
            String op = scanner.nextLine();
            switch (op){
                case "1":
                    String line1 = scanner.nextLine();
                    String[] ui1 = line1.split(" ");
                    gerente.adicionarCliente(ui1[0], ui1[1], Integer.parseInt(ui1[2]), ui1[3], ui1[4]);
                    break;
                case "2":
                    String line2 = scanner.nextLine();
                    String[] ui2 = line2.split(" ");
                    Cuidador cuidador = new Cuidador(ui2[0], ui2[1], Integer.parseInt(ui2[2]), ui2[3], ui2[4], ui2[5]);
                    break;
                case "3":
                    String line3 = scanner.nextLine();
                    String[] ui3 = line3.split(" ");
                    Cachorro cachorro = new Cachorro(ui3[0], Integer.parseInt(ui3[1]), ui3[2], ui3[3]);
                    break;
                case "4":
                    String line4 = scanner.nextLine();
                    String[] ui4 = line4.split(" ");
                    Gato gato = new Gato(ui4[0], Integer.parseInt(ui4[1]), ui4[2], ui4[3]);
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