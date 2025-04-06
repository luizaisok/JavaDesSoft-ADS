import java.util.ArrayList;
import java.util.Scanner;

/*
Foi feita uma pesquisa entre os habitantes de uma cidade. Foram coletados os dados de idade, gênero (M/F) e renda. Faça uma aplicação em Java Orientada a Objetos contenha um
menu onde seja possível registrar, os dados de cada habitante e, ainda consultar as seguintes informações:
1. A média de salário do grupo;
2. Maior e menor idade do grupo;
3. Quantidade de habitantes do gênero masculino com salário até R$ 1000,00;
4. Quantidade de habitantes do gênero feminino;
*/

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        ArrayList<Habitante> cidade1 = new ArrayList<>();
        int op;

        do { 
            System.out.println("Menu: ");
            op = scan.nextInt();
            switch(op){
                case 1:
                    System.out.println("Salario");
                    double salario = scan.nextDouble();
                    System.out.println("Idade");
                    int idade = scan.nextInt();
                    System.out.println("Genero F ou M");
                    String genero = scan.next();
                    
                    cidade1.add(new Habitante(salario, idade, genero));
                    
                    break;
                case 2:
                    double totalSalario = 0;
                    for(int i = 0; i < cidade1.size(); i++){
                        totalSalario += cidade1.get(i).getSalario();
                    }
                    double media = totalSalario / cidade1.size();
                    System.out.println("Media salarial: "+media);
                    break;
                case 3:
                    int maior = 0;
                    int menor = 0;
                    for(int i = 0; i < cidade1.size(); i++){
                        if(i == 0){
                            maior = cidade1.get(i).getIdade();
                            menor = cidade1.get(i).getIdade();
                        }else if(cidade1.get(i).getIdade() > maior){
                            maior = cidade1.get(i).getIdade();
                        }else if(cidade1.get(i).getIdade() < menor){
                            menor = cidade1.get(i).getIdade();
                        }
                    }
                    System.out.println("Menor idade: " + menor + ". Maior idade: " + maior);
                    break;
                case 4:
                    int quantM = 0;
                    for(int i = 0; i < cidade1.size(); i++){
                        if(cidade1.get(i).getGenero().equals("M")){
                            if(cidade1.get(i).getSalario() > 1000) {
                                quantM++;
                            }
                        }
                    }
                    System.out.println("Quantidade de homens: "+quantM);
                    break;
                case 5:
                    int quantF = 0;
                    for(int i = 0; i < cidade1.size(); i++){
                        if(cidade1.get(i).getGenero().equals("F")){
                            quantF++;
                        }
                    }
                    System.out.println("Quantidade de mulheres: "+quantF);
                    break;
                case 0:
                    System.out.println("Saindo");
                    break;
                default:
                System.out.println("Opção inválida");
            }
        } while (op != 0);
    }
}
