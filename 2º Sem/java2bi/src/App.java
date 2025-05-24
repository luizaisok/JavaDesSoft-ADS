
import java.util.ArrayList;

public class App {
    public static void main(String[] args){

        System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-ANIMAL-=-=-=-=-=-=-=-=-=-=-\n");

        Animal animal1 = new Animal("Gato", 0.2, 0);
    
        System.out.println(animal1.toString());
        animal1.mover();
        System.out.println(animal1.toString());

        System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-PEIXE-=-=-=-=-=-=-=-=-=-=-\n");
    
        Peixe peixe1 = new Peixe("Nemo", 0.1, 5, false);
        System.out.println(peixe1.toString());
        //peixe1.nadar();
        // Polimorfismo:
        peixe1.mover();
        System.out.println(peixe1.toString());

        System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-PASSARO-=-=-=-=-=-=-=-=-=-=-\n");
        
        Passaro passaro1 = new Passaro("Pica-pau", 2.1, 7);
        System.out.println(passaro1.toString());
        // passaro1.voar();
        // Polimorfismo:
        passaro1.mover();
        System.out.println(passaro1.toString());

        ArrayList<Animal> listaAnimais = new ArrayList<>();
        listaAnimais.add(animal1);
        listaAnimais.add(peixe1);
        listaAnimais.add(passaro1);
        
        System.out.println("\n\n-=-=-=-=-=-=-=-=-=-=-LISTA DE ANIMAIS-=-=-=-=-=-=-=-=-=-=-\n");

        /*
            for(Animal a : listaAnimais){
                if(a instanceof Peixe){
                    ((Peixe) a).nadar();
                }else if(a instanceof Passaro){
                    ((Passaro) a).voar();
                }else{
                    a.mover();
                }
            }
        */
        // -=-=-=-=-=-=-=-=-=-=-=-=- POLIMORFISMO -=-=-=-=-=-=-=-=-=-=-=-=-
        for(Animal a : listaAnimais){
            a.mover();
        }
    }
}
