/*
Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de
itens ou eventos. A classe deve oferecer métodos que:
a) Zerar;
b) Incrementar;
c) Retornar o valor do contador - getValor não seria um método para retornar o valor? 
*/

import java.util.Scanner;

public class Menu {

    public void mostrandoMenu(Scanner sc){
        int op;
        Contador contando = new Contador();
        do{
            System.out.println("Selecione a opção desejada. O valor inicial para o contador é 0\n1- Zerar o contador\n2- Incrementar valor ao contador\n3- Retornar valor\n4- Sair");
            op = sc.nextInt();

            switch(op){
                case 1:
                    contando.setValor(0);
                    System.out.println("Valor atual: "+contando.getValor());
                    break;
                case 2:
                    System.out.println("Digite o valor à ser incrementado:");
                    contando.incrementar(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Valor atual: "+contando.getValor());
                    break;
                case 4:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Valor inválido.");
            }
        }while(op != 4);
    }
}
