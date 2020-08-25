/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automatas;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.Scanner;

/**
 *
 * @author blackzafiro
 */
public class Demo extends Application {

    static int ren, col, M, G;

//Método que define la escena de la interfaz.
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Automata");

        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.BLACK);
        primaryStage.setScene(scene);

        Automata a = new Automata(root, ren, col, M);
        a.start();

        primaryStage.show();
    }

//Método que obtiene los valores ingresados por el usuario.
    public static int getInt(String mensaje){
      boolean valido = true;
      Scanner scan = new Scanner(System.in);
      int i = 0;
      System.out.println(mensaje);
      try{
        i = scan.nextInt();
      }catch(Exception e){
        valido = false;
      }if (i < 1){
        valido = false;
      }if( valido ){
        return i;
      }else{
        return getInt(mensaje);
      }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("*** SIMULADOR DE EPIDEMIAS ***");
        ren = getInt("Ingresa el número de renglones: ");
        col = getInt("Ingresa el número de columnas: ");
        M = getInt("Ingresa el valor umbral: ");
        G = getInt("Ingresa el valor del umbral: ");

        launch(args);
    }

}
