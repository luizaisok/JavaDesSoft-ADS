public class ContaExcecao extends Exception{
    private double saldo;

    public void saldoInsuficiente() throws Exception{
        throw new Exception("O saldo é insuficiente para o valor do saque");
    }
}
