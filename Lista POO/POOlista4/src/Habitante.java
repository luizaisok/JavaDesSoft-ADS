/*
Foi feita uma pesquisa entre os habitantes de uma cidade. Foram coletados os dados de idade, gênero (M/F) e renda. Faça uma aplicação em Java Orientada a Objetos contenha um
menu onde seja possível registrar, os dados de cada habitante e, ainda consultar as seguintes informações:
1. A média de salário do grupo;
2. Maior e menor idade do grupo;
3. Quantidade de habitantes do gênero masculino com salário até R$ 1000,00;
4. Quantidade de habitantes do gênero feminino;
*/

public class Habitante {
    private double salario;
    private int idade;
    private String genero;

    public Habitante(double salario, int idade, String genero){
        this.salario = salario;
        this.idade = idade;
        this.genero = genero;
    }

    public Habitante(){}

    public double getSalario(){
        return this.salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

}
