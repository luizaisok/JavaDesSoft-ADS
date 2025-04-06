/*
Desenvolva uma classe Pessoa possa, opcionalmente, ser instanciada com o CPF ou a idade da Pessoa sendo informada por parâmetro. Desenvolva o código da classe contendo o método main para testar o uso da classe Pessoa. Envie o código Java como resposta
    5.1 Get e Set
    Atualize a suas classes que acessam e modificam atributos de uma Pessoa para utilizar os get e set. Indique o que foi alterado nos comentários do arquivo Java.
    5.2 CPF
    Considere que na classe Pessoa tem um CPF como atributo. Como garantir que alguma pessoa não seja criada caso tenha CPF inválido e tampouco seja criado um objeto Pessoa sem informar o CPF? Implemente a solução e o teste no método main
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o cpf da pessoa para iniciarmos:");
        String cpf = scan.next();

        Pessoa pessoa1 = new Pessoa(cpf);
        cpf = null;

        System.out.println("Mudar cpf");
        pessoa1.setCPF(scan.next());
        System.out.println("Adicionar idade:");
        pessoa1.setIdade(scan.nextInt());

        System.out.println(pessoa1.toString());

        scan.close();
    }
}
