package dev.darioaxel.exercise3;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		System.out.println("Write the name of the file/folder: ");
		Path path = Paths.get(console.nextLine());
		
		if(Files.exists(path)) {
			if (Files.isDirectory(path)) {
				System.out.println("Is a directory!");
			}
			else {
				System.out.println("Is a file!");
			}
		}
		else {
			System.out.println("Is a file!");
		}
		console.close();
	}

}
