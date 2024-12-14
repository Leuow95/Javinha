package Exercicios.Heranca;

public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic){
        this.selic = selic;
    }

    public void roda(Conta c){
        System.out.println("Saldo antes de atualizar Conta:" + c.getSaldo());
        c.atualiza(selic);
        saldoTotal = c.getSaldo();

    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}
