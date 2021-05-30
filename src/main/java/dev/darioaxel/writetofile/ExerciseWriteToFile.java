package dev.darioaxel.writetofile;

import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class ExerciseWriteToFile {
	public static void main(String[] args) throws IOException {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Enter the path to the file or the name is you wanna create a new one: ");
		Path path = Paths.get(console.nextLine());
		Path newFile=null;
		
		if(!Files.exists(path)) {
			System.out.println("File do not exit, let's create it!!");
			newFile =Paths.get(System.getProperty("user.dir"), path.toString());
			Files.createFile(newFile);
			System.out.println("File created succesfully!!: " + newFile.toString());
		}
		
		System.out.println("Write to the file a line or lines. To end write '\'q");
		String linea = console.nextLine();
		
		Files.write(newFile, linea.getBytes());	
	
	}
}
