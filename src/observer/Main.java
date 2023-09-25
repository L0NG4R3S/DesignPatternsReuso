package observer;

public class Main {
	public static void main(String[] args) {
        Adocao adocao = new Adocao();

        // Criando observadores (Adotantes)
        Adotante adotante1 = new Adotante("João");
        Adotante adotante2 = new Adotante("Maria");

        // Registrando observadores com o objeto observado (Adocao)
        adocao.adicionarObservador(adotante1);
        adocao.adicionarObservador(adotante2);

        // Simulando uma mudança no status da adoção
        adocao.setStatus("Adoção aprovada");

        // Resultado: Os observadores (Adotantes) serão notificados automaticamente
    }
}
