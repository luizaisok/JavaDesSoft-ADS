import java.util.Scanner;

public class App {
    public static void main(String[] args){

        Scanner fala = new Scanner(System.in);

        System.out.println("Digite o tipo do carro:");
        String tipo = fala.next();
        System.out.println("Digite a placa do carro:");
        String placa = fala.next();
        System.out.println("Digite a cor do carro:");
        String cor = fala.next();
        System.out.println("Digite o número de portas do carro:");
        int num_portas = fala.nextInt();

        Carro c1 = new Carro(tipo, placa, cor, num_portas);
        System.out.println("Carro 1: \n" + c1.toString());
        System.out.println("\n");
        Carro c2 = new Carro();
        System.out.println("Carro 2: \n" + c2.toString());

        fala.close();
    }
}
