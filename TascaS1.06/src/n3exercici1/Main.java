package n3exercici1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*- Exercici 1
	Per fer aquest exercici necessites una interf�cie anomenada Telefon i tres classes: 
	Smartphone, Generica i la Principal.
	
	La interf�cie Telefon ha de tenir un m�tode anomenat trucar(). La classe Smartphone ha d�implementar Telefon,
	i a m�s del m�tode trucar(), tamb� ha de tenir el m�tode ferFotos(). 

	La classe Generica ha de tenir dos m�todes gen�rics, el primer ha de rebre un tipus d�argument limitat 
	per la interf�cie Telefon i el segon ha de rebre un argument limitat per la classe Smartphone. 
	Des d�aquests dos m�todes crida els m�todes pertinents de Telefon i Smartphone. En el main() de la classe 
	Principal, passa un objecte de la classe Smartphone als dos m�todes gen�rics de la classe Generica.
	
	El m�tode limitat per la interf�cie Telefon, de la classe Generica, pot cridar al m�tode ferFotos()?
		 */
		
		Smartphone smartphone = new Smartphone();
		
		Generica<Smartphone> generica = new Generica<Smartphone>();
		
		generica.primerMetode(smartphone);
		generica.segonMetode(smartphone);
	}

}
