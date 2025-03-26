// Média de 3 notas declaradas pelo usuário, rodando até que ele digite 0 como código do aluno.

import javax.swing.JOptionPane;

public class Atv1 {
    public static void main(String[] args) throws Exception {
        int codAluno = 0, i;
        double media = 0;

        do{
            codAluno = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o código do aluno para prosseguir. Código 0 significa parar."));
            if(codAluno == 0){
                JOptionPane.showMessageDialog(null, "Encerramos gatinha!");
            }else{
                for(i = 0; i < 3; i++){
                    media+= Integer.parseInt(JOptionPane.showInputDialog("Digite a nota " + (i+1) + " do aluno."));
                }
                JOptionPane.showMessageDialog(null, "A média do aluno " + codAluno + " é " + (media/3));
            }
        }while(codAluno != 0);
    }
}
