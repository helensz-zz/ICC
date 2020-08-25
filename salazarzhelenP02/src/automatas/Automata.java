/*
 * Autómatas
 */
package automatas;

import javafx.animation.AnimationTimer;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author blackzafiro
 */
public class Automata extends AnimationTimer {

    private Group root;
    private Text text;
    private Rectangle[][] array;
    private Epidemia celula;
    private long timestamp;
    private static final long VAR = 100000000; //Constante.
    private int M;
    private int G;


  //Método que muestra la simulación de la epidemia en la escena.
    public Automata(Group root, int ren, int col, int M) {
        this.root = root;
        this.M = M;
        this.G = G;
        text = new Text ("Epidemia");
        text.setStroke(Color.WHITE);
        text.setY(20);
        text.setX(100);
        root.getChildren().add(text);
        celula = new Epidemia(ren, col, M, G);

        array = new Rectangle[ren][col];
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
              array[i][j] = new Rectangle();
              array[i][j].setX(30 + 30 * i);
              array[i][j].setY(30 + 30 * j);
              array[i][j].setWidth(20);
              array[i][j].setHeight(20);
              array[i][j].setArcWidth(0);
              array[i][j].setArcHeight(0);
              Color c = Color.web("rgb(0,0,255)");
              array[i][j].setFill(c);
              root.getChildren().add(array[i][j]);
            }
        }
        timestamp = 0;

    }

//Modifica el color del simulador.
    public void update(){
      int m,col;
      String s;
      Color c;
      for (int i = 0; i < array.length; i++){
        for (int j = 0; j < array[0].length; j++){
          m = celula.array[i][j];
          if (celula.suceptible(m)){
            s = "rgb (255,0,0)";
          }else if(celula.infectado(m)){
            col = m * (255/M);
            s = "rgb(0," + col + ",0)";
          }else{
            col = (m - M) * (255/(G - M));
            s = "rgb(0,0" + col + ")";
          }
          c = Color.web(s);
          array[i][j].setFill(c);
        }
      }
    }

//Aquí ponemos todo lo que se verá en la interfaz.
    @Override
    public void handle(long now) {
        text.setText("Epidemia");
        if(now >= timestamp + VAR){
          timestamp = now;
          celula.next();
          update();
        }
    }

}
