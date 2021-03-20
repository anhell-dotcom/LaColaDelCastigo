package models;

import java.util.List;
import excepciones.ColaExceededSizeException;
import excepciones.LlevateTuNullDeAquiException;

public class ColaDelCastigo<E extends Razas> {

	/**
	 * Metodo para insertar Razas en la coleccion. Verifica si hay menos de 10
	 * elementos, en caso de intentar meter 11 aparece el mensaje de error. Tambien
	 * verifica que los parametros que se inserten no sean nulos, en cuyo caso
	 * tambien muestra mensaje de error
	 * 
	 * @param lista Coleccion de tipos de Razas
	 * @param raza       Nombre de la raza
	 * @param nombre     Nombre del personaje
	 * @param edad       Edad del personaje
	 * @return 		nueva raza en la coleccion
	 * @throws ColaExceededSizeException
	 */
	public boolean AnyadirRaza(List<Razas> lista, String raza, String nombre, int edad) throws ColaExceededSizeException {
		if (lista.size() <= 9 && raza != null && nombre != null) {
			if (raza == null || nombre == null) {
				throw new LlevateTuNullDeAquiException("No se pueden insertar valores nulos!!!");
			}
			return lista.add(new Razas(raza, nombre, edad));
		} else {
			throw new ColaExceededSizeException("No se pueden insertar mas de 10 elementos!!");
		}
	}
}
