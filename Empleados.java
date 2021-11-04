
public class Empleado {
	private int IdEmpleado;
	private String Nombre;
	private int NivelAcceso;
	private String User;
	private String Password;
	//Parametros 
	public Empleado(int IdEmpleado,String Nombre,int NivelAcceso,String User,String Password){
		this.IdEmpleado=IdEmpleado;
		this.Nombre=Nombre;
		this.NivelAcceso=NivelAcceso;
		this.User=User;
		this.Password=Password;
	}
	//setters y getters
	public int getIdEmpleado(){
		return IdEmpleado;
	}
	public void setIdEmpleado(){
		this.IdEmpleado=IdEmpleado;
	}
	public String getNombre(){
		return Nombre;
	}
	public void setNombre(){
		this.Nombre=Nombre;
	}
	public String getNivelAcceso(){
		return NivelAcceso;
	}
	public void setNivelAcceso(){
		this.NivelAcceso=NivelAcceso;
	}
	public String getUser(){
		return User;
	}
	public void setUser(){
		this.User=User;
	}
	public String getPassword(){
		return Password;
	}
	public void setPassword(){
		this.Password=Password;
	}

}
