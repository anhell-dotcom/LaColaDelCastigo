package mainapp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import comparables.ComparadorEdad;
import excepciones.ElementBlockedException;
import models.ColaDelCastigo;
import models.Razas;

public class MainApp {

	public static void main(String[] args) throws ElementBlockedException {

		ColaDelCastigo<Razas> colita = new ColaDelCastigo<Razas>();

		List<Razas> lista = new ArrayList<Razas>();

		// Estas son razas de la Tierra Media creadas por J.R.R. Tolkien en el "El
		// senyor de los anillos"
		// (algunas las toma prestadas de la mitologia nordica). Las edades estan
		// puestas a ojo
		Razas r1 = new Razas("Maiar", "Gandalf", 997);
		Razas r2 = new Razas("Elfo Sindar", "Legolas", 234);
		Razas r3 = new Razas("MedioElfo", "Elrond", 834);
		Razas r4 = new Razas("Enano", "Gimli", 134);
		Razas r5 = new Razas("Hobbit", "Frodo", 34);
		Razas r6 = new Razas("Hobbit", "Gollum", 55);
		Razas r7 = new Razas("Humano", "Aragorn II", 31);
		Razas r8 = new Razas("Maiar", "Sauron", 934);
		Razas r9 = new Razas("Desconocido", "Tom Bombadil", 6639);

		// insercion de objeto para pruebas
		// try {
		// colita.AnyadirRaza(lista, "Hobbit", "Samsagaz", 0);
		// } catch (ColaExceededSizeException e) {
		// e.printStackTrace();
		// }

		// insercion de otro objeto para pruebas
		// try {
		// colita.AnyadirRaza(lista, "MedioElfo", "Arwen", 300);
		// } catch (ColaExceededSizeException e) {
		// e.printStackTrace();

		lista.add(r1);
		lista.add(r2);
		lista.add(r3);
		lista.add(r4);
		lista.add(r5);
		lista.add(r6);
		lista.add(r7);
		lista.add(r8);
		lista.add(r9);

		// ordena la coleccion por edad de mayor a menor
		Collections.sort(lista, new ComparadorEdad());

		// Verifica el tamaño de la coleccion
		System.out.println("\nEl tamanyo de la lista es : " + lista.size());
		System.out.println();

		// probando el metodo Clear
		// colita.Clear(lista);

		// Comparador Lambda para probar la coleccion. Ordena primero por Tipo de raza y
		// luego por nombre
		Comparator<Razas> groupByComparator = Comparator.comparing(Razas::getTipoRaza)
				.thenComparing(Razas::getNombreRelevante);
		lista.sort(groupByComparator);

		// Muestra los elementos de la coleccion
		lista.forEach(System.out::println);
	}
}
