
import java.util.Scanner;

/*
Utilizando como base a classe Pessoa implementada nas atividades anteriores, desenvolva um sistema de cursos, onde um Pessoa pode ser um Aluno ou um Instrutor. O sistema deve informar quais Alunos estão matriculados em qual curso e qual o instrutor de cada curso.
Desenvolva as classes necessárias e a classe com o método main para testar a aplicação
*/

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        // Criando um instrutor
        Instrutor prof1 = new Instrutor("Juliana", "324.324.321-43", 34, "Java");

        // Criando 2 alunos
        Aluno aluno1 = new Aluno("Davi Brito", "323.764.953-21", 73, "732849JH");
        Aluno aluno2 = new Aluno("Chalana", "837243829493", 23, "283721DE");

        // Criando um curso
        Curso curso1 = new Curso("Java", prof1);

        // Adicionando e listando os alunos do curso
        curso1.adicionarAlunos(aluno1);
        curso1.mostrarAlunos();

        curso1.adicionarAlunos(aluno2);
        curso1.mostrarAlunos();
    }
}
