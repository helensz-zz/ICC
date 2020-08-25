import java.util.Scanner;
/**
 *Programa recursivo que proporciona las instrucciones para resolver correctamente
 *las torres de TorresHanoi.
 */

public class TorresHanoi{

/**
* @param args
*/

 public static void main (String[] args) {
   TorresHanoi disc = new TorresHanoi();
   System.out.print("Ingresa un número: ");
   Scanner sc = new Scanner(System.in);
   int i = sc.nextInt();
   disc.torresHanoi(i, 'A', 'B', 'C');
   System.out.println("Juego Completado");
 }

 public void torresHanoi(int i, char t1, char t2, char t3){
   //Caso Base:
   if(i == 1){
     System.out.println("Mover Disco de Torre " + t1 + " a torre " + t3);
   }else{
     //Dominio
     torresHanoi(i-1, t1, t3, t2);
     System.out.println("Mover Disco de Torre " + t1 + " a torre " + t3);
     torresHanoi(i-1, t2, t1, t3);
   }

 }

}
