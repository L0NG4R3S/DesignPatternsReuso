package templateMethod;

class Gato extends Pet {

    @Override
    void registraAlimentacao() {
        System.out.println("Registra alimentacao especifica para o Gato.");
    }

    @Override
    void maniasEBrincadeiras() {
        System.out.println("Registra manias e brincadeiras do Gato.");
    }

    @Override
    void registraPresefenciasDeAmbiente() {
        System.out.println("Preferencias de ambiente do Gato.");
    }
}
