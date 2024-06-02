import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();

        if(numero % 2 == 0){
            System.out.println("PAR");
        }else System.out.println("ÍMPAR");
    }
}
