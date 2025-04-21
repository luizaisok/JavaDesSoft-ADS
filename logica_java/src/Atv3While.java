// Tabuada de 1 à 10 de um número passado pelo usuário. Versão: while

import java.util.Scanner;

public class Atv3While {
    public static void main(String args[]){
        int i = 1, num;
        Scanner lendoNum = new Scanner(System.in);

        System.out.println("Digite o número que deseja ver sua tabuada de 1 a 10:");
        num = Integer.parseInt(lendoNum.nextLine());

        while (i <= 10) {
            System.out.println(i + " x " + num + " = " + (i*num));
            i++;
        }
    }
}
