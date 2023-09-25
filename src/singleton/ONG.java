package singleton;
public class ONG extends Doador {
    private String cnpj;

    private ONG(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public static ONG getInstance(String nome, String cnpj) {
        return ONGHolder.INSTANCE;
    }

    public String getCnpj() {
        return cnpj;
    }

    private static class ONGHolder {
        private static final ONG INSTANCE = new ONG("Minha ONG", "987654321");
    }
}