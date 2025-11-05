package Consolas;

import java.util.Scanner;

import Modelo.Parcial;
import java.util.*;

public class ConsolaParcial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Crea tu Ecuacion de segundo grado: ");
		System.out.print("Variable a (la que va pegada a la x^2): ");
		double a = sc.nextDouble();
		sc.nextLine();
		System.out.print("Variable b (la que va pegada a la x): ");
		double b = sc.nextDouble();
		sc.nextLine();
		System.out.print("Variable c (la que no va pegada a ninguna variable): ");
		double c = sc.nextDouble();
		sc.nextLine();
		sc.close();
		try {
			ArrayList<Double> valores = Parcial.CalcularRaices(a, b, c);
			if (valores.size() == 1) {
				System.out.println("La ecuacion de segundo grado tiene una sola raiz: ");
				System.out.println("x = " + valores.get(0));
			} else {
				System.out.println("La ecuacion de segundo grado tiene dos raices");
				System.out.println("x1 = " + valores.get(0));
				System.out.println("x2 = " + valores.get(1));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
