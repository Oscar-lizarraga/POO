package Capadatos;


public class Empleado 
{
	private int idEmpledo;
	private String nombre;
	private int nivelAcceso;
	private String user;
	private String password;

	//Constructor
	public Empleado(int idEmpledo,String nombre,int nivelAcceso,String user,String password){
		this.idEmpledo=idEmpledo;
		this.nombre=nombre;
		this.nivelAcceso=nivelAcceso;
		this.user=user;
		this.password=password;
	}

	//setters y getters
	public int getIdEmpleado(){
		return this.idEmpledo;
	}
	public void setIdEmpleado(int idEmpledo){
		this.idEmpledo=idEmpledo;
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public int getNivelAcceso(){
		return this.nivelAcceso;
	}
	public void setNivelAcceso(int nivelAcceso){
		this.nivelAcceso=nivelAcceso;
	}
	public String getUser(){
		return this.user;
	}
	public void setUser(String user){
		this.user=user;
	}
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password=password;
	}

}
