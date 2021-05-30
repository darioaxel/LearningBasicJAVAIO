package dev.darioaxel.scannerGetValueConsole;

import java.io.IOException;
import java.util.Scanner;

public class ExerciseScanner {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Exercise 1: get a list of all file/directory names from the given.");
		Scanner console = new Scanner(System.in);
		
		boolean finished = true;
		while(finished == true) {
			System.out.println("Introduzca una palabra");
			String palabra = console.nextLine();
			if (palabra.equalsIgnoreCase("end")) {
				finished = false;
			}
			else {
				System.out.println(" * " + palabra);
			}
		}
		 
	}
}
