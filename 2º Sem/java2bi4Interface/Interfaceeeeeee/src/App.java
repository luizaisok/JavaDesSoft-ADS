
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Animal cachorro1 = new Cachorro("Cacau", 12, false);
        Animal gato1 = new Gato("Miladie", 3, true);

        ArrayList<Animal> listAnimals = new ArrayList<>();
        listAnimals.add(cachorro1);
        listAnimals.add(gato1);

        for(Animal item : listAnimals){
            System.out.println(item.toString());
            item.som();
            item.mover();
            System.out.println();
        }
    }
}
