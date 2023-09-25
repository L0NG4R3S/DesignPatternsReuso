package observer;

class Adotante {
    private String nome;

    public Adotante(String nome) {
        this.nome = nome;
    }

    public void atualizar(String novoStatus) {
        System.out.println(nome + " foi notificado sobre a adoção: " + novoStatus);
    }
}
