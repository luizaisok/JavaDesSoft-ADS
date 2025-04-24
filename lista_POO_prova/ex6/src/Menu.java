/*
Escreva uma classe País com os seguintes atributos: código ISO, nome, população e dimensão (km2). Forneça os seguintes membros:
a) Construtor com código ISO, nome e dimensão;
b) Métodos de acesso (getter/setter);

c) Método de comparação semântica (igualdade de ISO);
d) Método que verifica se outro país é limítrofe;
e) Método que retorna a densidade populacional;
f) Método que retorna os vizinhos comuns a outro país
*/

import java.util.Scanner;

public class Menu {

    public void mostrarMenu(Scanner sc){
        do { 
            System.out.println("Menu:\n1- Comparar ISOs\n2- Verificar se outro país é limítrofe\n3- Densidade populacional\n4- Vizinhos comuns a outro país");
        } while (true);
    }
}
