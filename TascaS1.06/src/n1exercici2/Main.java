package n1exercici2;

public class Main {

	public static void main(String[] args) {
		
		/*- Exercici 2
	Crea una classe anomenada Persona amb els atributs nom, cognom i edat. 
	Despr�s crea una classe anomenada GenericMethods amb un m�tode gen�ric que accepti 
	tres arguments de tipus gen�ric. Aquest m�tode nom�s ha d�imprimir per pantalla els 
	arguments que ha rebut. Al main() de la classe principal, crida el m�tode gen�ric 
	amb diferents tipus de par�metres.

	Exemple: un objecte de la classe Persona, un String i un tipus primitiu.

	D�aquesta manera has comprovat que se li pot passar qualsevol tipus de par�metre i en qualsevol ordre.
		 */
		
		GenericMethods genericMethods = new GenericMethods((new Persona("Fernando", "Gonzalez", 30)), "Tipus String",37);
		
		System.out.println(genericMethods.getElement1());
		System.out.println(genericMethods.getElement2());
		System.out.println(genericMethods.getElement3());
	}

	

}
