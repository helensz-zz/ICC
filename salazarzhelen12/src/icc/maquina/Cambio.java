package icc.maquina;
import icc.maquina.*;
import icc.util.*;

public class Cambio{
  private int monedasDiez;
  private int monedasCinco;
  private int monedasDos;
  private int monedasUno;

public Cambio(int monedasDiez, int monedasCinco, int monedasDos, int monedasUno){
    this.monedasUno = monedasUno;
    this.monedasDos = monedasDos;
    this.monedasCinco = monedasCinco;
    this.monedasDiez = monedasDiez;
  }

  public String toString(){
    String aux = "";
    for(int i = 0; i < monedasDiez; i++) aux += "10 ";
    for(int i = 0; i < monedasCinco; i++) aux += "5 ";
    for(int i = 0; i < monedasDos; i++) aux += "2 ";
    for(int i = 0; i < monedasUno; i++) aux += "1 ";
    return aux;
  }
}
