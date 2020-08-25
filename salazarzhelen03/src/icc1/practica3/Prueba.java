package icc1.practica3;

public class Prueba{

  public static void main(String [] args){
//Actividad 3.7
    System.out.print("Hola mundo.");
    System.out.print("Adios mundo.");
    System.out.println("Hola mundo.");
    System.out.println("Adios mundo.");

//Ejercicio 1
  float a = 15;
  float b = 8;
  float modulo = a % b;
  System.out.print("El módulo de 15 y 8 es: ");
  System.out.println(modulo);

//Ejercicio 2
  float x = 1F;
  float y = 0.00000001F;
  float z = x - y;
  System.out.println("x-y: " + z);

//Ejercicio 3
  int e1 = 1 >> 1;
  int e2 = -1 >> 1;
  System.out.println("Corrimiento 1 >> 1: " + e1);
  System.out.println("Corrimiento -1 >> 1:" + e2);

//Ejercicio 4
//!(p && q)
  boolean p = true;
  boolean q = true;
  boolean M = !(p && q);
  System.out.println("Ley de Morgan p=1, q=1 : " + M);

  boolean r = true;
  boolean s = false;
  boolean M1 = !(r && s);
  System.out.println("Ley de Morgan r=1, s=0 : " + M1);

  boolean t = false;
  boolean u = true;
  boolean M2 = !(t && u);
  System.out.println("Ley de Morgan t=0, u=1 : " + M2);

  boolean v = false;
  boolean w = false;
  boolean M3 = !(v && w);
  System.out.println("Ley de Morgan v=0, w=0 : " + M3);

//!p || !q
  boolean c = true;
  boolean d = true;
  boolean M4 = !(c) || !(d);
  System.out.println("Ley de Morgan c=1, d=1 : " + M4);

  boolean e = true;
  boolean f = false;
  boolean M5 = !(e) || !(f);
  System.out.println("Ley de Morgan e=1, f=0 : " + M5);

  boolean g = false;
  boolean h = true;
  boolean M6 = !(g) || !(h);
  System.out.println("Ley de Morgan g=0, h=1 : " + M6);

  boolean i = false;
  boolean j = false;
  boolean M7 = !(i) || !(j);
  System.out.println("Ley de Morgan i=0, j=0 : " + M7);

//Preguntas (2)
  int k = 1;
  int l = 2;
  int m = 3;
  System.out.println("a = " + k);
  System.out.println("b = " + l);
  System.out.println("c = " + m);
  int n = (k > 3 && ++k <= 2) ? l++ : m--;
  System.out.println("a = " + k);
  System.out.println("b = " + l);
  System.out.println("c = " + m);

  System.out.println(n);

  }
}
