public class Cachorro implements Animal{
    private String nome;
    private int idade;
    private boolean castrado;

    public Cachorro(){}

    public Cachorro(String nome, int idade, boolean castrado){
        this.nome = nome;
        this.idade = idade;
        this.castrado = castrado;
    }

    @Override
    public void som(){
        System.out.println("Au UA AU AUA UAUA AU AUU UAUAUUA AUA U A UA AUAU A UA UAU AU");
    }

    @Override
    public void mover(){
        System.out.println("o: o: o: o:\n  o: o: o: o:");
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
        return "Cachorro:\nNome: "+this.nome+". Idade: "+this.idade+". Castrado: "+this.castrado;
    }
}