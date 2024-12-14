package Exercicios;

public class Empresa {
    public String nome;
    public String cnpj;
    public Funcionario[] empregados;
    static public int qtdFuncionarios;


    public Empresa(String nome, String cnpj){
        this.nome = nome;
        this.cnpj = cnpj;
        this.empregados = new Funcionario[10];
    }

    void adiciona(Funcionario f){

        for(int i=0; i < empregados.length; i++){
             if(empregados[i] !=null){
                 System.out.println("Funcionario: " + empregados[i].getNome());
                 System.out.println("Salario: " + empregados[i].getSalario());
             }else {
                 empregados[i] = f;
                 qtdFuncionarios++;
                 System.out.println("Quantidade atual de funcionários: " + qtdFuncionarios);
                 return;
             }
        }
    }

    void mostraEmpregados(){
        for (Funcionario empregado : empregados) {
            if(empregado!=null){
                System.out.println(empregado.getSalario());
            }
        }
    }
}
