package models;

import java.util.Comparator;
import java.util.List;
import excepciones.ColaExceededSizeException;
import excepciones.ElementBlockedException;
import excepciones.LlevateTuNullDeAquiException;

public class ColaDelCastigo<E extends Razas> {

	/**
	 * Metodo para insertar Razas en la coleccion. Verifica si hay menos de 10
	 * elementos, en caso de intentar meter 11 aparece el mensaje de error. Tambien
	 * verifica que los parametros que se inserten no sean nulos, en cuyo caso
	 * tambien muestra mensaje de error. Tambien ordena la coleccion (quizas hace
	 * demasiadas cosas para un solo metodo)
	 * 
	 * @param lista  Coleccion de tipos de Razas
	 * @param raza   Nombre de la raza
	 * @param nombre Nombre del personaje
	 * @param edad   Edad del personaje
	 * @return nueva raza en la coleccion
	 * @throws ColaExceededSizeException
	 */
	public boolean AnyadirRaza(List<Razas> lista, String raza, String nombre, int edad)
			throws ColaExceededSizeException {
		if (lista.size() <= 9 && raza != null && nombre != null) {
			if (raza == null || nombre == null) {
				throw new LlevateTuNullDeAquiException("No se pueden insertar valores nulos!!!");
			}
			Comparator<Razas> groupByComparator = Comparator.comparing(Razas::getTipoRaza)
					.thenComparing(Razas::getNombreRelevante);
			lista.sort(groupByComparator);
			return lista.add(new Razas(raza, nombre, edad));
		} else {
			Comparator<Razas> groupByComparator = Comparator.comparing(Razas::getTipoRaza)
					.thenComparing(Razas::getNombreRelevante);
			lista.sort(groupByComparator);
			throw new ColaExceededSizeException("No se pueden insertar mas de 10 elementos!!");
		}
	}

	/**
	 * Si el tamanyo de la coleccion es 10 (el limite maximo) salta una excepcion de
	 * que no se puede eliminar nada. Si es menor, vacia la coleccion
	 * 
	 * @param lista Nombre de la coleccion
	 * @throws ElementBlockedException
	 */
	public void Clear(List<Razas> lista) throws ElementBlockedException {
		if (lista.size() == 10) {
			throw new ElementBlockedException("La coleccion ya esta llena, no se puede eliminar nada");
		} else if(lista.size() > 0 || lista.size() < 10){
			lista.clear();
		}
	}
}