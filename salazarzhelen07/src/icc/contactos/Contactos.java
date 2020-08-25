package icc.contactos;

public class Contactos{
  private Registro firstcontact;

  public Contactos(){
    this.firstcontact = null;
  }

  public void insertaContacto(Registro reg){
    if (reg == null)
      throw new NullPointerException();
    if (firstcontact == null){
      firstcontact = reg;
    }else if (firstcontact.getNombre().compareTo(reg.getNombre()) > 0){
      reg.setSiguiente(firstcontact);
       firstcontact = reg;
     }else{
       Registro aux = firstcontact;
       while (aux.getSiguiente() != null){
         if (aux.getSiguiente().getNombre().compareTo(reg.getNombre()) > 0){
           reg.setSiguiente(aux.getSiguiente());
           aux.setSiguiente(reg);
           return;
         }
         aux = aux.getSiguiente();
      }
        aux.setSiguiente(reg);
        }
  }

  public void imprimeContactos(){
    Registro aux;
    if (firstcontact != null)
      aux = firstcontact;
    else
      return;
    while(aux != null){
        System.out.println(aux.toString());
        aux = aux.getSiguiente();
    }
  }

  public Registro consultar(String nombre){
    Registro aux = firstcontact;
    if (aux.toString().contains(nombre)){
      return aux;
    }else{
    while (aux.getSiguiente() != null){
      if (aux.toString().contains(nombre))
        return aux;
      else
        aux = aux.getSiguiente();
    }
    }
    return null;
  }

}
