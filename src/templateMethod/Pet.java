package templateMethod;

abstract class Pet {

 // Template Method
 public void cuidarDoPet() {
	 registraAlimentacao();
     maniasEBrincadeiras();
     registraPresefenciasDeAmbiente();
 }

 // Métodos abstratos
 abstract void registraAlimentacao();
 abstract void maniasEBrincadeiras();
 abstract void registraPresefenciasDeAmbiente();
}
