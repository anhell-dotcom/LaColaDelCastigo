package comparables;

import java.util.Comparator;
import models.Razas;

/**
 * Comparador que ordena por edades
 */
public class ComparadorEdad implements Comparator<Razas>{
	public int compare(Razas r1, Razas r2) {
		if (r1.getEdad() < r2.getEdad())
			return 1;
		else if (r1.getEdad() > r2.getEdad())
			return -1;
		return 0;       
		
	}
}
