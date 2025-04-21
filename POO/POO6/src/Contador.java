/*
Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de itens ou eventos (ou seja, possui um atributo do tipo inteiro que será responsável pela contagem). A classe deve possuir os métodos de acesso (get e set) e os seguintes métodos:
a) Zerar(): atribui zero ao atributo da classe;
b) Incrementar(): adiciona 1 ao atributo da classe;
c) Decrementar(): subtrai um do atributo da classe.
d) Somar (valor): adiciona o valor passado por parâmetro ao atributo da classe;
e) Subtrair (valor): subtrai o valor passado por parâmetro do atributo da classe.
*/

public class Contador{
    private int numero;

    public Contador(){

    }

    public Contador(int num1){
        this.numero = num1;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int num1){
        this.numero = num1;
    }

// Métodos

    public int zerar(){
        return this.numero = 0;
    }

    public int incrementar(){
        return this.numero++;
    }

    public int decrementar(){
        return this.numero--;
    }

    public int somar(int num1){
        return this.numero += num1;
    }

    public int subtrair(int num1){
        return this.numero -= num1;
    }
}