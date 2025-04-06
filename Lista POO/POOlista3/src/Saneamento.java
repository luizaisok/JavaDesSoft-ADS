/*
A empresa de saneamento de uma cidade que controla o índice de poluição da água e mantém 3 grupos de indústrias que são altamente poluentes para o meio ambiente.
• O índice de poluição aceitável varia de 0,06 até 0,16.
• Se o índice sobe para 0,25 as indústrias do 1ž grupo são intimadas a reduzirem em 50% suas atividades;
• Se o índice crescer para 0,4 as industrias do 1ž e 2ž grupo são intimadas a suspenderem suas atividades.
• Se o índice atingir 0,5 todos os grupos devem ser notificados a paralisarem suas atividades.
• Desenvolva um programa em Java Orientado a objetos, que leia o índice de poluição medido e emita a notificação adequada aos diferentes grupos de empresas
*/

public class Saneamento {
    private float indicePoluicao;
    public Saneamento(){

    }

    public float getIndicePoluicao(){
        return this.indicePoluicao;
    }

    public void setIndicePoluicao(float num){
        this.indicePoluicao = num;
    }

    public String atencaoPoluicao(){
        String texto;
        if (this.indicePoluicao >= 0.06f && this.indicePoluicao <= 0.16f){
            texto = "Índice de poluição atual: " + this.indicePoluicao + ". Índice de poluição aceitável.";
        }else if(this.indicePoluicao > 0.16f && this.indicePoluicao < 0.25f){
            texto = "Índice de poluição em crescente. Todas as indústrias podem continuar em atividade.";
        }else if(this.indicePoluicao >= 0.25f && this.indicePoluicao < 0.4f){
            texto = "Índice de poluição em "+this.indicePoluicao+". As indústrias do 1º grupo devem reduzir suas atividades em 50%.";
        }else if(this.indicePoluicao >= 0.4f && this.indicePoluicao < 0.5f){
            texto = "Índice de poluição em "+this.indicePoluicao+". Indústrias do 1º e 2º grupo devem suspender suas atividades";
        }else{
            texto = "Índice de poluição em "+this.indicePoluicao+". Todas as indústrias devem paralisar suas atividades";
        }
        return texto;
    }








}
