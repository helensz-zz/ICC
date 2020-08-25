package icc.clases;

  public class Ciudadano{

    private String name;

    private String lastname;

    private String lastname2;

    private String birth;

    //Constructor Ciudadano.
  public Ciudadano(String name, String lastname, String lastname2, String birth) {
    this.name = name;
    this.lastname = lastname;
    this.lastname2 = lastname2;
    this.birth = birth;
  }

  //Método para mostrar los datos del Ciudadano.
  public String toString(){
    return (name + " " + lastname + " " + lastname2 + " " + birth);
  }

  //Aquí se calcula el RFC
  public String calculaRFC() {
      String paterno = lastname.substring(0,2).toUpperCase();
      String materno = lastname2.substring(0,1).toUpperCase();
      String nombre = name.substring(0,1).toUpperCase();
      //La fecha de nacimiento de solicita con el formato dd/mm/aaaa
      //Se usa un split para omitir las diagonales en el RFC
      String[] nacimiento = birth.split("/");
      /**Tomamos únicamente los últimos dos dígitos del año, y los colocamos inmediatamente
      después del nombre, seguido de los dígitos del mes, seguido de los dígitos del día.*/
      String nacimiento1 = nacimiento[2].substring(2,4);
      String nacimiento2 = nacimiento[1];
      String nacimiento3 = nacimiento[0];

      //Regresamos el RFC.
    return (paterno + materno + nombre + nacimiento1 + nacimiento2 + nacimiento3);
  }

  }
