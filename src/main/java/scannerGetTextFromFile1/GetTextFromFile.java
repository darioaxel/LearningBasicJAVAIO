package scannerGetTextFromFile1;

import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class GetTextFromFile {
	public static void main(String[] args) throws IOException {
		// Recoger el nombre del fichero (path completo) desde comandos
		Scanner console = new Scanner(System.in);
		System.out.println("Introduzca el nombre del archivo y seguido la palabra o palabras a contar");
		List<String> archivoypalabras = Arrays.asList(console.nextLine().split(" "));
		Path archivo = null;
		if (archivoypalabras.size() == 1) {
			archivo = Paths.get(System.getProperty("user.dir"), archivoypalabras.get(0));
		}
				
		// Leer el fichero
		Scanner fichero = new Scanner(archivo);
		fichero.useDelimiter(" ");
		Stream<String> datos = fichero.tokens();
		//datos.forEach(System.out::println);
		// Contar: palabras totales, palabras distintas, 
		Set<String> palabrasDistintas = datos.collect(Collectors.toSet());
		for(String p: palabrasDistintas) {
			System.out.print(p + " ");
		}
		System.out.println("palabras distintas " + palabrasDistintas.size());
	}
}
