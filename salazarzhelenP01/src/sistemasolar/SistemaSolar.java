/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package sistemasolar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.paint.*;
import javafx.scene.shape.*;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import static javafx.application.Application.launch;
/**
 * Simulación del sistema solar utilizando JavaFX
 * https://docs.oracle.com/javase/8/javafx/api/index.html
 * @author blackzafiro
 */
public class SistemaSolar extends Application {

	private final static int ANCHO_VENTANA_INICIAL = 1200;
	private final static int ALTO_VENTANA_INICIAL = 800;
	private final static int RADIO_SOL = 50;

	private Astro sol;
	private Satelite luna;
	private Satelite mercurio;
	private Satelite venus;
	private Satelite tierra;
	private Satelite marte;
	private Satelite jupiter;
	private Satelite saturno;
	private Satelite urano;
	private Satelite neptuno;
	private Satelite pluton;
	private Satelite io;
	private Satelite europa;
	private Satelite ganimides;
	private Satelite calisto;
	private Satelite proteo;
	private Satelite triton;
	private Satelite nereida;
	private Satelite mimas;
	private Satelite encelado;
	private Satelite tetis;


	public static int getSolCentroX() {
		return ANCHO_VENTANA_INICIAL/2;
	}

	public static int getSolCentroY() {
		return ALTO_VENTANA_INICIAL/2;
	}

	/**
	 * Crea al sol, los planteas y sus satélites, asignando quien gira
	 * alrededor de quien.
	 */


	private void creaAstros() {

		sol = new Astro(RADIO_SOL);
		sol.setImage("file:sistemasolar/sun.png");

		mercurio = new Satelite(Satelite.DatosSatelite.MERCURIO, sol);
		mercurio.setImage("file:sistemasolar/mercury.jpg");

		venus = new Satelite(Satelite.DatosSatelite.VENUS, sol);
		venus.setImage("file:sistemasolar/venus.jpg");

		tierra = new Satelite(Satelite.DatosSatelite.TIERRA, sol);
		tierra.setImage("file:sistemasolar/earth.jpg");
		luna = new Satelite(Satelite.DatosSatelite.LUNA, tierra);

		marte = new Satelite(Satelite.DatosSatelite.MARTE, sol);
		marte.setImage("file:sistemasolar/mars.jpg");

		jupiter = new Satelite(Satelite.DatosSatelite.JUPITER, sol);
		jupiter.setImage("file:sistemasolar/jupiter.png");
		io = new Satelite(Satelite.DatosSatelite.SATELITE1, jupiter);
		europa = new Satelite(Satelite.DatosSatelite.SATELITE2, jupiter);
		ganimides = new Satelite(Satelite.DatosSatelite.SATELITE3, jupiter);
		calisto = new Satelite(Satelite.DatosSatelite.SATELITE4, jupiter);

		saturno = new Satelite(Satelite.DatosSatelite.SATURNO, sol);
		saturno.setImage("file:sistemasolar/saturn.jpg");
		mimas = new Satelite(Satelite.DatosSatelite.SATELITE8, saturno);
		encelado = new Satelite(Satelite.DatosSatelite.SATELITE9, saturno);
		tetis = new Satelite(Satelite.DatosSatelite.SATELITE10, saturno);

		urano = new Satelite(Satelite.DatosSatelite.URANO, sol);
		urano.setImage("file:sistemasolar/uranus.jpg");

		neptuno = new Satelite(Satelite.DatosSatelite.NEPTUNO, sol);
		neptuno.setImage("file:sistemasolar/neptune.jpg");
		proteo = new Satelite(Satelite.DatosSatelite.SATELITE5, neptuno);
		triton = new Satelite(Satelite.DatosSatelite.SATELITE6, neptuno);
		nereida = new Satelite(Satelite.DatosSatelite.SATELITE7, neptuno);

		pluton = new Satelite(Satelite.DatosSatelite.PLUTON, sol,true);

	}

	/**
	 * Crea la escena y agrega los primeros nodos, sobre los cuales
	 * se han agregado a los demás astros.
	 * @return la escena con el sol, planetas y satélites.
	 */
	private Scene montaNodos() {
		AnchorPane root = new AnchorPane();
		root.setLayoutX(getSolCentroX() - RADIO_SOL);
		root.setLayoutY(getSolCentroY() - RADIO_SOL);

		root.getChildren().add(sol.getNodo());

		Scene scene = new Scene(root, ANCHO_VENTANA_INICIAL, ALTO_VENTANA_INICIAL,Color.BLACK);
		return scene;
	}

	/**
	 * Acomoda los elementos en la intefaz e inicia la animación.
	 * @param primaryStage
	 * @throws Exception
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		creaAstros();

		Scene scene = montaNodos();
		primaryStage.setTitle("Sistema solar");
		primaryStage.setScene(scene);
		primaryStage.show();

		//Aquí intenté agregar una imagen y me cerraba el programa.
		//Tuve muchos problemas para agregar o foto o color.
	   /**Creating an image
	   Image soli = new Image(new FileInputStream("file:sistemasolar/sun.png"));

	   //Setting the image view
	   ImageView viewSol = new ImageView();
			viewSol.setImage(soli);
			sol.nodo.getChildren().add(viewSol);
			*/
	}

	/**
	 * Inicia la simulación.
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

}
