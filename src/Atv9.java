// Faça uma aplicação que receba o nome completo do usuário, e depois troque o seu último sobrenome por Silva. Mostre o resultado na tela.

import java.util.Scanner;

public class Atv9 {
    public static void atv9(String args[]){
        String nomeCompleto = new String(); // Variável string que vai receber o nome do usuário
        Scanner falaSeuNome = new Scanner(System.in);

        System.out.println("Digite seu nome completo:");
        nomeCompleto = falaSeuNome.nextLine();

        String[] nomeSeparado = nomeCompleto.split(" "); // Uma variável array que vai rceber os componentes da string separados por espaço

        if(nomeSeparado.length > 1){
            nomeSeparado[nomeSeparado.length - 1] = "Silva"; // Pegou o último componente e mudou por Silva
        }else{
            nomeCompleto+= "Silva";
        }

        nomeCompleto = String.join(" ", nomeSeparado); // Guardou na variável inicial a array que foi juntada por espaço

        System.out.println("Seu nome é " + nomeCompleto);

        falaSeuNome.close();
    }
}