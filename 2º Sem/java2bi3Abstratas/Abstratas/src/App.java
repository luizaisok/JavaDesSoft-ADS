
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        // Classes abstratas não são instanciáveis:
        // Forma2D forma = new Forma2D(); ERRO

        // Retangulo retangulo = new Retangulo(3.5, 5, "Sala");
        // System.out.println("A área do retângulo é: "+retangulo.calculaArea());

        // Circulo circulo = new Circulo(3, 3, "Circulinho rs");
        // System.out.println("A área do círculo é: "+circulo.calculaArea());

        Scanner sc = new Scanner(System.in);
        ArrayList<Forma2D> formas = new ArrayList<>();
        int op;
        do{ 
            System.out.println("Menu:\n1- Cadastrar Fomras\n2- Listar Formas\n3- Editar Formas\n4- Excluir Formas\n0- Sair");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Qual forma deseja cadastrar?\n1- Retângulo\n2- Círculo");
                    int forma = sc.nextInt();
                    System.out.println("Digite a altura da forma: ");
                    double h = sc.nextDouble();
                    System.out.println("Digite a largura da forma: ");
                    double w = sc.nextDouble();
                    System.out.println("Digite o nome da forma: ");
                    String n = sc.next();
                    sc.nextLine();
                    if(forma == 1){
                        formas.add(new Retangulo(h, w, n));
                    }else if(forma == 2){
                        formas.add(new Circulo());
                    }
                    System.out.println(formas.size()+" formas 2D cadastradas");
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 0:
                    
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (op != 0);
        sc.close();
    }
}
