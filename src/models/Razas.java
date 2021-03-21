package models;

public class Razas{

	// Declaracion de atributos
	private String tipoRaza;
	private String nombreRelevante;
	private int edad;
	
	// Constructor
	public Razas(String tipoRaza, String nombreRelevante, int edad) {
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

	// El ToString
	@Override
	public String toString() {
		return "Razas [tipoRaza=" + tipoRaza + ", nombreRelevante=" + nombreRelevante + ", " + "edad=" + edad + "]";
	}
}