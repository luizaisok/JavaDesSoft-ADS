public class Retangulo{
    private double lado1;
    private double lado2;

    public Retangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public Retangulo(){
        this.lado1 = 2;
        this.lado2 = 2;
    }

    public double getLado1(){
        return this.lado1;
    }

    public void setLado1(double lado1){
        this.lado1 = lado1;
    }

    public double getLado2(){
        return this.lado2;
    }

    public void setLado2(double lado2){
        this.lado2 = lado2;
    }

    public double calculaArea(){
        double area = this.lado1 * this.lado2;
        return area;    
    }

    public double calculaPerimetro(){
        double perimetro = (this.lado1 * 2) + (this.lado2 * 2);
        return perimetro;
    }

    public String toString(){
        String texto = "Lado 1: "+this.lado1+"\nLado 2: "+this.lado2;
        return texto;
    }
}