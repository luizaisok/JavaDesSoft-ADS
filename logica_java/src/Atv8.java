// Analisar se é 1 quadrado mágico: O resultado da soma das linhas deve ser o mesmo da soma das colunas e das diagonais.

import java.util.Scanner;

public class Atv8 {
    public static void main(String args[]){
        Scanner dim = new Scanner(System.in);
        int dimensao, i, j, num, somaReferencia = 0, somaLinha, somaColuna, somaDiagonal, somaDiagonalSecundaria;
        boolean quadMagico = true;

        System.out.println("Qual será a dimensão da matriz?");
        dimensao = Integer.parseInt(dim.nextLine());

        int cubo[][] = new int[dimensao][dimensao];

        for(i = 0; i < dimensao; i++){
            for(j = 0; j < dimensao; j++){
                System.out.println("Digite o valor da posição " + (i+1) + " e " + (j+1) + ": ");
                num = Integer.parseInt(dim.nextLine());
                cubo[i][j] = num;
            }
        }

        for(i = 0; i < 1; i++){
            for(j = 0; j < dimensao; j++){
                somaReferencia+= cubo[i][j];
            }
        }
        
        // Soma de cada linhas + comparando com a soma de referência
        for(i = 0; i < dimensao; i++){
            somaLinha = 0;
            for(j = 0; j < dimensao; j++){
                somaLinha+= cubo[i][j];
            }
            System.out.println("Soma da linha " + (i+1) + ": " + somaLinha);
            if(somaLinha != somaReferencia){
                quadMagico = false;
                break;
            }
        }

        // Soma de cada coluna + comparando com a soma de referência
        for(j = 0; j < dimensao; j++){
            somaColuna = 0;
            for(i = 0; i < dimensao; i++){
                somaColuna+= cubo[i][j];
            }
            System.out.println("Soma da coluna " + (j+1) + ": " + somaColuna);
            if(somaColuna != somaReferencia){
                quadMagico = false;
                break;
            }
        }

        // Soma da diagonal principal
        somaDiagonal = 0;
        for(i = 0; i < dimensao; i++){
            somaDiagonal+= cubo[i][i];
        }
        System.out.println("Soma da diagonal principal: " + somaDiagonal);

        // Soma da diagonal secundária
        somaDiagonalSecundaria = 0;
        for(i = 0; i < dimensao; i++){
            somaDiagonalSecundaria+= cubo[i][dimensao - i - 1];
        }
        System.out.println("Soma da diagonal secundária: " + somaDiagonalSecundaria);

        // Resultado =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-
        if(quadMagico){
            System.out.println("É um quadrado mágico!");
        }else{
            System.out.println("Não é um quadrado mágico!");
        }

        /* 
        System.out.println("\nOs valores do cubo são: \n");
        for(i = 0; i < dimensao; i++){
            for(j = 0; j < dimensao; j++){
                System.out.println(cubo[i][j]);
            }
        }
        */

        dim.close();
    }
}
