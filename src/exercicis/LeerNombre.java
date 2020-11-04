package exercicis;

public class LeerNombre {

	public static void main(String[] args) {
		try {
			String nombre = args[0];
			System.out.println(nombre);
			System.exit(1);
		} catch (Exception e) {
			System.exit(-1);
		}
		
		
		
	}

}
