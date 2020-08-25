/* -*- jde -*- */
/* <RegistroAgenda.java> */
package icc.agenda;

import java.io.*;
import java.util.Scanner;

/**
 * Registro para una Agenda
 */
public class RegistroAgenda {

	// TODO: Declara aquí los atributos para almacenar
	// nombre, dirección y teléfono.
	private String nombre;
	private String direccion;
	private int telefono;
	private RegistroAgenda aa;
	private Scanner scanner;

	/**
	 * Constructor.
	 */
	 public RegistroAgenda(){
		 aa = new RegistroAgenda();
	 }
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

	public void escribe(PrintStream pst){
		String nombreArchivo = scanner.nextLine();
		try (PrintStream ps = new PrintStream(nombreArchivo)) {
			ps.print("Nombre: "+ aa.getNombre());
			ps.println("Dirección: " + aa.getDireccion());
			ps.println("Teléfono: " + aa.getTelefono());
			} catch(FileNotFoundException fnfe) {
			System.err.println("No se encontró el archivo " + nombreArchivo + " y no pudo ser creado.");
		} catch(SecurityException se){
			System.err.println("No se tiene permiso de escribir en el archivo.");
		}

	}
}

/**
 *En el BufferedReader tengo que usar un contador para que lea la línea deseada.
 */
