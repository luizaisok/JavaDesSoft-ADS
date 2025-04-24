/*
Escreva em Java uma classe NumeroComplexo, que representa um número complexo.
A classe deve fornecer as seguintes operações:
a) Construtor com valores das partes real e imaginária;
b) Métodos getter/setter para os atributos da parte real e imaginária;
c) Método somar;
d) Método subtrair;
e) Método multiplicar;
f) Método dividir;
g) Método de comparação semântica;
h) Método que gere e retorne a representação string;
i) Método que retorne o módulo do número complexo
*/

import java.util.Scanner;

public class Menu {
    int op;
    double numReal, numImaginario;
    NumeroComplexo numerocomplexo1 = new NumeroComplexo();

    public void mostrarMenu(Scanner sc){
        do {

            System.out.println("Menu:\n1- Definir os números\n2- Soma\n3- Subtração\n4- Multiplicação\n5- Divisão\n6- Comparação Semântica\n7- Representação (?)\n8- Módulo do número complexo\n9- Sair");
            op = sc.nextInt();
            switch(op){
                case 1:
                    System.out.println("Digite o valor do número real:");
                    numReal = sc.nextDouble();
                    System.out.println("Digite o valor do número imaginário:");
                    numImaginario = sc.nextDouble();
                    numerocomplexo1.setNumReal(numReal);
                    numerocomplexo1.setNumImaginario(numImaginario);
                    System.out.println(numerocomplexo1.toString());
                    break;
                case 2:
                    System.out.println("Digite o valor do número real:");
                    numReal = sc.nextDouble();
                    System.out.println("Digite o valor do número imaginário:");
                    numImaginario = sc.nextDouble();
                    numerocomplexo1.somar(numReal, numImaginario);
                    System.out.println("Valor após soma: "+numerocomplexo1.getNumReal()+" + "+numerocomplexo1.getNumImaginario()+"i");
                    break;
                case 3:
                    System.out.println("Digite o valor do número real:");
                    numReal = sc.nextDouble();
                    System.out.println("Digite o valor do número imaginário:");
                    numImaginario = sc.nextDouble();
                    numerocomplexo1.subtrair(numReal, numImaginario);
                    System.out.println("Valor após subtração: "+numerocomplexo1.getNumReal()+" + "+numerocomplexo1.getNumImaginario()+"i");
                    break;
                case 4:
                    System.out.println("Digite o valor do número real:");
                    numReal = sc.nextDouble();
                    System.out.println("Digite o valor do número imaginário:");
                    numImaginario = sc.nextDouble();
                    numerocomplexo1.multiplicar(numReal, numImaginario);
                    System.out.println("Valor após multiplicação: "+numerocomplexo1.getNumReal()+" + "+numerocomplexo1.getNumImaginario()+"i");
                    break;
                case 5:
                    // Divisão
                    break;
                case 6:
                    System.out.println("Digite o valor do número real:");
                    numReal = sc.nextDouble();
                    System.out.println("Digite o valor do número imaginário:");
                    numImaginario = sc.nextDouble();
                    numerocomplexo1.compararSemantica(numReal, numImaginario);
                    break;
                case 7:

                    break;
                case 8:

                    break;
                case 9:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op != 9);
    }
}
