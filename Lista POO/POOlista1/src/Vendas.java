/*
Um trabalhador autônomo deseja controlar suas finanças, comprou um microcomputador para controlar o rendimento diário de seu trabalho.
• Toda vez que ele vende um valor maior que o estabelecido pelo regulamento de MEI do estado onde vive (500,00 R$ dia) deve pagar um multa de R$ 0,10 a cada Real excedente.
• Este trabalhador precisa que você faça um programa em Java que leia o valor de todas as vendas do mês e verifique se há excesso (vendeu mais de 500,00 por dia).
• Se houver excesso, gravar na variável E (Excesso) e na variável M o valor da multa que o Trabalhador deverá pagar.
• Caso contrário mostrar tais variáveis com o conteúdo ZERO.

Desenvolva uma aplicação Java Orientada a Objetos e as classes necessárias para resolver o problema.
O sistema deve conter um menu com no mínimo as seguintes opções
1 - cadastro de vendas
2 - consulta de imposto a pagar no mês (com base no mês e no ano das vendas).
0 - Sair
*/

public class Vendas {
    private double valor;
    private int mes;
    private int ano;
    private double excesso;
    private double multa;

    public Vendas(){}

    public Vendas(double valor, int mes, int ano){
        this.valor = valor;
        this.mes = mes;
        this.ano = ano;
        calcularMulta();
    }

    public double getValor(){
        return this.valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public int getMes(){
        return this.mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public double getExcesso(){
        return this.excesso;
    }

    public void setExcesso(double excesso){
        this.excesso = excesso;
    }

    public double getMulta(){
        return this.multa;
    }

    public void setMulta(double multa){
        this.multa = multa;
    }

    private void calcularMulta(){
        if(this.valor > 500){
            this.excesso = this.valor - 500;
            this.multa = this.excesso * 0.10;
        }else{
            this.excesso = 0;
            this.multa = 0;
        }
    }
}