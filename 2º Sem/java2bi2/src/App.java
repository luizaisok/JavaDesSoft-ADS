public class App {
    public static void main(String[] args){
        Conta c1 = new Conta(100);
        ContaCorrente c2 = new ContaCorrente(100);

        System.out.println("-=-=-=-=-=-=-=-=-=-=- Conta -=-=-=-=-=-=-=-=-=-=-\n");

        c1.depositar(100);
        c1.atualizaSaldo(10);

        c2.depositar(100);
        c2.atualizaSaldo(10);

        System.out.println("Saldo em Conta 1: "+c1.getSaldo()+".\nSaldo em Conta 2: "+c2.getSaldo()+".");
    }
}
