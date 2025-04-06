/*
 * Uma empresa de vendas precisa implementar a rotina de cobrança com a seguinte regra:
• Os boletos atrasados devem receber uma multa de 5% ao constar em atraso;
• O valor do boleto deve ser recalculado a cada dia com juros de 1% por dia de atraso (juros sobre juros);
• Desenvolva um programa em Java, Orientado a Objetos que dado o valor original do boleto, e os dias de atraso calcule o valor total a ser pago;

Exemplo: Um boleto no valor de R$ 259,90 com 2 dias de atraso deve ser recalculado em R$278,38
*/

public class Cobranca {
    private float valorBoleto;
    private int diasAtrasados;
    private float valorTotal;

    public Cobranca(){

    }

    public float getValorBoleto(){
        return this.valorBoleto;
    }

    public void setValorBoleto(float num){
        this.valorBoleto = num;
    }

    public int getDiasAtrasados(){
        return this.diasAtrasados;
    }

    public void setDiasAtrasados(int num){
        this.diasAtrasados = num;
    }

    public float setValorTotal(){
        return this.valorTotal;
    }

    public void setValorTotal(float num){
        this.valorTotal = num;
    }

    /*public float multa(float valorBoleto, int diasAtrasados){
        if(diasAtrasados < 1){
            return 0;
        }else{
            float multa = valorBoleto * 0.05f;
            for(int i = 0; i < diasAtrasados; i++){
                float multaTotal = multa * 0.01f;
            }
        return multaTotal;
        }
    }*/

    public float calculaValorTotal(){
        float valorComMulta = valorBoleto + (valorBoleto * 0.05f);
        float valorComJuros = valorComMulta;

        for(int i = 0; i < diasAtrasados; i++){
            valorComJuros = valorComJuros + (valorComJuros * 0.01f);
        }

        this.valorTotal = valorComJuros;
        return valorComJuros;
    }
}
