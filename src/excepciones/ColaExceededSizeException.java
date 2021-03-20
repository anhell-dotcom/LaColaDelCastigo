package excepciones;

public class ColaExceededSizeException extends Exception {

	// Salta este error si se intenta insertar mas elementos de los permitidos.
	// Por convenio estas excepciones personalizadas deben de acabar en "Exception"
	public ColaExceededSizeException(String msj_error) {
		super(msj_error);
	}
	
	public ColaExceededSizeException() {
		
	}
}