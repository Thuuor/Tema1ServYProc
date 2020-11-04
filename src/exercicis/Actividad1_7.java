package exercicis;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

public class Actividad1_7 {

	public static void main(String[] args) throws IOException {

		File directorio = new File("./bin");
		File entrada = new File("entrada.txt");
		File salida = new File("salida.txt");
		File salidaError = new File("error.txt");

		ProcessBuilder pb = new ProcessBuilder("java", "Actividad1_6");

		pb.directory(directorio);
		pb.redirectInput(ProcessBuilder.Redirect.from(entrada));
		pb.redirectOutput(ProcessBuilder.Redirect.to(salida));
		pb.redirectError(ProcessBuilder.Redirect.to(salidaError));
		
		// se ejecuta el proceso
		Process p = pb.start();

		// escritura -- envia entrada
		OutputStream os = p.getOutputStream();
		os.write("Hola Manuel\n".getBytes());
		os.flush();
		
		
	}
	
}
