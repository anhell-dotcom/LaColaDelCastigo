package models;

// Estas son razas de la Tierra Media creadas por J.R.R. Tolkien para "El senyor de los anillos" 
// (algunas ya las toma prestadas de la mitologia nordica)
public class Razas implements Comparable<Razas> {

	// Declaracion de atributos
	private String tipoRaza;
	private String nombreRelevante;
	private int edad;

	// Constructor
	public Razas(String tipoRaza, String nombreRelevante, int edad) {
		super();
		this.tipoRaza = tipoRaza;
		this.nombreRelevante = nombreRelevante;
		this.edad = edad;
	}

	// setters y getters
	public String getTipoRaza() {
		return tipoRaza;
	}

	public void setTipoRaza(String tipoRaza) {
		this.tipoRaza = tipoRaza;
	}

	public String getNombreRelevante() {
		return nombreRelevante;
	}

	public void setNombreRelevante(String nombreRelevante) {
		this.nombreRelevante = nombreRelevante;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Razas r) {
		if (edad < r.getEdad()) {
			return 1;
		} else if (edad > r.getEdad()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Razas [tipoRaza=" + tipoRaza + ", nombreRelevante=" + nombreRelevante + ", " 
				+ "edad=" + edad + "]";
	}

}