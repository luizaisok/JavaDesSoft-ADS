public class Passaro extends Animal{
    
    public Passaro(String nome, double velocidade, double localizacao){
        super(nome, velocidade, localizacao);
    }

    public Passaro(){}

    public void mover(){
        System.out.println("v ^^ v ^^ v ^^");
        super.setLocalizacao(super.getLocalizacao() + super.getVelocidade());
    }

    @Override
    public String toString(){
        return "Passaro: " + super.toString();
    }
}
