package mainapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import models.ColaDelCastigo;
import models.Razas;

public class MainApp {
	// Debemos diseñar una nueva estructura abstracta de datos que extienda los
	// comportamientos de una colección ya existente. Estamos hablando de la famosa
	// ColaDelCastigo. A partir de la interfaz Queue se implementará una nueva clase
	// genérica llamada ColaDelCastigo que reimplementará todos los métodos para
	// tener una cola ordenada. Dicha cola tendrá varias consideraciones adicionales
	// que se listarán a continuación:
	// XXXX 1. Solo tendrá un constructor que recibirá un
	// XXXX comparador y la cola estará siempre ordenada por tal comparador
	// XXXX 2. La cola como mucho aceptará 10 elementos. Si se intenta añadir uno
	// más
	// saltará una
	// excepción del tipo ColaExceededSizeException que por supuesto debéis
	// implementar.
	// XXXX 3. La cola no aceptará nulls por lo que si se intenta añadir un
	// null lanzará una excepción que heredará de NullPointerException llamada
	// LlevateTuNullDeAquiException.
	// 4. La cola permanecerá siempre ordenada, pase
	// lo que pase y haya el número de elementos que haya.
	// 5. Una vez rellena, la
	// cola no podrá vaciarse JAMÁS. De hecho lanzará una excepción del tipo
	// ElementBlockedException que debéis implementar. Reimplementad correctamente
	// el método clear.
	// XXXX 6. El comparador para probar la colección deberá ser lambda.

	public static void main(String[] args) {

		ColaDelCastigo<Razas> colita = new ColaDelCastigo<Razas>();

		List<Razas> lista = new ArrayList<Razas>();

		// Estas son razas de la Tierra Media creadas por J.R.R. Tolkien para "El senyor de los anillos" 
		// (algunas las toma prestadas de la mitologia nordica). Las edades estan puestas a ojo
		Razas r1 = new Razas("Maiar", "Gandalf", 997);
		Razas r2 = new Razas("Elfo Sindar", "Legolas", 234);
		Razas r3 = new Razas("MedioElfo", "Elrond", 834);
		Razas r4 = new Razas("Enano", "Gimli", 134);
		Razas r5 = new Razas("Hobbit", "Frodo", 34);
		Razas r6 = new Razas("Hobbit", "Gollum", 55);
		Razas r7 = new Razas("Humano", "Aragorn II", 31);
		Razas r8 = new Razas("Maiar", "Sauron", 934);
		Razas r9 = new Razas("Desconocido", "Tom Bombadil", 6639);

		lista.add(r1);
		lista.add(r2);
		lista.add(r3);
		lista.add(r4);
		lista.add(r5);
		lista.add(r6);
		lista.add(r7);
		lista.add(r8);
		lista.add(r9);

		// insercion de objeto para pruebas
		//try {
		//	colita.AnyadirRaza(lista, "Hobbit", "Samsagaz", 0);
		//} catch (ColaExceededSizeException e) {
		//	e.printStackTrace();
		//}
		
		// insercion de objeto para pruebas
		//try {
		//	colita.AnyadirRaza(lista, "MedioElfo", "Arwen", 300);
		//} catch (ColaExceededSizeException e) {
		//	e.printStackTrace();
		//}
		
		// Verifica el tamaño de la coleccion
		System.out.println("\nEl tamanyo de la lista es : " + lista.size());
		System.out.println();
		
		// Comparador Lambda para probar la coleccion. Ordena primero por Tipo de raza y
		// luego por nombre
		Comparator<Razas> groupByComparator = Comparator.comparing(Razas::getTipoRaza)
				.thenComparing(Razas::getNombreRelevante);
		lista.sort(groupByComparator);

		// Muestra los elementos de la lista
		for (Razas razas : lista) {
			System.out.println(razas);

		}
	}
}