
public class Principal {

	public static void main(String[] args) {
		System.out.println("Nombre: Abel Josue Mamani Apaza");
		System.out.println("Ci: 9970617");
		System.out.println("Materia: Inf-121 par.B");
		System.out.println("Clase: Repaso POO");
		
		Estadistica est = new Estadistica(5);
		est.llenar();
		est.mostrar();
		
		double promedio = est.media();
		System.out.println("media es: " + promedio);
		
		double desv = est.desv();
		System.out.println("\ndesviacion estandar: " + desv);
	}
}
