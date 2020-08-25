/*
 *Autómata
 */

package automatas;
import java.util.Random;

public class Epidemia extends Celula{
  int G;

//Método que recibe los datos del simulador.
  public Epidemia(int renglones, int columnas, int M, int G){
      super(renglones,columnas,M);
      this.G = G;
      super.next();
  }

  public boolean inmune(int val){
    return val > M;
  }

  public boolean suceptible(int val){
    return 0 == val;
  }

  public boolean infectado(int val){
    return 0 < val && val <= M;
  }

//Método para la simulación de la Epidemia.
  public void next(){
    int caso;
    int aux;
    for(int i = 0; i < array.length; i++) {
      for(int j = 0; j < array[0].length; j++) {
        caso = array[i][j];
        if (caso == 0){
            aux = valido(i + 1, j);
          if (infectado(aux)){
            array[i][j] += 1;
          }else{
              aux = valido(i, j + 1);
            if (infectado(aux)){
              array[i][j] += 1;
            }else{
              aux = valido(i - 1, j);
              if (infectado(aux)){
                array[i][j] += 1;
            }else {
              aux = valido(i, j - 1);
              if(infectado(aux)){
                array[i][j] += 1;
              }
            }
            }
          }
        }else if(caso <= M){
            array[i][j] += 1;
          }else{
            array[i][j] = (array[i][j] + 1) % (M + G + 1);
          }
      }
    }
  }


}
