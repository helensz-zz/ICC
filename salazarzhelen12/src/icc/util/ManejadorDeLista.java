/* -*- jde -*- */
/* <ManejadorDeLista.java> */

package icc.util;
import icc.maquina.*;
import icc.util.*;

/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
 */
public class ManejadorDeLista {

	/**
	 * Primer elemento de la lista.
	 */
	private Lista cabeza = null;

	/**
	 * Número de elementos en la lista.
	 */
	private int longitud = 0;

	/**
	 * Agrega un registro agenda al final de la lista.
	 */
	public void agrega(Object elemento) {
		// Crea el nuevo elemento y lo cuenta.
		Lista nuevo = new Lista(elemento);
		longitud++;
		// Si la lista está vacía añade al primer elemento y termina.
		if (cabeza == null) {
			cabeza = nuevo;
			return;
		}
		// Si no, hay que recorrer la lista para formar al nuevo
		// elemento detrás del último.
		Lista anterior = cabeza;
		while(anterior.getSiguiente() != null) {
			anterior = anterior.getSiguiente();
		}
		anterior.setSiguiente(nuevo);
	}

	public void regresa(Object elemento){
		Lista nuevo = new Lista(elemento);
		longitud++;
		nuevo.setSiguiente(cabeza);
		cabeza = nuevo;
	}

	/**
	 * Devuelve el número de elementos en esta lista.
	 */
	public int longitud() {
		return longitud;
	}

	/**
	 * Por ahora utilizaremos este método para poder
	 * programar la búsqueda en la base de datos.
	 */

	 public Lista getCabeza(){
		 return cabeza;
	 }

	 public void eliminaCabeza(){
		 Lista copia = cabeza;
		 cabeza = cabeza.getSiguiente();
		 longitud--;
	 }

	 public void imprime(){
		 Lista aux = cabeza;
		 while (aux != null){
			 System.out.println(aux.getElemento());
			 aux = aux.getSiguiente();
		 }
	 }

}
