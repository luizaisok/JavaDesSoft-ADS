import java.util.Scanner;

public class Atv3For {
    public static void atv3for(String[] args){
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
