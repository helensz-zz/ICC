package icc.clases;

/**
 * Clase para ejemplificar el uso de la clase <code>String</code>.
 * @author blackzafiro
 */
public class Mosca {

	/**
     * Atributo con la letra original de la canción.
	 * Como es la misma para todas las moscas, la declaramos "static".
	 * Como no queremos que ninguna mosca la modifique, la declaramos "final".
	 * Como nadie la puede modificar, y queremos leer la letra, podemos hacer
	 * que esta letra sea pública.
     */
	public static final String original = "Una mosca parada en la pared, \n" +
                                    "en la pared, en la pared. \n" +
                                    "Una mosca, una mosca, \n" +
                                    "una mosca parada en la pared";

	/**
	 * Cada mosca recordará con qué vocal debe cantar la canción.
	 */
	private char vocal;

	/**
	 * Por defecto, cuando una mosca sea creada, cambiará las vocales por la
	 * letra 'a'.
	 */
	public Mosca() {
		vocal = 'a';
	}

	/**
	 * Le dice a esta mosca con qué vocal le toca cantar la canción.
	 * Este método no devuelve nada, sú unico trabajo es modificar el estado
	 * de esta mosca.
	 * @param vocal La vocal con la cual serán reemplazadas todas las vocales
	 *              de la canción original.
	 */
	public void setVocal(char vocal) {
		this.vocal = vocal;
	}

	/**
	 * Método con el que la mosca canta la canción.
	 * Debe devolver la letra modificada con la vocal que tiene asignada
	 * actualmente.
	 */
	public String canta() {
				String x = original.toLowerCase();
				x = x.replace('a', vocal);
				x = x.replace('e', vocal);
				x = x.replace('i', vocal);
				x = x.replace('o', vocal);
				x = x.replace('u', vocal);

		return x.substring(0,1).toUpperCase() + x.substring(1,58) + x.substring(58,59).toUpperCase() + x.substring(59);
	}

}
