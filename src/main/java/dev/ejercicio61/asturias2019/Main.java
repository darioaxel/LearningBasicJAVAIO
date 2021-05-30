package dev.ejercicio61.asturias2019;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Combinaciones comb = new Combinaciones();
		List<Integer> valores = Arrays.asList(0,1,2);
		System.out.println(" conbinaciones de longitud 3 con 0, 1, 2: ");
		comb.calculaCaminosVariables(valores, new ArrayList<>(), 3);
	}
}

class Combinaciones {
	public Combinaciones() {
		
	}
	public void calculaCaminosVariables(List<Integer> valores, ArrayList<Integer> what, int longitud) {
		
		if( longitud == 0 ) {									
			System.out.print("[");										
			what.forEach(q -> System.out.print(q + ", "));
			System.out.print("] | ");
		} else {
			valores.forEach(p -> {	ArrayList<Integer> what2 = new ArrayList<Integer>();
									what.forEach(r -> what2.add(r));					
									what2.add(p);
									calculaCaminosVariables(valores, what2 , longitud-1);
									
								});
		}
		
	}
}
