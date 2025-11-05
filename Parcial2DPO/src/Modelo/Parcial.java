package Modelo;
import java.util.*;

public class Parcial {
	public static ArrayList<Double> CalcularRaices(double a, double b, double c) throws Exception {
		ArrayList<Double> res = new ArrayList<Double>();
		if (a == 0.0) {
			if (b == 0.0) {
				throw new Exception("Indefinido, no hay variable x");
			} else {
				res.add(-c/b);
			}
		} else {
			if (Math.pow(b, 2) - 4*a*c < 0) {
				throw new Exception("No es posible, tiene raiz Compleja");
			} else if (Math.pow(b, 2) - 4*a*c == 0){
				res.add(-b/(2*a));
			} else {
				double x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
				double x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c))/2*a;
				res.add(x1);
				res.add(x2);
			}
		}
		return res;
	}
}
