package Exercicios;

public class Loops {
    public static void main(String[] args) {
//        de1A150();
//        de1A1000();
//        multiply3();
    factorial(5);

    }

    public static void de1A150(){
        for(int i = 150; i <= 300; i++){
            System.out.println(i);
        }
    }

    public static void de1A1000(){
        int resultado = 0;
        for(int i = 1; i <= 1000; i++){
            resultado+=i;
        }
        System.out.println(resultado);
    }

    public static void multiply3(){
        for(int i =1; i <= 100; i++){
            if(i%3==0) System.out.println(i);
        }
    }

    public static void factorial(int value){
        long resultado = value;
        for (; value > 1; value--){
            resultado *= value-1;
        }
        System.out.println("fatorial: " + resultado);
    }
}
