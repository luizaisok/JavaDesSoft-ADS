import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        // Usando o código classe Objeto.java

        Carro c1 = new Carro(); // Declaração + instanciação do objeto c2

        // c1.tipo = "Gol"; Editando atributo public
        c1.setTipo("Gol"); // Editando atributo private com set

        // c1.cor = "Preto";
        c1.setCor("Preto");
        
        // c1.placa = "OBP4J41";
        c1.setPlaca("OBP4J41");
        
        // c1.num_portas = 5;
        c1.setNum_portas(5);

        c1.ligar();

        Carro c2 = new Carro();

        c2.setTipo(JOptionPane.showInputDialog("Digite o modelo do carro:"));
        c2.setCor(JOptionPane.showInputDialog("Digite a cor do carro:"));
        c2.setPlaca(JOptionPane.showInputDialog("Digite a placa do carro:"));
        c2.setNum_portas(Integer.parseInt(JOptionPane.showInputDialog("Digite quantas portas o carro tem:")));

        JOptionPane.showMessageDialog(null, "--- Carro ---\nTipo: " + c2.getTipo() + "\nCor: " + c2.getCor() + "\nPlaca: " + c2.getPlaca() + "\nNúmero de portas: " + c2.getNum_portas());
    }
}
