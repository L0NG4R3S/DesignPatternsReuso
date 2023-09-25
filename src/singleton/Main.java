package singleton;
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = Pessoa.getInstance("João", "123456789");
        ONG ong = ONG.getInstance("Minha ONG", "987654321");

        System.out.println("Nome da Pessoa: " + pessoa.getNome());
        System.out.println("CPF da Pessoa: " + pessoa.getCpf());

        System.out.println("Nome da ONG: " + ong.getNome());
        System.out.println("CNPJ da ONG: " + ong.getCnpj());
    }
}
