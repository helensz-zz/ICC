package icc.agenda;

import icc.util.*;

public class BuscadorPorTelefono implements Buscador {

	/* telefono que se busca */
	private int telefonoBuscado;

	/**
	 * Construye al buscador con el nombre que
	 * va a buscar.
	 */
	public BuscadorPorTelefono(int telefono) {
		this.telefonoBuscado = telefono;
	}

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 * @param reg Registro que se desea saber si corresponde
	 *        al nombre buscado.
	 * @returns si <code>reg</code> tiene ese nombre.
	 */
	public boolean esEste(RegistroAgenda reg) {
		 return reg.getTelefono() == this.telefonoBuscado;
	}

}
