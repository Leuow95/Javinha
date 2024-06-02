
public class Main {
    public static void main(String[] args) {

        Pessoa antonio = new Pessoa("Antonio", "Barreto", 30000.00, 'M');
        Pessoa icaro = new Pessoa("Ícaro", "Alves", 60000.00, 'M');

        icaro.transferirDinheiro(antonio,50.00);

        System.out.println(antonio.getSaldo());
        System.out.println(icaro.getSaldo());
    }
}


