/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package sistemasolar;

/**
 * Clase que describe astros que giran alrededor de otro.
 * @author blackzafiro
 */

public class Satelite extends Astro {

	// Escala para dibujar a los planetas
	private static final double ESCALA_RADIO = 10.0;
	private static final double ESCALA_ORBITA = 400.0;
	private static final double ESCALA_ORBITA_SATELITE = ESCALA_RADIO * 2;
	private static final double ESCALA_TIEMPO = 15.0;

	/**
	 * Datos de cada planeta y satélite.
	 * Deben ser ficticios, pues de otro modo la simulación no cabe en pantalla.
	 */
	public enum DatosSatelite {
		MERCURIO(0.382, 0.1800, 0.18000, 0.3),
		VENUS(0.948, 0.33517, 0.33517, 0.74),
		TIERRA(1.0, 0.46551, 0.46551, 1.1),
		LUNA(0.273, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.0739),
		MARTE(0.5319, 0.60758, 0.60758, 1.107),
		JUPITER(3.1226, 0.790, 0.790, 2.0),
		SATURNO(2.9449, 1.0, 1.0, 2.4),
		URANO(1.5073, 1.200, 1.200, 3.0),
		NEPTUNO(1.400, 1.350, 1.350, 4.0),
		PLUTON(.200, 1.450, 1.450, 3.220),
		SATELITE1(0.17, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, 0.16),
		SATELITE2(0.20, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, 0.26),
		SATELITE3(0.26, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, 0.36),
		SATELITE4(0.32, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, 0.45),
		SATELITE5(0.102, (ESCALA_ORBITA_SATELITE * 0.00257)/1.05, (ESCALA_ORBITA_SATELITE * 0.00257)/1.05, 0.20),
		SATELITE6(0.20, (ESCALA_ORBITA_SATELITE * 0.00257)/1.05, (ESCALA_ORBITA_SATELITE * 0.00257)/1.05, 0.25),
		SATELITE7(0.102, (ESCALA_ORBITA_SATELITE * 0.00257)/1.05, (ESCALA_ORBITA_SATELITE * 0.00257)/1.05, 0.45),
		SATELITE8(0.099, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, 0.15),
		SATELITE9(0.102, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, 0.25),
		SATELITE10(0.107, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, (ESCALA_ORBITA_SATELITE * 0.00257)/0.5, 0.35);;

		private final double diametroEcuatorial;
		private final double semiejeMayor;
		private final double semiejeMenor;
		private final double periodoOrbital;


		DatosSatelite(double diametroEcuatorial,
			      double semiejeMayor, double semiejeMenor,
			      double periodoOrbital) {
			this.diametroEcuatorial = diametroEcuatorial;
			this.semiejeMayor = semiejeMayor;
			this.semiejeMenor = semiejeMenor;
			this.periodoOrbital = periodoOrbital;
		}
	}

	/// Inician atributos

	private final DatosSatelite datos;
	private OrbitaTransition orbita;
	private Astro foco;


	/// Inician métodos

	/**
	 * Astro alrededor del cual gira este satélite.
	 * @return astro alrededor del cual girar este satélite.
	 */
	public Astro getFoco() {
		return foco;
	}

	/**
	 * Crea la órbita de este planea y lo pone a girar alrededor del foco.
	 */
	private void creaOrbita(Astro foco) {
		foco.getNodo().getChildren().add(this.nodo);
		this.foco = foco;

		orbita = new OrbitaTransition(this,
					      datos.semiejeMayor * ESCALA_ORBITA,
					      datos.semiejeMenor * ESCALA_ORBITA,
					      datos.periodoOrbital * ESCALA_TIEMPO
		);
		orbita.play();
	}

	private void creaOrbita(Astro foco, boolean pluton) {
		foco.getNodo().getChildren().add(this.nodo);
		this.foco = foco;

		orbita = new OrbitaTransition(this,
					      datos.semiejeMayor * ESCALA_ORBITA,
					      datos.semiejeMenor * ESCALA_ORBITA,
					      datos.periodoOrbital * ESCALA_TIEMPO,
								true
		);
		orbita.play();
	}

	/**
	 * Constructor.
	 * @param datos información del astro y su órbita.
	 * @param foco astro alrededor del cual gira este satélite.
	 */
	public Satelite(DatosSatelite datos, Astro foco) {
		super(datos.diametroEcuatorial * ESCALA_RADIO);
		this.datos = datos;
		creaOrbita(foco);
	}

	public Satelite(DatosSatelite datos, Astro foco, boolean pluton) {
		super(datos.diametroEcuatorial * ESCALA_RADIO);
		this.datos = datos;
		creaOrbita(foco, true);
	}

	/**
	 * Devuelve el nombre de este satélite.
	 * @return nombre
	 */
	public String getNombre() {
		return this.datos.toString();
	}
}
