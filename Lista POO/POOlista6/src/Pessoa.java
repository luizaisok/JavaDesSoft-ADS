/*
Utilizando como base a classe Pessoa implementada nas atividades anteriores, desenvolva um sistema de cursos, onde um Pessoa pode ser um Aluno ou um Instrutor. O sistema deve informar quais Alunos estão matriculados em qual curso e qual o instrutor de cada curso.
Desenvolva as classes necessárias e a classe com o método main para testar a aplicação
*/

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(){}

    public Pessoa(String nome, String cpf, int idade){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

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
}
