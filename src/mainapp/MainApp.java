package mainapp;

import java.util.PriorityQueue;
import java.util.Queue;
import models.Razas;

public class MainApp {
	// Debemos dise�ar una nueva estructura abstracta de datos que extienda los
	// comportamientos de una colecci�n ya existente. Estamos hablando de la famosa
	// ColaDelCastigo. A partir de la interfaz Queue se implementar� una nueva clase
	// gen�rica llamada ColaDelCastigo que reimplementar� todos los m�todos para
	// tener una cola ordenada. Dicha cola tendr� varias consideraciones adicionales
	// que se listar�n a continuaci�n:
	//XXXX 1. Solo tendr� un constructor que recibir� un
	//XXXX comparador y la cola estar� siempre ordenada por tal comparador
	// 2. La cola como mucho aceptar� 10 elementos. Si se intenta a�adir uno m�s
	// saltar� una
	// excepci�n del tipo ColaExceededSizeException que por supuesto deb�is
	// implementar.
	// 3. La cola no aceptar� nulls por lo que si se intenta a�adir un
	// null lanzar� una excepci�n que heredar� de NullPointerException llamada
	// LlevateTuNullDeAquiException.
	// 4. La cola permanecer� siempre ordenada, pase
	// lo que pase y haya el n�mero de elementos que haya.
	// 5. Una vez rellena, la
	// cola no podr� vaciarse JAM�S. De hecho lanzar� una excepci�n del tipo
	// ElementBlockedException que deb�is implementar. Reimplementad correctamente
	// el m�todo clear.
	// 6. El comparador para probar la colecci�n deber� ser lambda.
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
