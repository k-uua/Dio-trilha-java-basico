public class Main {
    public static void main(String[] args) {
        Cliente kaua = new Cliente();
        kaua.setNome("Kauã");

        Conta cc = new ContaCorrente(kaua);
        Conta pp = new ContaPoupanca(kaua);

        cc.depositar(150);
        cc.transferir(50, pp);
        cc.pagarConta("156", 20);
        

        cc.imprimirExtrato();
        pp.imprimirExtrato();
    }
}
