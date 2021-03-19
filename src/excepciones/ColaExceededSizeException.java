package excepciones;

public class ColaExceededSizeException extends Exception {

	public ColaExceededSizeException(String texto) {
		super(texto);
	}
}