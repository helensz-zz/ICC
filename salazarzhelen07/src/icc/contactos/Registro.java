package icc.contactos;

public class Registro{
	private String nombre;
	private String direccion;
	private String telefono;
	private Registro siguiente;

	public Registro(String nombre, String direccion, String telefono) {
		this.nombre = nombre;
		if (nombre == null){
			this.nombre = "Sin nombre de registro.";
		}
		this.direccion = direccion;
		if (direccion == null){
			this.direccion = "Sin direccion de registro.";
		}
		this.telefono = telefono;
		if (telefono == null){
			this.telefono = "Sin telefono de registro.";
		}
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
		if (nombre == null){
			this.nombre = "Sin nombre de registro.";
		}
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setdireccion(String direccion){
		this.direccion = direccion;
		if (direccion == null){
			this.direccion = "Sin direccion de registro.";
		}
	}

	public String getDireccion(){
		return this.direccion;
	}

	public void setTelefono(String telefono){
		this.telefono = telefono;
		if (telefono == null){
			this.telefono = "Sin telefono de registro.";
		}
	}

	public String getTelefono(){
		return this.telefono;
	}

 	void setSiguiente(Registro siguiente){
		this.siguiente = siguiente;
	}

	Registro getSiguiente(){
		return this.siguiente;
	}


	public String toString(){
		String name = "Nombre: " + this.nombre + "\n";
		String direccion = "direccion: " + this.direccion + "\n";
		String telefono = "telefono: " + this.telefono + "\n";
		return name + direccion + telefono;
	}
}
