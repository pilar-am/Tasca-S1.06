package n2exercici1;

import n1exercici2.Persona;

public class Main {

	public static void main(String[] args) {
		
		/*- Exercici 1
		Modifica l'exercici anterior de manera que un dels arguments del m�tode gen�ric no sigui gen�ric
		*
		*/

		GenericMethodsArgNoGeneric genericMethodsArgNoGeneric = new GenericMethodsArgNoGeneric((new Persona("Fernando", "Gonzalez", 30)), 37, "Tipus String");
		
		System.out.println(genericMethodsArgNoGeneric.getElement1());
		System.out.println(genericMethodsArgNoGeneric.getElement2());
		System.out.println(genericMethodsArgNoGeneric.getElemNoGeneric());
	}
}
