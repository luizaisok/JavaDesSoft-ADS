/*
A empresa de saneamento de uma cidade que controla o índice de poluição da água e mantém 3 grupos de indústrias que são altamente poluentes para o meio ambiente.
• O índice de poluição aceitável varia de 0,06 até 0,16.
• Se o índice sobe para 0,25 as indústrias do 1ž grupo são intimadas a reduzirem em 50% suas atividades;
• Se o índice crescer para 0,4 as industrias do 1ž e 2ž grupo são intimadas a suspenderem suas atividades.
• Se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
• Desenvolva um programa em Java Orientado a objetos, que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner diga = new Scanner(System.in);

        Saneamento situacao1 = new Saneamento();

        System.out.println("Digite qual o índice de poluição no momento: ");
        float num = Float.parseFloat(diga.nextLine()); // O que tah dando de errado aqui???

        situacao1.setIndicePoluicao(num);
        
        System.out.println("De acordo com a empresa de saneamento da cidade: "+situacao1.atencaoPoluicao());
        diga.close();
    }
}