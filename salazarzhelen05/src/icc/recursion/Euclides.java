package icc.recursion;

/**
 * Imprime en la consola los argumentos que le fueron pasados a este programa.
 * Todo programa de Java se encuentra de una construcción llamada <code>class</code>.
 */
public class Euclides{

	/**
	 * Método principal, tú código comienza a ejecutarse aquí.
	 * @param args Esta variable permite acceder a cada argumento.
	 *             Los argumentos son cadenas de caracteres <code>String</code>.
	 */
	public static void main(String[] args) {
		int i,j,r;
		if(args.length == 2) {
				i = Integer.parseInt(args[0]);
        j = Integer.parseInt(args[1]);
				System.out.println("" + i + " " +j);
        demo(i,j);
			}else{
        System.out.println("El número de parámetros no es válido");
        demo(2,4);
        demo(61,5);
        demo(60,5);
        demo(1,5);
        demo(4879274,4567899);
      }
	}
    public static void demo(int i, int j){
        int r;
        System.out.println(" " + i + " " + j);
        r = euclides(i,j);
        System.out.println("El mcd de " + i + " y " + j + " es: " + r);
        System.out.println("**********************\n");
    }

		public static int euclides(int a, int b){
				if (a<0 || b<0){
					throw new ArithmeticException("Algún número es negativo");
				}else{
				if (b == 0){
					return a;
				}else{
					return euclides(b, a%b);
				}
			}
	}
}
