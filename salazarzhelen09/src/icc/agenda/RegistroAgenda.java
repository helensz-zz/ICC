/* -*- jde -*- */
/* <RegistroAgenda.java> */

package icc.agenda;

/**
 * Registro para una Agenda
 */
public class RegistroAgenda {

	// TODO: Declara aquí los atributos para almacenar
	// nombre, dirección y teléfono.
	private String nombre;
	private String direccion;
	private int telefono;

	/**
	 * Constructor.
	 */
	 public RegistroAgenda(String nombre, String direccion, int telefono){
		 this.nombre = nombre;
		 this.direccion = direccion;
		 this.telefono = telefono;
	 }
	/**
	 * Agrega los getters necesarios para leer la información en el registro.
	 */
	 public String getNombre(){
		 return this.nombre;
	 }

	 public String getDireccion(){
		 return this.direccion;
	 }

	 public int getTelefono(){
		 return this.telefono;
	 }

	/**
	 * Agrega los setters que permitan actualizar los datos de tu contacto.
	 */
	 public void setNombre(String n){
		 this.nombre = n;
	 }

	 public void setDireccion(String d){
		 this.direccion = d;
	 }

	 public void setTelefono(int t){
		 this.telefono = t;
	 }

	/**
	 * Devuelve una cadena con los datos en el registro en un formato agradable.
	 */
	public String toString() {
		return this.nombre + " | " + this.direccion + " | " + this.telefono;
	}
}
