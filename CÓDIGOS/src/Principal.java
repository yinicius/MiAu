import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 1 para adicionar cliente. \n" +
                           "Digite 2 para adicionar cuidador. \n" +
                           "Digite 3 para adicionar um pet cachorro. \n" +
                           "Digite 4 para adicionar um pet gato. \n" +
                           "Digite 5 para mostrar \n" +
                           "Digite 6 para sair");
        while(true) {
            String line = scanner.nextLine();
            String[] ui = line.split(" ");
            String op = ui[0];
            switch (op){
                case "1":
                    gerente.adicionarCliente(ui[1], ui[2], Integer.parseInt(ui[3]), ui[4], ui[5]);
                    break;
                case "2":
                    Cuidador cuidador = new Cuidador(ui[1], ui[2], Integer.parseInt(ui[3]), ui[4], ui[5], ui[6]);
                    break;
                case "3":
                    Cachorro cachorro = new Cachorro(ui[1], Integer.parseInt(ui[2]), ui[3], ui[4]);
                    break;
                case "4":
                    Gato gato = new Gato(ui[1], Integer.parseInt(ui[2]), ui[3], ui[4]);
                    break;
                case "5":
                    System.out.println(gerente);
                    break;
                default:
                    System.out.println("Este não é uma opção válida!");
                    break;
            }
        }
    }
}