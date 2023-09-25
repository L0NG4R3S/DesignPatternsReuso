package templateMethod;

class Coelho extends Pet {

    @Override
    void registraAlimentacao() {
        System.out.println("Registra alimentacao especifica para o Coelho.");
    }

    @Override
    void maniasEBrincadeiras() {
        System.out.println("Registra manias e brincadeiras do Coelho.");
    }

    @Override
    void registraPresefenciasDeAmbiente() {
        System.out.println("Preferencias de ambiente do Coelho.");
    }
}

