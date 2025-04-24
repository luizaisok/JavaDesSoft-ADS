/*
Escreva em Java uma classe NumeroComplexo, que representa um número complexo.
A classe deve fornecer as seguintes operações:
a) Construtor com valores das partes real e imaginária;
b) Métodos getter/setter para os atributos da parte real e imaginária;
c) Método somar;
d) Método subtrair;
e) Método multiplicar;
f) Método dividir;
g) Método de comparação semântica;
h) Método que gere e retorne a representação string;
i) Método que retorne o módulo do número complexo
*/

public class NumeroComplexo {
    private double numReal;
    private double numImaginario;

    public NumeroComplexo(){}

    public NumeroComplexo(double numReal, double numImaginario){
        this.numReal = numReal;
        this.numImaginario = numImaginario;
    }

    public double getNumReal() {
        return this.numReal;
    }
    public void setNumReal(double numReal) {
        this.numReal = numReal;
    }
    public double getNumImaginario() {
        return this.numImaginario;
    }
    public void setNumImaginario(double numImaginario) {
        this.numImaginario = numImaginario;
    }

    public void somar(double real, double imaginario){
        this.numReal += real;
        this.numImaginario += imaginario;
    }

    public void subtrair(double real, double imaginario){
        this.numReal-= real;
        this.numImaginario-= imaginario;
    }

    public void multiplicar(double real, double imaginario){
        double novoNumeroReal = (this.numReal * real) + (this.numImaginario * (imaginario * -1));
        double novoNumeroImaginario = (this.numReal * imaginario) + (this.numImaginario * real);
        this.numReal = novoNumeroReal;
        this.numImaginario = novoNumeroImaginario;
    }

    public void dividir(double real, double imaginario){
        // ablueblue
    }

    public void compararSemantica(double real, double imaginario){
        if(this.numReal == real && this.numImaginario == imaginario){
            System.out.println("Os números são iguais");
        }else{
            System.out.println("Os números são diferentes");
        }
    }

    @Override
    public String toString(){
        return "Número complexo: "+this.numReal+" + "+this.numImaginario+"i";
    }
}
