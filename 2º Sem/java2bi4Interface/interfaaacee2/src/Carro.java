public class Carro implements Veiculo{
    private String modelo;

    public Carro(){};
    public Carro(String modelo){
        this.modelo = modelo;
    };

    @Override
    public void acelerar(){
        System.out.println("senta o pé no acelerador");
    }

    @Override
    public void frear(){
        System.out.println("freando");
    }

    @Override
    public String obterTipo(){
        return "Carro. Modelo: "+this.modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
