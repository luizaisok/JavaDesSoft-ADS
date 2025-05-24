public class ContaPoupanca extends Conta{
    
    public ContaPoupanca(){};

    public ContaPoupanca(double saldo){
        super(saldo);
    }

    public boolean atualizaSaldo(double taxa){
        return super.atualizaSaldo(taxa * 3);
    }

    @Override
    public String toString() {
        return "Conta Poupança: " + super.toString();
    }
}
