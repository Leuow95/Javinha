package Exercicios.Heranca;

public class ContaCorrente extends Conta{

    @Override
    public void atualiza(double taxa) {
        this.saldo += this.saldo * taxa * 2;
    }

    @Override
    public void deposita(double valor) {
        saldo += valor - 0.10;
    }
}
