/*
Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de
itens ou eventos. A classe deve oferecer métodos que:
a) Zerar;
b) Incrementar;
c) Retornar o valor do contador - getValor não seria um método para retornar o valor? 
*/

public class Contador {
    private double valor;

    public Contador(){}

    public Contador(double valor){
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Double zerarContador(){
        return valor = 0;
    }

    public Double incrementar(double incremento){
        return this.valor+=incremento;
    }
}
