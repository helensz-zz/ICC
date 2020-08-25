/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.agenda;

import java.io.*;
import icc.agenda.RegistroAgenda;
import icc.agenda.BuscadorPorTelefono;
import icc.util.*;

/**
 * Clase para representar una Base de Datos de agenda.
 *
 * Una base de datos debe ser capaz de obtener registros, y campos
 * de sus registros, y debe ser capaz de reconocer si un campo o registro
 * solicitado no existe, y dar una respuesta coherente.
 */
public class BaseDeDatosAgenda {

	/**
	 * Este objeto llevará el control de los registros guardados en la lista.
	 */
	private ManejadorDeLista tabla;

	/**
	 * Constructor.
	 * @param datos Una cadena con el formato requerido por esta base
	 *        con los registros de nombres, direcciones y teléfonos.
	 * @param tam_nombre
	 */

	public BaseDeDatosAgenda(){
		this.tabla = new ManejadorDeLista();
	}

	public BaseDeDatosAgenda(String datos,
				 int tam_nombre,
				 int tam_direccion,
				 int tam_telefono) {
		int tam_registro = tam_nombre + tam_direccion + tam_telefono;

		this.tabla = new ManejadorDeLista();
		// TODO: Crear el ManejadorDeLista para almacenar ahí los registros.

		int index = 0;

		while (index < datos.length()) {
			String tmpReg = datos.substring(index, index + tam_registro);

			String nombre = tmpReg.substring(0, tam_nombre).trim();
			String direccion = tmpReg.substring(tam_nombre, tam_nombre + tam_direccion).trim();
			int telefono = Integer
											.parseInt(
												tmpReg.substring(tam_nombre + tam_direccion, tmpReg.length()).trim()
											);

			RegistroAgenda r = new RegistroAgenda(nombre, direccion, telefono);

			this.tabla.agrega(r);

			index += tam_registro;
		}
	}

	public void inserta(RegistroAgenda rg){
			tabla.agrega(rg);
	}

	public void guardaAgenda(String nombreArchivo){
		try (PrintStream nuevaAg = new PrintStream(nombreArchivo)) {
			GuardaRegistro gr = new GuardaRegistro(nuevaAg);
			this.tabla.encuentra(gr);
		} catch(FileNotFoundException fnfe) {
			System.err.println("No se encontró el archivo " + nombreArchivo + " y no pudo ser creado.");
		} catch(SecurityException se){
			System.err.println("No se tiene permiso de escribir en el archivo.");
		}
	}

	public void doDataBase(String nombreArchivo) {
			try {
				PrintStream nuevaAg = new PrintStream(nombreArchivo);
			} catch (FileNotFoundException e) {
				System.out.println("No se pudo crear el archivo.");
			}

	}

	public RegistroAgenda dameRegistroPorNombre (String nombre) {
		// TODO: Usa BuscadorPorNombre y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
		BuscadorPorNombre b = new BuscadorPorNombre(nombre);
		return this.tabla.encuentra(b);
	}

	public RegistroAgenda dameRegistroPorTelefono (int tel) {
		// TODO: Crea la clase BuscadorPorTelefono en forma similar a BuscadorPorNombre
		// Usa BuscadorPorTelefono y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
		BuscadorPorTelefono b = new BuscadorPorTelefono(tel);
		return this.tabla.encuentra(b);
	}

	public void imprimeTodo(){
			Lista aux = this.tabla.getCabeza();
			while (aux != null){
			System.out.println(aux.getRegistro().toString());
			aux = aux.getSiguiente();
		}
	}

	public void carga(String nombreArchivo) {
		try {
			BufferedReader mibuffer = new BufferedReader(new FileReader(nombreArchivo));
			String linea = "";
			while(linea!=null) {
				if(linea!=null)
					linea = mibuffer.readLine();
			}
		} catch (IOException e) {
			System.out.println("No se pudo cargar el archivo " + nombreArchivo);
		}
	}

}
