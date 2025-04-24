/*
Escreva uma classe País com os seguintes atributos: código ISO, nome, população e dimensão (km2). Forneça os seguintes membros:
a) Construtor com código ISO, nome e dimensão;
b) Métodos de acesso (getter/setter);

c) Método de comparação semântica (igualdade de ISO);
d) Método que verifica se outro país é limítrofe;
e) Método que retorna a densidade populacional;
f) Método que retorna os vizinhos comuns a outro país
*/

public class Pais {
    private String nome;
    private int populacao;
    private double dimensaoKm;
    private String ISO;

    public Pais(String nome, int populacao, double dimensaoKm, String ISO){
        this.nome = nome;
        this.populacao = populacao;
        this.dimensaoKm = dimensaoKm;
        this.ISO = ISO;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPopulacao() {
        return this.populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public double getDimensaoKm() {
        return this.dimensaoKm;
    }

    public void setDimensaoKm(double dimensaoKm) {
        this.dimensaoKm = dimensaoKm;
    }

    public String getISO() {
        return this.ISO;
    }
    
    public void setISO(String iSO) {
        this.ISO = iSO;
    }    
}
