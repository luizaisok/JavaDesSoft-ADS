
import java.util.ArrayList;

public class Curso {
    private String nome;
    private Instrutor instrutor;
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nome, Instrutor instrutor){
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public void adicionarAlunos(Aluno aluno){
        alunos.add(aluno);
    }

    public void mostrarAlunos(){
        System.out.println("Alunos matriculados nesse curso:");
        for(int i = 0; i < alunos.size(); i++){
            System.out.println(alunos.get(i).getNome());
        }
    }
}
