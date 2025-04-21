/*
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
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro{
    ArrayList<LivroFisico> livrosFisicos = new ArrayList<>();
    ArrayList<LivroDigital> livrosDigitais = new ArrayList<>();
    int op, anoPublicacao, numeroPaginas;
    String titulo, autor;
    double tamanhoMb;

    public void cadastrarLivro(Scanner sc){
        do {
            System.out.println("1- Cadastrar Livro Físico / 2- Cadastrar Livro Digital / 3- Sair");
            op = sc.nextInt();

            switch(op){
                case 1:
                    cadastrarLivroFisico(sc);
                    break;
                case 2:
                    cadastrarLivroDigital(sc);
                    break;
                case 3:
                    System.out.println("Saindo.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (op !=3);
    }

    public void cadastrarLivroFisico(Scanner sc){
        sc.nextLine();
        System.out.println("Digite o título do livro:");
        titulo = sc.next();
        System.out.println("Digite o nome do autor:");
        autor = sc.next();
        System.out.println("Digite o ano de publicação:");
        anoPublicacao = sc.nextInt();
        System.out.println("Digite a quantidade de páginas do livro");
        numeroPaginas = sc.nextInt();
        livrosFisicos.add(new LivroFisico(titulo, autor, anoPublicacao, numeroPaginas));
        System.out.println("Novo livro cadastrado: "+livrosFisicos.get(livrosFisicos.size() - 1));
    }

    public void cadastrarLivroDigital(Scanner sc){
        System.out.println("Digite o título do livro:");
        titulo = sc.next();
        System.out.println("Digite o nome do autor:");
        autor = sc.next();
        System.out.println("Digite o ano de publicação:");
        anoPublicacao = sc.nextInt();
        System.out.println("Digite o tamanho do livro em Mb:");
        tamanhoMb = sc.nextDouble();
        livrosDigitais.add(new LivroDigital(titulo, autor, anoPublicacao, tamanhoMb));
        System.out.println("Novo livro cadastrado: "+livrosDigitais.get(livrosDigitais.size() - 1));
    }
}
