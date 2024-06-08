package Exercicios;

public class Funcionario {
    String nome;
    String departamento;
    double salario;
    String dataEntrada;
    String rg;

    void mostra(){
        System.out.println("Nome: "+ nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: "+ salario);
        System.out.println("Data de Entrada na empresa:" + dataEntrada);
        System.out.println("Rg: " + rg);
    }

    void recebeAumento(double valorAumento){
        this.salario += valorAumento;
    }

    double calculaGanhoAnual(){
        return salario*12;
    }
}
