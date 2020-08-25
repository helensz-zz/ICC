/*
 *Autómatas
 */
package automatas;

import java.util.Random;

public class Celula{
  int[][] array;
  int M;

  public Celula(int renglones, int columnas, int M){
    array = new int[renglones][columnas];
    this.M = M;
  }


  public void next(){
    Random rdm = new Random();
    for (int i = 0; i < array.length; i++){
      for (int j = 0; j < array[0].length; j++){
        array[i][j] = rdm.nextInt(M + 1);
      }
    }
  }

  public int valido(int i, int j){
    if(0 > i || i >= array.length || 0 > j || j >= array[0].length){
      return -1;
    }else{
      return array[i][j];
    }
  }


}
