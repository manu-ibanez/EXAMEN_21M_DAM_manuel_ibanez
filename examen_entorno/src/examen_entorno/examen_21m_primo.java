package examen_entorno;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class examen_21m_primo {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		System.out.println("Buenos días Ceinmark, soy Marta Gómez" + "\n"
				+ "Introduce un número para averiguar si es primo o no:");
		int numIntroducido = Integer.parseInt(ent.nextLine());

		
		System.out.println("El número no es primo \n"
				+ "Los divisores del número son: \n"
				+ "Ejemplo: El 4 no es primo\n"
				+ "	ejemplo: Los divisores del 4 son: 1,2, y 4");
		
		
		
	}
}
