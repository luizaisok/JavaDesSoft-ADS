import java.util.Scanner;

public class Menu {
    Cadastro cadastros = new Cadastro();
    int op;

    public void exibirMenu(Scanner sc){
        do { 
            System.out.println("Opções: 1- Cadastrar pessoa / 2- Listar pessoas cadastradas / 3- Sair");
            op = sc.nextInt();
            switch (op) {
                case 1 -> cadastros.cadastrarPessoa(sc);
                case 2 -> cadastros.listarPessoas();
                case 3 -> System.out.println("Saindo.");
                default -> System.out.println("Opção inválida.");
            }
        } while (op != 3);
    }
}
