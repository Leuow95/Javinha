package Exercicios.Heranca;

public class ContaPoupança extends Conta{

    @Override
    public void atualiza(double taxa) {
        this.saldo += saldo * taxa * 3;
    }
}
