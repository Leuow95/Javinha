package Exercicios;

public class Arrays {
    public static void main(String[] args) {

        Funcionario[] funcionarios;
        funcionarios = new Funcionario[10];

        Funcionario antonio = new Funcionario();

        antonio.nome = "Antonio";

        funcionarios[0] = antonio;


        for (int i = 0; i < 10; i++){
            System.out.println(funcionarios[i].nome);
        }

    }
}
