public class Peixe extends Animal{
    private boolean aguaDoce;

    public Peixe(String nome, double velocidade, double localizacao, boolean agua){
        super(nome, velocidade, localizacao);
        this.aguaDoce = agua;
    }

    public Peixe(){}

    public boolean isAguaDoce() {
        return this.aguaDoce;
    }

    public void setAguaDoce(boolean aguaDoce) {
        this.aguaDoce = aguaDoce;
    }

    public void mover(){
        System.out.println(" _ - _ - _ ->");
        super.setLocalizacao(super.getLocalizacao() + super.getVelocidade());
    }

    @Override
    public String toString() {
        return super.toString() + ", água doce= " + this.aguaDoce;
    }
}
