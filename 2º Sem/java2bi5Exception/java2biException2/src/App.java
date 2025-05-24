/*
Suponha que o método "saca" da classe Conta vai ser rescrito de forma a lançar uma exceção criada por você, cuja classe é ContaExcecao (extends Exception). A exceção é lançada sempre que o saldo da conta for inferior ao valor sacado. Implemente a classe ContaExcecao. Implemente o método saca que lança a exceção. E rescreva o código da caixa com o devido tratamento da exceção.
*/

public class App {
    public static void main(String[] args){
        Conta c1 = new Conta();
        c1.sacar(200);
    }
}
