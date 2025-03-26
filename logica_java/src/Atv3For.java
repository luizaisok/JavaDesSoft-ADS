// Tabuada de 1 à 10 de um número passado pelo usuário. Versão: for

import java.util.Scanner;

public class Atv3For {
    public static void main(String[] args){
        Scanner lendoUsu = new Scanner(System.in);
        int i, num;
        System.out.println("Digite 1 número para descobrir a tabuada de 1 a 10: ");
        num = Integer.parseInt(lendoUsu.nextLine());
        for(i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
        lendoUsu.close();
    }
}
