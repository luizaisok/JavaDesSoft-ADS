import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Menu menuzinho = new Menu();

        menuzinho.exibirMenu(sc);
        sc.close();
    }
}
