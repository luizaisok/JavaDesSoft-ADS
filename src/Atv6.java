import java.util.Scanner;

public class Atv6 {
    public static void atv6(String args[]){
        Scanner falaBem = new Scanner(System.in);
        String frase, fraseInvertida = "";
        int i;

        System.out.println("Diga algo para mim.");
        frase = falaBem.nextLine();

        for(i = (frase.length() - 1); i >= 0; i--){
            fraseInvertida += frase.charAt(i); // Pega char por char
        }

        System.out.println(fraseInvertida);
    }
}
