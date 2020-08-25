package icc.primitivos;

public class Prueba{

    public static void main(String args[]){
      ImpresoraBinario ib = new ImpresoraBinario();
      int max = (Integer.MAX_VALUE);
      int one = (max + 1);

      double nan = Double.NaN;
      double minf = Double.NEGATIVE_INFINITY;
      double pinf = Double.POSITIVE_INFINITY;
      double cero = 0.0;
      double mcero = -0.0;

      short permisos;
      permisos = 0754;

      int num = 345;
      int resultado = num << 3;

      short permisolectura;
      permisolectura = 0444;


      System.out.println(one);
      ib.imprime(one);

      System.out.println(nan);
      ib.imprime(nan);

      System.out.println(minf);
      ib.imprime(minf);

      System.out.println(pinf);
      ib.imprime(pinf);

      System.out.println(cero);
      ib.imprime(cero);

      System.out.println(mcero);
      ib.imprime(mcero);

      System.out.println(permisos);
      ib.imprime(permisos);

      System.out.println(resultado);
      ib.imprime(resultado);

      System.out.println(permisolectura);
      ib.imprime(permisolectura);


      int numb = 456;
      int numb1 = -456;
      long num1 = 456;
      long num11 = -456;
      float num2 = 456;
      float num22 = -456;
      double num3 = 456;
      double num33 = -456;

      System.out.println(numb);
      ib.imprime(numb);
      System.out.println(numb1);
      ib.imprime(numb1);

      System.out.println(num1);
      ib.imprime(num1);
      System.out.println(num11);
      ib.imprime(num11);

      System.out.println(num2);
      ib.imprime(num2);
      System.out.println(num22);
      ib.imprime(num22);

      System.out.println(num3);
      ib.imprime(num3);
      System.out.println(num33);
      ib.imprime(num33);


      double d = -456.601;
      float f = (float) d;
      long l = (long) d;
      int i = (int) d;


      System.out.println(d);
      ib.imprime(d);

      System.out.println(f);
      ib.imprime(f);

      System.out.println(l);
      ib.imprime(l);

      System.out.println(i);
      ib.imprime(i);


      int máscara = 15;
      int corrim = máscara << 3;

      System.out.println(corrim);
      ib.imprime(corrim);

      int number = 1408;
      int x = (number & máscara);
      int o = (number|máscara);
      int y = (number^máscara);

      System.out.println(x);
      ib.imprime(x);

      System.out.println(o);
      ib.imprime(o);

      System.out.println(y);
      ib.imprime(y);
    }

}
