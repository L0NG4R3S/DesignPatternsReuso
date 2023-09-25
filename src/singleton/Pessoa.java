package singleton;
public class Pessoa extends Doador {
    private String cpf;

    private Pessoa(String nome, String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public static Pessoa getInstance(String nome, String cpf) {
        return PessoaHolder.INSTANCE;
    }

    public String getCpf() {
        return cpf;
    }

    private static class PessoaHolder {
        private static final Pessoa INSTANCE = new Pessoa("John Doe", "123456789");
    }
}