public class Conta {
    private double saldo;

    public Conta(){};

    public Conta(double saldo){
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valorSaque){
        if(valorSaque > this.saldo){
            ContaExcecao ce = new ContaExcecao();
            try {
                ce.saldoInsuficiente();
            } catch (Exception e) {
                System.out.println("Erro!" + e);
            }
        }
    }

    public boolean depositar(double valorDeposito){
        boolean isOk = false;
        if(valorDeposito > 0){
            this.saldo += valorDeposito;
            isOk = true;
        }
        return isOk;
    }

    // Atualiza saldo (como rendimento)
    public boolean atualizaSaldo(double taxa){
        boolean isOk = false;
        if(taxa >= 1 && taxa <= 100){
            this.saldo += this.saldo * (taxa/100);
            isOk = true;
        }
        return isOk;
    }

    @Override
    public String toString() {
        return "Conta: Saldo= " + this.saldo;
    }
}
