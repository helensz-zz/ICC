package icc.maquina;
import icc.maquina.*;
import icc.util.*;

public class UsoMaquinaDeCambio{

  public static void imprimeLista(ManejadorDeLista lista){
    Lista aux = lista.getCabeza();
    while(aux != null){
      System.out.println(aux.getElemento().toString());
      aux = aux.getSiguiente();
    }
  }

  public static void main(String[] args){
    
    ManejadorDeLista monedas = new ManejadorDeLista();
    System.out.println("Las formas posibles son ");
    ManejadorDeLista q = new ManejadorDeLista();
    MaquinaDeCambio prueba = new MaquinaDeCambio();
    q = prueba.listaDeCambio(10,monedas);
    imprimeLista(q);
  }
}
