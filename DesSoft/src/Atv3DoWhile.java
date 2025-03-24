// Tabuada de 1 à 10 de um número passado pelo usuário. Versão: do while

import java.util.Scanner;

public class Atv3DoWhile{
    public static void main(String args[]){
        int num, i = 1;
        Scanner numUsuario = new Scanner(System.in);

        System.out.println("Digite o número que deseja ver a tabuada de 1 a 10.");
        num = Integer.parseInt(numUsuario.nextLine());
        do{
            System.out.println(i + " x " + num + " = " + (i * num));
            i++;
        }while(i < 11);

        numUsuario.close();
    }
    
}