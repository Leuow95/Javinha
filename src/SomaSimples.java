import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        Integer valor1 = read.nextInt();
        Integer valor2 = read.nextInt();

        Auxiliar auxiliar1 = new Auxiliar();
        int resultado2 = Auxiliar.soma2(valor1, valor2);

        int resultado = auxiliar1.soma(valor1, valor2);

        System.out.println("SOMA = " + resultado);
        System.out.println("SOMA = " + resultado2);


    }

    /*public static int soma(int valor1, int valor2) {
        return valor1 + valor2;
    }*/
}

class Auxiliar{
    int soma(int valor1, int valor2){
        return valor1 + valor2;
    }

     static int soma2(int valor1, int valor2){
            return valor1+valor2;
    }
}