import java.util.Scanner;
import javax.swing.JOptionPane;

public class Atv4 {
    public static void atv4(String[] args){
        Scanner lendoUsu = new Scanner(System.in);
        int i, j, numero, num1[] = new int[5], num2[] = new int[5];
        String tab1 = new String(), tab2 = new String();

        System.out.println("Digite 1 número para descobrir a tabuada de 1 a 10: ");
        numero = Integer.parseInt(lendoUsu.nextLine());

        for(i = 1; i <= 5; i++){
            num1[i - 1] = numero * i;
            tab1+= (numero + " x " + i + " = " + num1[i - 1] + "\n");
        }

        for(j = 6; j <= 10; j++){
            num2[j - 6] = numero * j;
            tab2+= (numero + " x " + j + " = " + num2[j - 6] + "\n");
        }

        JOptionPane.showMessageDialog(null, tab1);
        JOptionPane.showMessageDialog(null, tab2);

        lendoUsu.close();
    }
}
