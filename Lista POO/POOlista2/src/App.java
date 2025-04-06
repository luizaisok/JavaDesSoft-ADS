/*
 * Uma empresa de vendas precisa implementar a rotina de cobrança com a seguinte regra:
• Os boletos atrasados devem receber uma multa de 5% ao constar em atraso;
• O valor do boleto deve ser recalculado a cada dia com juros de 1% por dia de atraso (juros sobre juros);
• Desenvolva um programa em Java, Orientado a Objetos que dado o valor original do boleto, e os dias de atraso calcule o valor total a ser pago;

Exemplo: Um boleto no valor de R$ 259,90 com 2 dias de atraso deve ser recalculado em R$278,38
*/

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner fala =  new Scanner(System.in);

        Cobranca boleto1 = new Cobranca();

        System.out.println("Qual o valor do boleto?");
        float valor = fala.nextFloat();
        boleto1.setValorBoleto(valor);

        System.out.println("Quantos dias de atraso para o pagamento deste boleto?");
        int dias = fala.nextInt();

        boleto1.setDiasAtrasados(dias);

        float valorTotal = boleto1.calculaValorTotal();

        System.out.println("O valor original do boleto era de: "+boleto1.getValorBoleto()+" e os dias de atraso foram iguais à: "+boleto1.getDiasAtrasados()+". O valor da multa total foi de: "+String.format("%.2f", valorTotal));
        fala.close();
    }
}
