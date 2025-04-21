public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(){}

    public Aluno(String nome, String cpf, int idade, String matricula){
        super(nome, cpf, idade);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
}
