package templateMethod;

public class Main {
	public static void main(String[] args) {
        System.out.println("Cuidando do cachorro:");
        Pet cachorro = new Cachorro();
        cachorro.cuidarDoPet();

        System.out.println("\nCuidando do coelho:");
        Pet coelho = new Coelho();
        coelho.cuidarDoPet();

        System.out.println("\nCuidando do gato:");
        Pet gato = new Gato();
        gato.cuidarDoPet();
    }
}
