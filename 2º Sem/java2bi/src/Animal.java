public class Animal{
    private String nome;
    private double peso;
    private double tamanho;
    private int patas;
    private double velocidade;
    private double localizacao;
    
    public Animal(String nome, double velocidade, double localizacao){
        this.nome = nome;
        this.velocidade = velocidade;
        this.localizacao = localizacao;
    }

    public Animal(){}

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public int getPatas() {
        return this.patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public double getVelocidade() {
        return this.velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getLocalizacao() {
        return this.localizacao;
    }

    public void setLocalizacao(double localizacao) {
        this.localizacao = localizacao;
    }

    public void mover(){
        System.out.println(" > > >");
        this.localizacao += this.velocidade;
    }

    @Override
    public String toString() {
        return "Animal: Nome= " + this.nome + ", peso= " + this.peso + ", tamanho= " + this.tamanho + ", patas= " + this.patas + ", velocidade= " + this.velocidade + ", localizacao= " + this.localizacao;
    }
}