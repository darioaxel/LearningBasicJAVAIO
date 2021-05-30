package dev.darioaxel.exercise1;

import java.io.Console;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Exercise1 {
/*
 * Write a Java program to get a list of all file/directory names from the given.
 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Exercise 1: get a list of all file/directory names from the given.");
		 Scanner console = new Scanner(System.in);
		
		
		boolean tryagain = true;
		File f = null;
		while( tryagain == true ) {
			System.out.println("*** Please enter the full path to the file ***");			
			String line = console.nextLine();
			
			f = Paths.get(line).toFile();
			if (!f.exists()) {
				System.out.println("** Atention!! Seems that the path entered doesn't work. Try again? (Y/N) **");
				if(console.nextLine().compareToIgnoreCase("N") == 0) {
					console.close();
					System.exit(0);
				}
			}
			else {
				console.close();
				tryagain = false;
				line = null;
			}			
		}
		try (Stream<Path> files = Files.walk(f.toPath())) {
			files.forEach(System.out::println);
		}		
	}
}
