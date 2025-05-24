public class Caminhao implements Veiculo{
    private int capacidadeCarga;

    public Caminhao(){};
    public Caminhao(int capacidadeCarga){
        this.capacidadeCarga = capacidadeCarga;
    };

    @Override
    public void acelerar(){
        System.out.println("acelera pra atropelar aquele cavalo");
    }

    @Override
    public void frear(){
        System.out.println("senta o pé no freio");
    }

    @Override
    public String obterTipo(){
        return "Caminhao. Capacidade de carga: "+this.capacidadeCarga;
    }

    public int getCapacidadeCarga() {
        return this.capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
