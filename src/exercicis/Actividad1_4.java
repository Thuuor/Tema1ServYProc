package exercicis;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Actividad1_4 {

	public static void main(String[] args) throws IOException{
		
		File directorio = new File("./bin");
		ProcessBuilder pb = new ProcessBuilder("java", "LeerNombre", "Patrick");
		pb.directory(directorio);
		
		System.out.printf("Directorio de trabajo: %s%n",pb.directory());
		
		Process p = pb.start();
		
		try {
			InputStream is = p.getInputStream();
			int c;
			while ((c = is.read()) != -1)
				System.out.print((char) c);
			is.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			InputStream er = p.getErrorStream();					
			BufferedReader brer = new BufferedReader(new InputStreamReader(er));
			String liner = null;
			while ((liner = brer.readLine()) != null)
				System.out.println("ERROR >" + liner);
		} catch (IOException ioe) {
				ioe.printStackTrace();
		}
	}

}
