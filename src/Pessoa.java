public class Pessoa {
    private String nome;
    private String sobrenome;
    private Double saldo;
    private char sexo;

    //Método
    public Pessoa(String nome, String sobrenome, Double saldo, char sexo) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.saldo = saldo;
        this.sexo = sexo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Double getSaldo() {
        return saldo;
    }


    private void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean transferirDinheiro(Pessoa destinatario, Double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            destinatario.setSaldo(destinatario.getSaldo() + valor);
            return true;
        } else {
            return false;
        }
    }
}