package icc.matrices;


public class UsoMatriz2D{

  public static void main(String [] args){
    double matriz[][] = {{2, 4, 4},{5, 6, 7},{8, 9, 10}};
    double matriz2[][] = {{1, 2, 3},{5, 6, 7},{8, 9, 10}};
    double matriz3[][] = {{1, 2, 3},{5, 6, 7},{8, 9, 10}};
    double matriz4[][] = {{1, 2, 3},{5, 6, 7},{8, 9, 10}};

    //Aquí se imprime la matriz.
    Matriz2D m = new Matriz2D(matriz);
    System.out.println("Matriz: ");
    System.out.println(m);

    //Se suma matriz con matriz2.
    Matriz2D m2 = new Matriz2D(matriz2);
    System.out.println("Suma de Matrices: ");
    System.out.println(m.suma(m2));

    //Se resta matriz con matriz2.
    Matriz2D m3 = new Matriz2D(matriz3);
    System.out.println("Resta de Matrices: ");
    System.out.println(m.resta(m3));

    //Se multiplica matriz por un escalar arbitrario.
    System.out.println("Multiplicación de Matriz y Escalar: ");
    System.out.println(m.escalar(2));

    //Se multiplica matriz2 por matriz4.
    Matriz2D m4 = new Matriz2D(matriz4);
    System.out.println("Multiplicación de Matrices: ");
    System.out.println(m2.mult(m4));
  }

}
