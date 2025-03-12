import java.util.Scanner;

public class Atv5 {
    public static void atv5(String args[]){
        Scanner meDiga = new Scanner(System.in);
        int num, i, fat = 1;

        System.out.println("Digite um número para calular fatorial:");
        num = Integer.parseInt(meDiga.nextLine());

        for(i = num; i > 0; i--){
            fat*= i; 
        }

        System.out.println("O fatorial de " + num + " é = " + fat);

        meDiga.close();
    }   
}
