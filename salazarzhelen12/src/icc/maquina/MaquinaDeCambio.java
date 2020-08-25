package icc.maquina;
import icc.maquina.*;
import icc.util.*;


public class MaquinaDeCambio{

  private static String formaEncontrada = "";
  private static ManejadorDeLista l;

  MaquinaDeCambio(){

    l = new ManejadorDeLista();
    l.agrega(new Integer(1));
    l.agrega(new Integer(2));
    l.agrega(new Integer(5));
    l.agrega(new Integer(10));
  }

  public String getformaEncontrada(){
    return formaEncontrada;
  }

  public ManejadorDeLista listaDeCambio(int n, ManejadorDeLista l){
    ManejadorDeLista c = new ManejadorDeLista();
    int k = darCambio(n, c);
    return c;
  }

  public Cambio transforma(String datos){
    int numUno = 0;
    int numDos = 0;
    int numCinco = 0;
    int numDiez = 0;
    for(int i = 0; i < datos.length(); i++){
      if(datos.charAt(i) == '1') numUno++;
      if(datos.charAt(i) == '2') numDos++;
      if(datos.charAt(i) == '5') numCinco++;
      if(datos.charAt(i) == '0'){ numDiez++; numUno--;}
    }
    return (new Cambio(numDiez,numCinco,numDos,numUno));
  }

  //Método recursivo
  public int darCambio(int n, ManejadorDeLista c){
    //Casos base:
    if(n == 0){
      Cambio r = transforma(formaEncontrada);
      c.agrega(r);
      return 1;
    }else if(n < 0){
      return 0;
    }else if(l.longitud() == 0){
      return 0;
    }

    int eliminaMoneda;

    Lista a = l.getCabeza();
    Integer b = (Integer) a.getElemento();
    eliminaMoneda = b.intValue();

    String aux = formaEncontrada;
    formaEncontrada += Integer.toString(eliminaMoneda);

    int izquierda = darCambio(n-eliminaMoneda, c);
    formaEncontrada = aux;

    int derecha = 0;
    if(l.longitud() > 1){
      l.eliminaCabeza();
      derecha = darCambio(n,c);
      l.regresa(new Integer(eliminaMoneda));
    }
    return izquierda + derecha;
  }

}
