package icc.entrada;
import java.lang.Math;

/**
 * Imprime en la consola los argumentos que le fueron pasados a este programa.
 * Todo programa de Java se encuentra de una construcción llamada <code>class</code>.
 */
public class Entrada {

	/**
	 * Método principal, tú código comienza a ejecutarse aquí.
	 * @param args Esta variable permite acceder a cada argumento.
	 *             Los argumentos son cadenas de caracteres <code>String</code>.
	 */
	public static void main(String[] args) {
		int r;
		boolean b;
		if(args.length == 1) {
				r = Integer.parseInt(args[0]);
				System.out.println("" + r);

				b = esPrimo(r);
				if (b){
						System.out.println("El número " + r + " es primo.");
					}else{
						System.out.println("El número " + r + " NO es primo.");
					}
			}
	}
		public static boolean esPrimo(int n){
			for (int i = 2; i < Math.sqrt(n); i++ ){
				if (n % i == 0){
				return false;
				} else{
					return true;
		 		}
		 	}
		 	return false;
		 }
}
