package icc.estadisticas;

import java.util.*;
import java.io.*;

public class Estadisticas {
  double[] array;

  public void cargaArreglo(String path){

    try{

      BufferedReader buffer = new BufferedReader(new FileReader(path));

      int z = Integer.parseInt(buffer.readLine());
      array = new double[z];

      for(int i = 0; i < array.length; i++){
        array[i] = Double.parseDouble(buffer.readLine());
      }

    }catch(FileNotFoundException e){
      System.out.println("No se encontró el archivo.");
    }catch (IOException e){
      System.out.println("Error");
    }

  }

  public double media(){
    double media = 0.0;
    for( int i = 0; i < array.length; i++){
      media = media + array[i];
    }
    return media/array.length;
  }

  public double varianza(){
    double varianza = 0.0;
    double media = media();
    for(int i = 0; i < array.length; i++){
      varianza = varianza + Math.pow(array[i] - media, 2);
    }
    return varianza/array.length;
  }

}
