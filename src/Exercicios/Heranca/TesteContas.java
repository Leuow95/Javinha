package Exercicios.Heranca;

public class TesteContas {
    public static void main(String[] args) {
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupança cp = new ContaPoupança();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);

        System.out.println(c.saldo);
        System.out.println(cc.saldo);
        System.out.println(cp.saldo);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);

        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}
