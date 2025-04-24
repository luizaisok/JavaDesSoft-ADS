/*
Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de
itens ou eventos. A classe deve oferecer métodos que:
a) Zerar;
b) Incrementar;
c) Retornar o valor do contador
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Menu menuzinho = new Menu();

        menuzinho.mostrandoMenu(sc);
    }
}
