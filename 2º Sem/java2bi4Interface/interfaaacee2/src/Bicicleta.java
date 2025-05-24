public class Bicicleta implements Veiculo{
    private String tipoEstrada;

    public Bicicleta(){};
    public Bicicleta(String tipoEstrada){
        this.tipoEstrada = tipoEstrada;
    };

    @Override
    public void acelerar(){
        System.out.println("acelera essa porra");
    }

    @Override
    public void frear(){
        System.out.println("rompeu o freio");
    }

    @Override
    public String obterTipo(){
        return "Bicicleta. Tipo de Estrada: "+this.tipoEstrada;
    }

    public String getTipo() {
        return this.tipoEstrada;
    }

    public void setTipo(String tipoEstrada) {
        this.tipoEstrada = tipoEstrada;
    }
}
