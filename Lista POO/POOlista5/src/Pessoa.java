/*
Desenvolva uma classe Pessoa possa, opcionalmente, ser instanciada com o CPF ou a idade da Pessoa sendo informada por parâmetro. Desenvolva o código da classe contendo o método main para testar o uso da classe Pessoa. Envie o código Java como resposta
    5.1 Get e Set
    Atualize a suas classes que acessam e modificam atributos de uma Pessoa para utilizar os get e set. Indique o que foi alterado nos comentários do arquivo Java.
    5.2 CPF
    Considere que na classe Pessoa tem um CPF como atributo. Como garantir que alguma pessoa não seja criada caso tenha CPF inválido e tampouco seja criado um objeto Pessoa sem informar o CPF? Implemente a solução e o teste no método main
*/

public class Pessoa {
    private String cpf;
    private int idade;

    public Pessoa(String cpf){ // Podendo ser instanciada apenas pelo CPF
        this.cpf = cpf;
        this.idade = 0;
    }
    
    public Pessoa(String cpf, int idade){
        this.idade = idade;
        this.cpf = cpf;
    }

    /*
    public Pessoa(){}

    Instanciando somente por idade: 
    public Pessoa(int idade){
        this.idade = idade;
        this.cpf = "";
    }
    Porém, pelo item 5.2 não permitir mais, está comentado
    */
    
    public String getCPF(){
        return this.cpf;
    }

    public void setCPF(String cpf){
        this.cpf = cpf;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String toString(){
        return "O CPF da pessoa é: "+this.cpf+" e a idade é :"+idade;
    }

}
