/*
Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de itens ou eventos (ou seja, possui um atributo do tipo inteiro que será responsável pela contagem). A classe deve possuir os métodos de acesso (get e set) e os seguintes métodos:
a) Zerar(): atribui zero ao atributo da classe;
b) Incrementar(): adiciona 1 ao atributo da classe;
c) Decrementar(): subtrai um do atributo da classe.
d) Somar (valor): adiciona o valor passado por parâmetro ao atributo da classe;
e) Subtrair (valor): subtrai o valor passado por parâmetro do atributo da classe.
 */

import java.util.Scanner;

public class App {
    public static void main(String args[]) throws Exception {
        Scanner fala = new Scanner(System.in);

        Contador contante = new Contador();

        System.out.println("Digite o número:");
        int num = fala.nextInt();

        contante.setNumero(num);

        int i;
        do{
            System.out.println("Digite o que quer fazer: 1 - Zerar, 2 - Incrementar, 3 - Decrementar, 4 - Somar, 5 - Subtrair, 0 - Sair");
            i = fala.nextInt();

            switch (i) {
                case 1:
                    contante.zerar();
                    System.out.println(">>> Atualização do número: "+contante.getNumero()+"\n");
                    break;
                case 2:
                    contante.incrementar();
                    System.out.println(">>> Atualização do número: "+contante.getNumero()+"\n");
                    break;
                case 3:
                    contante.decrementar();
                    System.out.println(">>> Atualização do número: "+contante.getNumero()+"\n");
                    break;
                case 4:
                    System.out.println("Digite o número que deseja somar:");
                    int numSoma = fala.nextInt();
                    contante.somar(numSoma);
                    System.out.println(">>> Atualização do número: "+contante.getNumero()+"\n");
                    break;
                case 5:
                    System.out.println("Digite o número que deseja subtrair:");
                    numSoma = fala.nextInt();
                    contante.subtrair(numSoma);
                    System.out.println(">>> Atualização do número: "+contante.getNumero()+"\n");
                    break;
                case 0:
                    System.out.println("Byyyyeeeee!!!!");
                    break;
                default:
                    System.out.println("Número inválido");;
            }
        }while(i != 0);       
    }
}
