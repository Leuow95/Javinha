package Exercicios;

public class TestaEmpresa {
    public static void main(String[] args) {
        Empresa empresa1 = new Empresa("MAIASOFT", "123456789011");

        Data dataEntrada = new Data(12, 12, 2024);
        Funcionario funcionario1;
        funcionario1 = new Funcionario(
                "Primeiro Funcionário",
                "Departamento de Tecnologia",
                "123456789",
                50_000.00,
                dataEntrada
        );

        empresa1.adiciona(funcionario1);
        Funcionario funcionario2;

        funcionario2 = new Funcionario(
                "Segundo Funcionário",
                "Departamento de Tecnologia",
                "123456789",
                10_000.00,
                dataEntrada
        );
        empresa1.adiciona(funcionario2);

        empresa1.mostraEmpregados();

    }
}
