package mainapp;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import models.ColaDelCastigo;
import models.Razas;

public class MainApp {
	// Debemos dise�ar una nueva estructura abstracta de datos que extienda los
	// comportamientos de una colecci�n ya existente. Estamos hablando de la famosa
	// ColaDelCastigo. A partir de la interfaz Queue se implementar� una nueva clase
	// gen�rica llamada ColaDelCastigo que reimplementar� todos los m�todos para
	// tener una cola ordenada. Dicha cola tendr� varias consideraciones adicionales
	// que se listar�n a continuaci�n:
	// XXXX 1. Solo tendr� un constructor que recibir� un
	// XXXX comparador y la cola estar� siempre ordenada por tal comparador
	// XXXX 2. La cola como mucho aceptar� 10 elementos. Si se intenta a�adir uno
	// m�s
	// saltar� una
	// excepci�n del tipo ColaExceededSizeException que por supuesto deb�is
	// implementar.
	// XXXX 3. La cola no aceptar� nulls por lo que si se intenta a�adir un
	// null lanzar� una excepci�n que heredar� de NullPointerException llamada
	// LlevateTuNullDeAquiException.
	// 4. La cola permanecer� siempre ordenada, pase
	// lo que pase y haya el n�mero de elementos que haya.
	// 5. Una vez rellena, la
	// cola no podr� vaciarse JAM�S. De hecho lanzar� una excepci�n del tipo
	// ElementBlockedException que deb�is implementar. Reimplementad correctamente
	// el m�todo clear.
	// XXXX 6. El comparador para probar la colecci�n deber� ser lambda.

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
		
		// Verifica el tama�o de la coleccion
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