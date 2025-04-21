public class LivroDigital extends Livro{
    private Double tamanhoMb;

    public LivroDigital(){};

    public LivroDigital(String nome, String autor, int anoPublicacao, double tamanhoMb){
        super(nome, autor, anoPublicacao);
        this.tamanhoMb = tamanhoMb;
    }

    public Double getTamanhoMb() {
        return tamanhoMb;
    }

    public void setTamanhoMb(Double tamanhoMb) {
        this.tamanhoMb = tamanhoMb;
    }

    @Override
    public String toString(){
        return super.toString()+"Tamanho em Mb: "+this.tamanhoMb;
    }
}