package javathings;

public class Cliente extends Usuario{
	
	public String direccion;
	public int contacto;
	
	public Cliente(String direccion, int contacto) {
		
		super();
		this.direccion=direccion;
		this.contacto=contacto;
		
		System.out.println("Los datos son: " + direccion + contacto);
	}
	
	public void inicioSesion() {
		 
	}
}