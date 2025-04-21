import javax.swing.JOptionPane;

public class App{
    public static void main(String[] args) {
        
        Calculadora calc1 = new Calculadora();

        String fala = JOptionPane.showInputDialog("Digite um número");
        calc1.setNum1(Integer.parseInt(fala));
        fala = null;
        fala = JOptionPane.showInputDialog("Digite outro número:");
        calc1.setNum2(Integer.parseInt(fala));

        JOptionPane.showMessageDialog(null, "--- Cálculos ---\n"+calc1.getNum1()+" + "+calc1.getNum2()+" = "+calc1.soma()+"\n"+calc1.getNum1()+" - "+calc1.getNum2()+" = "+calc1.subtracao()+"\n"+calc1.getNum1()+" x "+calc1.getNum2()+" = "+calc1.multiplicacao()+"\n"+calc1.getNum1()+" / "+calc1.getNum2()+" = "+calc1.divisao());
    }
}