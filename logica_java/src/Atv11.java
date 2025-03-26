/* Você foi contratado para implementar um algoritmo para organizar a fila de espera de um consultório médico. Nesse caso, o seu algoritmo deve armazenar em um arraylist o nome das pessoas na ordem em que elas chegam no consultório, pois elas serão atendidas de acordo com essa ordem. Dessa forma, o seu algoritmo deve permiLr à secretária do consultório:
1. Adicionar um paciente: essa opção deve adicionar o nome da pessoa no final da fila.
2. Atender um paciente: o paciente a ser atendido é o que está na primeira posição da fila.
3. Desistência: remove um paciente da fila, independente da sua posição.
4. Verificar posição de um paciente.
5. Verificar o tamanho da fila.
6. Imprimir fila.
7. Sair. */

import java.util.ArrayList;
import java.util.Scanner;

public class Atv11 {
    public static void main(String args[]){
        Scanner fala = new Scanner(System.in);
        ArrayList<String> pacientes = new ArrayList<>();
        int op;
        String nome;

        do{
            System.out.println("Digite o código da ação desejada presente no menu:");
            op = fala.nextInt();

            switch(op){
                case 1:
                    System.out.println("Digite o nome do paciente que deseja adicionar:");
                    nome = fala.nextLine();
                    pacientes.add(nome);
                case 2:
                    if(pacientes.get(0) == null){
                        System.out.println("Não há pacientes.");
                    }else{
                        System.out.println("O próximo paciente á ser atendido é: " + pacientes.get(0) + ". Vamos atendê-la.");
                        pacientes.remove(0);
                    }
                case 3:
                    if(pacientes.get(0) == null){
                        System.out.println("Não há pacientes.");
                    }else{
                        System.out.println("Digite o nome do paciente que deseja remover:");
                        nome = fala.nextLine();
                        if(!pacientes.contains(nome)){
                            System.out.println("Esse paciente não está na lista.");
                        }else{
                            pacientes.remove(nome);
                        }
                    }
                case 4:
                    if(pacientes.get(0) == null){
                        System.out.println("Não há pacientes.");
                    }else{
                        
                    }
                case 5:
                case 6:
                case 7:
                default:
                    System.out.println("Opção inválida");
            }

        }while(op != 7);

        fala.close();
    }
}
