package dev.darioaxel.exercise2;

import java.nio.file.Files;
import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;
import java.util.stream.*;


public class Exercise2 {
	/*
	 * Write a Java program to get specific files by extensions from a specified folder. 
	 */

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner consola = new Scanner(System.in);
		System.out.println("** Write the file name and the extension to filter: ");
		String filename = consola.next();
		String extension = consola.next();
		
		try(Stream<Path> filesFiltered = Files.walk(Paths.get(filename))){
			filesFiltered.filter(Files::isRegularFile)
			.filter(f-> f.toString().endsWith(extension))
			.forEach(System.out::println);
		}
	}
}
