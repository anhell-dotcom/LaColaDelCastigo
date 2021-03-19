package mainapp;

import java.util.PriorityQueue;
import java.util.Queue;
import models.Razas;

public class MainApp {
	// Debemos diseñar una nueva estructura abstracta de datos que extienda los
	// comportamientos de una colección ya existente. Estamos hablando de la famosa
	// ColaDelCastigo. A partir de la interfaz Queue se implementará una nueva clase
	// genérica llamada ColaDelCastigo que reimplementará todos los métodos para
	// tener una cola ordenada. Dicha cola tendrá varias consideraciones adicionales
	// que se listarán a continuación:
	//XXXX 1. Solo tendrá un constructor que recibirá un
	//XXXX comparador y la cola estará siempre ordenada por tal comparador
	// 2. La cola como mucho aceptará 10 elementos. Si se intenta añadir uno más
	// saltará una
	// excepción del tipo ColaExceededSizeException que por supuesto debéis
	// implementar.
	// 3. La cola no aceptará nulls por lo que si se intenta añadir un
	// null lanzará una excepción que heredará de NullPointerException llamada
	// LlevateTuNullDeAquiException.
	// 4. La cola permanecerá siempre ordenada, pase
	// lo que pase y haya el número de elementos que haya.
	// 5. Una vez rellena, la
	// cola no podrá vaciarse JAMÁS. De hecho lanzará una excepción del tipo
	// ElementBlockedException que debéis implementar. Reimplementad correctamente
	// el método clear.
	// 6. El comparador para probar la colección deberá ser lambda.
	public static void main(String[] args) {
		
		Queue<Razas> cola = new PriorityQueue<Razas>();
		
		Razas Gandalf = new Razas("Maiar", "Gandalf", 634);
		Razas Legolas = new Razas("Elfo Sindar", "Legolas", 434);
		Razas Elrond = new Razas("Medio-Elfo", "Elrond", 434);
		Razas Gimli = new Razas("Enano", "Gimli", 434);
		Razas Frodo = new Razas("Hobbit", "Frodo", 434);
		Razas Gollum = new Razas("Hobbit", "Gollum", 434);
		Razas Aragorn = new Razas("Humano", "Aragorn", 434);
		Razas Sauron = new Razas("Maiar", "Sauron", 434);
		Razas Tom_Bombadil = new Razas("Maiar", "Tom Bombadil", 434);
		
		cola.add(Gandalf);
		cola.add(Legolas);
		cola.add(Elrond);
		cola.add(Gimli);
		cola.add(Frodo);
		cola.add(Gollum);
		cola.add(Aragorn);
		cola.add(Sauron);
		cola.add(Tom_Bombadil);
		
	}

}
