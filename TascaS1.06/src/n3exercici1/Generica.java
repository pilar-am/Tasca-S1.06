package n3exercici1;

public class Generica <E extends Smartphone & Telefon>{

	public <T extends Telefon> void primerMetode(E p) {
		System.out.println("Entrant al primer m�tode");
		
		p.trucar();
		p.ferFotos();
	}
	
	public <T extends Smartphone> void segonMetode(E p) {
		System.out.println("Entrant al segon m�tode");
		
		p.trucar();
		p.ferFotos();
	}	
}
