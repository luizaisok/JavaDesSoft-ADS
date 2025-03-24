// Mostrar toda a tabuada de 1 a 10, sendo de 1 à 5 na primeira linha e 6 à 10 na segunda linha.

public class Atv4{
    public static void main(String args[]){
        int i, j;

        for(i = 1; i <= 10; i++){
            for(j = 1; j <= 5; j++){
                System.out.print(j + " x " + i + " = " + (i*j) + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        for(i = 1; i <= 10; i++){
            for(j = 6; j <= 10; j++){
                System.out.print(j + " x " + i + " = " + (i*j) + "\t");
            }
            System.out.println();
        }
    }
}