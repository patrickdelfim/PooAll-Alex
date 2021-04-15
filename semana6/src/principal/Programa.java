package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.*;
import util.UtilFormas;

public class Programa {

	public static void main(String[] args) {
		
	
		
		Circulo circulo = new Circulo( UtilFormas.ler());
		

		
		Quadrado quadrado = new Quadrado(UtilFormas.ler());
		
		List<Forma> formas = new ArrayList<>();
		
		formas.add(circulo);
		formas.add(quadrado);
		
		
		
	UtilFormas.imprimir(formas);
	UtilFormas.imprimir(circulo);
		

	}

}
