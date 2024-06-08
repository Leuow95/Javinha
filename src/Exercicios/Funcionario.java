package Exercicios;

public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;

    void recebeAumento(double valorAumento){
        this.salario += valorAumento;
    }

    double calculaGanhoAnual(){
        return salario*12;
    }
}
