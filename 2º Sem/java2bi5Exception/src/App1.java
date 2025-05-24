import java.io.IOException;

public class App1 {
    public void m() throws IOException{ // Obriga o bicho [m] a ser posto num try catch 
        throw new IOException("Erro de dispositivo");
    }
    public static void main(String[] args){
        try{
            App1 obj = new App1();
            obj.m();
        }catch (IOException e) {
            System.out.println("Exceção tratada");
        }
    }
}