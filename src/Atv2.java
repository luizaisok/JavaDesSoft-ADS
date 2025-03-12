import java.util.Scanner;

public class Atv2 {
    public static void atv2(String args[]){
        double tri[] = new double[3];
        int i;
        Scanner lendo = new Scanner(System.in);

        for(i = 0; i<3; i++){
            System.out.println("Digite o valor do lado " + (i+1) + " do triângulo.");
            tri[i] = Integer.parseInt(lendo.nextLine());
        }

        if(tri[0] + tri[1] < tri[2]){
            System.out.println("Não é triângulo");
        }else if(tri[1] + tri[2] < tri[0]){
            System.out.println("Não é triângulo");
        }else if(tri[0] + tri[2] < tri[1]){
            System.out.println("Não é triângulo");
        }else{
            if(tri[0] == tri[1] && tri[1] == tri[2]){
                System.out.println("É um triângulo equilátero.");
            }else if(tri[0] != tri[1] && tri[1] != tri[2] && tri[0] != tri[2]){
                System.out.println("É um triângulo escaleno");
            }else{
                System.out.println("É um triângulo isósceles");
            }
        }
        lendo.close();
    }
}
