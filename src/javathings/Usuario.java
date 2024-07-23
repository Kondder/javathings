package javathings;

public abstract class Usuario {
	
	public int ID;
	public String nombre;
	public String email;
	public String contraseña;
	public boolean conexion; 
	
	public Usuario() {
		
	}
	
	public abstract void inicioSesion();
	

}
