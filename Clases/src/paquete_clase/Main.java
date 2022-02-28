package paquete_clase;

public class Main {

	public static void main(String[] args) {

		Empleado limpiador = new Empleado("Pedro", "Jiménez", 17000, 28);
//		GestionDeEmpleados gest = new GestionDeEmpleados();
		
		System.out.println(limpiador.salario);
		
		GestionDeEmpleados.subirSalario( limpiador, 150.23);

		System.out.println(limpiador.salario);
		
	}

}
