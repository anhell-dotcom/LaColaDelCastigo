package excepciones;

public class LlevateTuNullDeAquiException extends NullPointerException{
	
	// constructor vacio
	public LlevateTuNullDeAquiException() {
	}
	
	// contructor con mensaje de error
	public LlevateTuNullDeAquiException(String msj_error) {
		super(msj_error);
	}
}