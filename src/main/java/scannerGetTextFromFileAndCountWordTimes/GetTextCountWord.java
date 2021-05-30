package scannerGetTextFromFileAndCountWordTimes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import java.util.stream.Collectors;


import java.nio.file.Path;
public class GetTextCountWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner fileReader = new Scanner(System.in);
		Path pathToFile = Paths.get(System.getProperty("user.dir"), "readingTimeAWordAppears.txt");
		
		if(Files.exists(pathToFile)) {
			try {
				Stream<String> fileContent = Files.readAllLines(pathToFile).stream();
				//var times =
						fileContent.forEach(l -> {
							System.out.println(l.trim().split("\\s").length);
							Arrays.asList(l.trim().split("\\s")).forEach(p -> { 
																	if (Pattern.compile("jamón",Pattern.CASE_INSENSITIVE).matcher(p).matches()) 
																		System.out.println("Encontrado: " + p);
																	}); 
							Arrays.asList(l.trim().split("\\s")).forEach(System.out::print);
							});
								//.stream().filter(p -> !Pattern.compile("jamón",Pattern.CASE_INSENSITIVE).matcher(p).matches()))
						//.forEach(System.out::println);
				//System.out.println("Times " +times);
			//	fileContent.filter(p -> !Pattern.compile("jamón",Pattern.CASE_INSENSITIVE).matcher(p).matches())
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.out.println("The file does not exits! ");
		}
	//	Files.wr
	}

}
