import java.util.Scanner;

public class App {
    public static void main(String[] args){
    
        Scanner diga = new Scanner(System.in);

        System.out.println("Digite o valor do lado 1 do Retângulo 1:");
        double lado1 = diga.nextDouble();

        System.out.println("Digite o valor do lado 2 do Retângulo 1:");
        double lado2 = diga.nextDouble();

        Retangulo ret1 = new Retangulo(lado1, lado2);

        ret1.setLado1(lado1);
        ret1.setLado2(lado2);

        Retangulo ret2 = new Retangulo();
        System.out.println("Digite o valor do lado 1 do Retângulo 2:");
        ret2.setLado1(diga.nextDouble());
        System.out.println("Digite o valor do lado 2 do Retângulo 2:");
        ret2.setLado2(diga.nextDouble());

        Retangulo ret3 = new Retangulo();

        System.out.println(
        "Retângulo 1: \n"+ret1.toString()+"\nÁrea do retângulo 1: "+ret1.calculaArea()+"\nPerímetro do retângulo 1: "+ret1.calculaPerimetro()+
        "\n\nRetângulo 2: \n"+ret2.toString()+"\nÁrea do retângulo 2: "+ret2.calculaArea()+"\nPerímetro do retângulo 2: "+ret2.calculaPerimetro()+
        "\n\nRetângulo 3: \n"+ret3.toString()+"\nÁrea do retângulo 3: "+ret3.calculaArea()+"\nPerímetro do retângulo 3: "+ret3.calculaPerimetro());
    }
}
