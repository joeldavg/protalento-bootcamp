package clase8.oop.herencia;

public abstract class Persona {
	
	//atributos
	private String nombre;
	protected String apellido;
	public String colorPelo;
	//public final int cantidadOrejas = 2;
	public static final int cantidadNariz = 1;
	
	public Persona(String nombre, String apellido, String colorPelo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.colorPelo = colorPelo;
	}
	
	public final int getCantidadOjos() {
		return 2;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getColorPelo() {
		return colorPelo;
	}
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	
	public void detalle() {
		System.out.println(this.toString());
		//mandar a archivo!
		//ahora puede llamar a detallar
		detallar();
	}
	
	// metodo es del Object, pero Persona le cambia el comportamiento
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", colorPelo=" + colorPelo + "]";
	}
	
	public abstract void detallar(); // no esta implementado > los hijos deben implementar el comportamiento
	
}
