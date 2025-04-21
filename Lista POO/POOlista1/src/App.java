
import java.util.ArrayList;
import java.util.Scanner;

/*
Um trabalhador autônomo deseja controlar suas finanças, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
• Toda vez que ele vende um valor maior que o estabelecido pelo regulamento de MEI do estado onde vive (500,00 R$ dia) deve pagar um multa de R$ 0,10 a cada Real excedente.
• Este trabalhador precisa que você faça um programa em Java que leia o valor de todas as vendas do mês e verifique se há excesso (vendeu mais de 500,00 por dia).
• Se houver excesso, gravar na variável E (Excesso) e na variável M o valor da multa que o Trabalhador deverá pagar.
• Caso contrário mostrar tais variáveis com o conteúdo ZERO.

Desenvolva uma aplicação Java Orientada a Objetos e as classes necessárias para resolver o problema.
O sistema deve conter um menu com no mínimo as seguintes opções
1 - cadastro de vendas
2 - consulta de imposto a pagar no mês (com base no mês e no ano das vendas).
0 - Sair
*/

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<Vendas> vendas1 = new ArrayList<>();

        int op;
        do { 
            System.out.println("Menu: 1, 2 ou 0");
            op = scan.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Digite o valor da venda:");
                    double valor = scan.nextDouble();
                    System.out.println("Digite o mes:");
                    int mes = scan.nextInt();
                    System.out.println("Digite o ano:");
                    int ano = scan.nextInt();
                    vendas1.add(new Vendas(valor, mes, ano));
                    break;
                case 2:
                    System.out.println("Qual mes deseja ver?");
                    mes = scan.nextInt();
                    System.out.println("Qual ano deseja ver?");
                    ano = scan.nextInt();
                    double multaTotal = 0;
                    for(int i = 0; i < vendas1.size(); i++){
                        if(vendas1.get(i).getAno() == ano){
                            if(vendas1.get(i).getMes() == mes){
                                multaTotal += vendas1.get(i).getMulta();
                                
                            }
                        }
                    }
                    if(multaTotal == 0){
                        System.out.println("Não tem impostos referentes à este mês");
                    }else{
                        System.out.println("Impostos a pagar sobre este mês: "+multaTotal);
                    }
                    break;
                case 0:
                    System.out.println("Saimdo");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 0);
    }
}
