package icc.matrices;

import java.util.*;

/**
 *@author Helen Salazar Zaragoza
 */


public class Matriz2D{
  //Atributo con arreglo 2D de tipo double.
  double matriz[][];


 //Constructor del atributo matriz de la Clase que recibe [][]m de tipo double.
  public Matriz2D(double m[][]){
    matriz = m;
  }


  //Método que imprime la matriz.
  public String toString(){
    String m = "";
    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        m += " | " + matriz[i][j] + " ";
      }
      m += "\n";
    }
    //Regresa la matriz.
    return m;
  }


  //Método que regresa la longitud de las filas de la Matriz.
  public int getFila(){
    return matriz.length;
  }

  //Método que regresa la longitud de las columnas de la Matriz.
  public int getColumna(){
    return matriz[0].length;
  }


  public static Matriz2D datos(double[][] matriz){
    double n [][] = new double [matriz.length][matriz[0].length];
    for (int i = 0; i < matriz.length; i ++){
      for (int j = 0; j < matriz[i].length; j++){
        n [i][j] = matriz [i][j];
      }
    }
    return new Matriz2D(n);
  }


  //Método que suma dos matrices.
  public Matriz2D suma(Matriz2D m2){
    if(m2 == null){
      throw new IllegalArgumentException("Ingresa valores para ésta matriz.");
    }
    if(getFila() != m2.getFila() || getColumna() != m2.getColumna()){
      throw new IllegalArgumentException("Los valores de ambas matrices son distintos.");
    }

    Matriz2D aux = new Matriz2D(matriz);
    for(int i = 0; i < matriz.length;i++){
      for(int j = 0; j < matriz[i].length; j++){
        aux.matriz[i][j] = matriz[i][j] + m2.matriz[i][j];
      }
    }
    return aux;
  }


  //Método que resta dos matrices.
  public Matriz2D resta(Matriz2D m2){
    if(m2 == null){
      throw new IllegalArgumentException("Ingresa valores para ésta matriz.");
    }
    if(getFila() != m2.getFila() || getColumna() != m2.getColumna()){
      throw new IllegalArgumentException("Los valores de ambas matrices son distintos.");
    }

    Matriz2D aux = new Matriz2D(matriz);
    for(int i = 0; i < matriz.length;i++){
      for(int j = 0; j < matriz[i].length; j++){
        aux.matriz[i][j] = matriz[i][j] - m2.matriz[i][j];
      }
    }
    return aux;
  }


  //Método que multiplica una matriz por un escalar.
  public Matriz2D escalar(double num){
    Matriz2D aux = new Matriz2D(matriz);

    for(int i = 0; i < matriz.length; i++){
      for(int j = 0; j < matriz[i].length; j++){
        aux.matriz[i][j] = matriz[i][j] * num;
      }
    }
    return aux;
  }


  //Método que multiplica dos matrices.
  public Matriz2D mult(Matriz2D m4){
    if(m4 == null){
      throw new IllegalArgumentException("Ingresa valores para ésta matriz.");
    }
    if(getColumna() != m4.getFila()){
      throw new IllegalArgumentException("Los valores de ambas matrices son distintos.");
    }

    double [][] multi = new double [getFila()][m4.getColumna()];

      for(int i = 0; i < multi.length; i++){
        for(int j = 0; j <  multi[i].length; j++){
          for(int k = 0; k <  getColumna(); k++){
          multi[i][j] += matriz[i][k] * m4.matriz[k][j];
          }
        }
      }
      return new Matriz2D(multi);
    }

}
