/*
Escreva uma classe Matriz matemática. Forneça:
    a) Construtor para inicializar as dimensões;
    b) Métodos de acesso aos elementos;
    c) Método de comparação semântica;

    d) Método que retorna a transposta;
    e) Método que retorna a oposta;
    f) Método que gera matriz nula;
    g) Método que verifica se é identidade;
    h) Método que verifica se é diagonal;
    i) Método que verifica se é singular;
    j) Método que verifica se é simétrica;
    k) Método que verifica se é anti-simétrica;
    l) Método para somar duas matrizes;
    m) Método para subtrair duas matrizes;
    n) Método para multiplicar duas matrizes;
    o) Método que gera uma cópia da matriz.
*/

public class Matriz{
    private int linha;
    private int coluna;
    private double[][] elementos;

    public Matriz(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
        this.elementos = new double[linha][coluna];
    }

    public int getLinha() {
        return this.linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return this.coluna;
    }

    public void setColuna(int colunas) {
        this.coluna = colunas;
    }

    public double getElementos(int linha, int coluna){
        return this.elementos[linha][coluna];
    }

    public void setElementos(int linha, int coluna, double valor){
        this.elementos[linha][coluna] = valor;
    }

    public boolean ehIgual(Matriz outra){
        if(this.coluna != outra.coluna || this.linha != outra.linha){ // Comparando quantidade de linhas e colunas
            return false;
        }

        for(int i = 0; i < linha; i++){ // Comparando os valores dos elementos
            for(int j = 0; j < coluna; j++){
                if(this.elementos[i][j] != outra.getElementos(i, j)){
                    return false;
                }
            }
        }

        return true;
    }

    public Matriz transposta(){
        Matriz transposta = new Matriz(this.coluna, this.linha);

        for(int i = 0; i < this.linha; i++){
            for(int j = 0; j < this.coluna; j++){
                double valor = this.elementos[i][j];
                transposta.setElementos(j, i, valor);
            }
        }

        return transposta;
    }

}
