public class App {
    public static void main(String[] args) throws Exception{
        try{
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[10]);
        }catch (Exception e){
            System.out.println("Algo deu errado: " + e.toString());
            // e.printStackTrace(); // Mostra a localização
        }finally{
            System.out.println("Try Catch acabou");
        }
    }
}