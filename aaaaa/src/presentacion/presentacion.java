package presentacion;
import Logica.Hombre;
import Logica.Mujer;
import Logica.Persona;

public class presentacion {
	public static void main(String[] args) {
		Persona T;
		T = new Mujer(60, 165, 25);
		System.out.println("TMB para mujer: " + T.calcularTMB());
		T = new Hombre(70, 175, 30);
		System.out.println("TMB para hombre: " + T.calcularTMB());
	}
}
