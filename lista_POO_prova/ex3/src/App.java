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

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Menu menuzinho = new Menu();
        menuzinho.mostrarMenu(sc);
        sc.close();
    }
}
