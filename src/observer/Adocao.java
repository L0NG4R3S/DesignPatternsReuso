package observer;
import java.util.ArrayList;
import java.util.List;

// Classe que representa o sujeito (objeto observado)
class Adocao {
    private String status;
    private List<Adotante> observadores = new ArrayList<>();

    public void adicionarObservador(Adotante observador) {
        observadores.add(observador);
    }

    public void removerObservador(Adotante observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores() {
        for (Adotante observador : observadores) {
            observador.atualizar(status);
        }
    }

    public void setStatus(String novoStatus) {
        status = novoStatus;
        notificarObservadores();
    }
}
