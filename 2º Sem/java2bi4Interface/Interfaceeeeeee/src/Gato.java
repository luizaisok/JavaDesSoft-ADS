public class Gato implements Animal{
    private String nome;
    private int idade;
    private boolean castrado;

    public Gato(){}

    public Gato(String nome, int idade, boolean castrado){
        this.nome = nome;
        this.idade = idade;
        this.castrado = castrado;
    }

    @Override
    public void som(){
        System.out.println("Miau miau MAIU MIKAU MIAU MAU MAIU MIAU");
    }

    @Override
    public void mover(){
        System.out.println("Pulando correndo");
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isCastrado() {
        return this.castrado;
    }

    public void setCastrado(boolean castrado) {
        this.castrado = castrado;
    }

    @Override
    public String toString(){
        return "Gato:\nNome: "+this.nome+". Idade: "+this.idade+". Castrado: "+this.castrado;
    }
}
