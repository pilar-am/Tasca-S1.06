package n2exercici2;

import n1exercici1.Persona;

public class Main {

	public static void main(String[] args) {
		
		/*- Exercici 2
		Modifica l'apartat anterior de manera que els arguments del m�tode gen�ric 
		siguin una llista d'arguments de variable indefinida.
		 * 
		 */
		
		GenericMethodsArraList persones = new GenericMethodsArraList();
		
		persones.afegirElements(new Persona("Fernando", "Gonzalez", 30));
		persones.afegirElements(new Persona("Anna", "Ben�tez", 30));
		persones.afegirElements(new Persona("Juan", "S�nchez", 30));
		
		persones.mostrarElements();

	}

}
