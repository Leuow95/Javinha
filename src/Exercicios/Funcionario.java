package Exercicios;

public class Funcionario {
    private String nome;
    private String departamento;
    private String rg;
    private double salario;
    private Data dataEntrada;

    public Funcionario(
        String nome,
        String departamento,
        String rg,
        double salario,
        Data dataEntrada
    ){
        this.setNome(nome);
        this.setDepartamento(departamento);
        this.setSalario(salario);
        this.setRg(rg);
        this.setDataEntrada(dataEntrada);
    }



    void mostra(){
        System.out.println("Nome: "+ getNome());
        System.out.println("Departamento: " + getDepartamento());
        System.out.println("Salário: "+ getSalario());
        System.out.print("Data de Entrada na empresa: " + getDataEntrada().dia);
        System.out.print("/" + getDataEntrada().mes);
        System.out.println("/" + getDataEntrada().ano);
        System.out.println("Rg: " + getRg());
    }

    void recebeAumento(double valorAumento){
        this.setSalario(this.getSalario() + valorAumento);
    }

    double calculaGanhoAnual(){
        return getSalario() *12;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Data getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Data dataEntrada) {
        this.dataEntrada = dataEntrada;
    }
}
