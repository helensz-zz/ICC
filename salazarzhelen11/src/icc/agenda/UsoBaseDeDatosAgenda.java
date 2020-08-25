/* -*- jde -*- */
/* <UsoBaseDeDatosAgenda.java> */

package icc.agenda;
import java.util.Scanner;

/**
 * Clase de uso donde se pueden crear un par de bases de datos y
 * realizar consultas.
 */
public class UsoBaseDeDatosAgenda {

	/*Atributos.*/
	private Scanner scanner;
	private BaseDeDatosAgenda bus;

	public UsoBaseDeDatosAgenda(){
		scanner = new Scanner(System.in);
		bus = new BaseDeDatosAgenda();
	}

	/*  Número de caracteres que debe tener el registro nombre. */
	private static final int TAM_NOMBRE    = 20;
	/*  Número de caracteres que debe tener el registro dirección. */
	private static final int TAM_DIRECCION = 30;
	/*  Número de caracteres que debe tener el registro teléfono. */
	private static final int TAM_TELEFONO  = 8;

	private static final String tabla1 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
	"Juan Pérez García   "+"Avenida Siempre Viva # 40     "+"55554466"+
	"Arturo López Estrada"+"Calle de la abundancia # 12   "+"55557733"+
	"Edgar Hernández Levi"+"Oriente 110 # 14              "+"55512112"+
	"María García Sánchez"+"Avenida Insurgentes Sur # 512 "+"56742391"+
	"Pedro Páramo Rulfo  "+"Avenida Méxio Lindo # 23      "+"54471499"+
	"José Arcadio Buendía"+"Macondo # 30                  "+"56230190"+
	"Florentino Ariza    "+"Calle de la Cólera # 11       "+"55551221";

	private static final String tabla2 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
	"Galio Bermúdez      "+"Sótanos de México # 45        "+"55552112"+
	"Carlos García Vigil "+"La República # 1              "+"55554332"+
	"Eligio García Agusto"+"Ciudades Desiertas # 90       "+"56344325";

/**
 *
 */

 /**
  *Método que imprime el menú de las opciones posibles que puede
	*ingresar el usuario.
	*/
	private RegistroAgenda solicitaDatosDeContacto() {
		System.out.println("Dame los datos del nuevo contacto...");
		System.out.println("Nombre: ");
		String nombre = scanner.nextLine();
		System.out.println("Direccion: ");
		String direccion= scanner.nextLine();
		System.out.println("Telefono: ");
		int telefono = scanner.nextInt();


		RegistroAgenda nuevo = new RegistroAgenda(nombre, direccion, telefono);
		return nuevo;
    }

	private void imprimeMenu() {
		System.out.println("Opciones: ");
		System.out.println("1) Crear una base de datos");
		System.out.println("2) Cargar de disco");
		System.out.println("3) Guardar la Agenda");
		System.out.println("4) Agregar un registro");
		System.out.println("5) Buscar por nombre");
		System.out.println("6) Buscar un teléfono");
		System.out.println("7) Imprimirla toda");
		System.out.println("8) Salir");
	}

	private int leeEntero(String mensaje) {
         System.out.println(mensaje);
         boolean error = false;
         int num = -1;
         try {
             num = Integer.parseInt(scanner.nextLine());
             if (num <= 0) {
                 error = true;
                 System.out.println("El valor más chico posible es uno.");
             }
         } catch (NumberFormatException nfe) {
             error = true;
             System.out.println("Por favor ingresa un número válido.");
         }
         if (error) {
             num = leeEntero(mensaje);
         }
         return num;
     }


	/**
	*Método que lee la opción elegida por el usuario.
	*/
	public void corre() {
		System.out.println("***MENÚ***");
		boolean continuar = true;
		while(continuar) {
			imprimeMenu();
			int opcion = leeEntero("Selecciona una opción: ");
			switch(opcion) {
				case 1:
							System.out.println("Ingresa el nombre que deseas que tenga la Base de Datos: ");
							bus.doDataBase(scanner.nextLine());
							break;

				case 2:
							System.out.println("Ingresa el nombre del archivo a cargar: ");
							bus.carga(scanner.nextLine());
							break;


				case 3:
							System.out.println("Ingresa el nombre del archivo en el que guardarás la Agenda: ");
							bus.guardaAgenda(scanner.nextLine());
							break;

				case 4:
							RegistroAgenda rg = solicitaDatosDeContacto();
							bus.inserta(rg);
							break;

				case 5:
							System.out.println("Escribe el nombre del Registro que buscas:");
							String pista = scanner.nextLine();
							RegistroAgenda reg = bus.dameRegistroPorNombre(pista);
							if(reg == null) {
								System.out.println("No se encontró ningún registro con nombre " + pista);
							} else {
								System.out.println("Se encontró a: " + reg.toString());
							}
							break;


				case 6:
							System.out.println("Escribe el número del Registro que buscas:");
							int number = scanner.nextInt();
							RegistroAgenda regi = bus.dameRegistroPorTelefono(number);
							if(regi == null) {
								System.out.println("No se encontró ningún registro con tel+efono " + number);
							} else {
								System.out.println("Se encontró a: " + regi.toString());
							}
							break;

				case 7:
							bus.imprimeTodo();
							break;

				case 8:
							continuar = false;
								break;

				default:
							System.out.println("Esa no es una opción válida del menú.");
							break;
			}
		}


	}

	public static void main(String[] args) {
		// TODO: Crear un par de BaseDeDatosAgenda y realizar algunas consultas.
	UsoBaseDeDatosAgenda ubda = new UsoBaseDeDatosAgenda();
	ubda.corre();
	}
}

/* </UsoBaseDeDatosAgenda.java> */
