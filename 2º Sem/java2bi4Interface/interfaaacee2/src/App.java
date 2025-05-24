
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Veiculo carro1 = new Carro("Honda");
        Veiculo bicic1 = new Bicicleta("Mountain Bike");
        Veiculo caminhao1 = new Caminhao(345);

        ArrayList<Veiculo> testVeiculos = new ArrayList<>();
        testVeiculos.add(carro1);
        testVeiculos.add(bicic1);
        testVeiculos.add(caminhao1);

        for(Veiculo item : testVeiculos){
            System.out.println(item.obterTipo());
            item.acelerar();
            item.frear();
            System.out.println();
        }
    }
}
