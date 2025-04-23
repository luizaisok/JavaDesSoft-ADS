import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {
    ArrayList<Pessoa> pessoas = new ArrayList<>();
    String nome;
    int idade;

    public Cadastro(){};

    public void cadastrarPessoa(Scanner sc){
        System.out.println("Digite o seu nome:");
        nome = sc.nextLine();
        nome = sc.nextLine();
        System.out.println("Digite a sua idade:");
        idade = sc.nextInt();
        Endereco end = cadastroEndereco(sc);
        pessoas.add(new Pessoa(nome, idade, end));
    }

    public Endereco cadastroEndereco(Scanner sc){
        Endereco end = new Endereco();
        System.out.println("Vamos cadastrar seu endereço.");
        System.out.println("Insira o logradouro / nome da rua:");
        end.setLogradouro(sc.nextLine());
        end.setLogradouro(sc.nextLine());
        System.out.println("Insira o número da residência");
        end.setNumero(sc.nextInt());
        sc.nextLine();
        System.out.println("Insira o bairro:");
        end.setBairro(sc.nextLine());
        System.out.println("Insira a cidade:");
        end.setCidade(sc.nextLine());
        System.out.println("Insira o estado:");
        end.setEstado(sc.nextLine());
        return end;
    }

    public void listarPessoas(){
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
