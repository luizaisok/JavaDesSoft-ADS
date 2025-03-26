// Descobrindo se o número é primo

import java.util.Scanner;

public class Atv10 {
    public static void main(String args[]){
        Scanner mostra = new Scanner(System.in);
        int num;
        boolean a = true;

        System.out.println("Digite um número inteiro que deseja descobrir se é primo:");
        num = mostra.nextInt();

        if(num <= 0){
            System.out.println("Número inválido");
        }else if(num == 1){
            System.out.println("O número " + num + " não é primo.");
        }else{
            for(int i = 2; i < num; i++){
                if(num%i == 0){
                    a = false;
                    break;
                }
            }
            if(a){
                System.out.println("O número " + num + " é primo.");
            }else{
                System.out.println("O número " + num + " não é primo.");
            }
        }

        mostra.close();
    }
}
