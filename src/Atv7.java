import java.util.Scanner;

public class Atv7 {
    public static void atv7(String args[]){
        int i;
        double num, soma = 0, media = 0, maior = 0, menor = 0, nums[] = new double[10];
        Scanner meConta = new Scanner(System.in);

        for(i = 0; i < 10; i++){
            System.out.println("Digite o valor da posicao " + (i+1));
            num = Double.parseDouble(meConta.nextLine());
            nums[i] = num;
            soma += num;

            if(i == 0){
                maior = num;
                menor = num;
            }
            if(num > maior){
                maior = num;
            }
            if(num < menor){
                menor = num;
            }
        }

        media = soma / 10;

        System.out.println("A soma dos números é: " + soma + ".\n" + "A média dos números é: " + media + ".\n" + "O maior dos números é: " + maior + ".\n" + "O menor dos números é: " + menor + ".");

        meConta.close();
    }   
}
