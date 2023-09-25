package templateMethod;

class Cachorro extends Pet {

    @Override
    void registraAlimentacao() {
        System.out.println("Registra alimentacao especifica para o cachorro.");
    }

    @Override
    void maniasEBrincadeiras() {
        System.out.println("Registra manias e brincadeiras do cachorro.");
    }

    @Override
    void registraPresefenciasDeAmbiente() {
        System.out.println("Preferencias de ambiente do cachorro.");
    }
}
