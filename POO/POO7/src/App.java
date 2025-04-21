/*
Exercício: Sistema de Biblioteca com Herança

Objetivo:
Criar um sistema simples de cadastro de livros, utilizando herança para diferenciar livros físicos e digitais.

Classes:

1. Livro (classe pai):
   - Atributos:
     - titulo (String)
     - autor (String)
     - anoPublicacao (int)

2. LivroFisico (herda de Livro):
   - Atributo adicional:
     - numeroDePaginas (int)

3. LivroDigital (herda de Livro):
   - Atributo adicional:
     - tamanhoEmMB (double)

4. Menu (classe com métodos):
   - Método cadastrarLivroFisico(Scanner scan):
     - Solicita os dados do livro físico via teclado
     - Cria o objeto e exibe os dados

   - Método cadastrarLivroDigital(Scanner scan):
     - Solicita os dados do livro digital via teclado
     - Cria o objeto e exibe os dados

   - Menu principal:
     - Opções:
       1 - Cadastrar Livro Físico
       2 - Cadastrar Livro Digital
       3 - Sair
     - Loop até o usuário escolher sair

Conceitos envolvidos:
- Herança
- Encapsulamento (get/set)
- Sobrescrita de métodos (opcional com toString)
- Uso de Scanner
- Estrutura de menu com switch/case e while
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Cadastro cadastros = new Cadastro();

        cadastros.cadastrarLivro(sc);
    }
}
