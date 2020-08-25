package icc.estadisticas;

public class UsoEstadisticas{

  public static void main(String[] args){

      Estadisticas n = new Estadisticas();
      n.cargaArreglo("icc/estadisticas/data.txt");
      System.out.print("Media: ");
      System.out.println(n.media());
      System.out.print("Varianza: ");
      System.out.println(n.varianza());

  }

}
