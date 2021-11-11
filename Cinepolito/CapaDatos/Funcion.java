package Capadatos;

import java.util.Date;
import java.util.ArrayList;

public class Funcion 
{
	private	int		idFunction;
	private String	descripcion;
	private Date	duracion;
	private String	genero;
	private	ArrayList <Date>	fechasEmision;
	private ArrayList <Sala>	salasEmision;	// No está instanciado "Sala"
	private double	precioCosto;
	private double	precioVenta;
	
	// GETTERS Y SETTERS
	public int getIdFunction() {
		return idFunction;
	}
	public void setIdFunction(int idFunction) {
		this.idFunction = idFunction;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getDuracion() {
		return duracion;
	}
	public void setDuracion(Date duracion) {
		this.duracion = duracion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public ArrayList<Date> getFechasEmision() {
		return fechasEmision;
	}
	public void setFechasEmision(ArrayList<Date> fechasEmision) {
		this.fechasEmision = fechasEmision;
	}
	public ArrayList<Sala> getSalasEmision() {
		return salasEmision;
	}
	public void setSalasEmision(ArrayList<Sala> salasEmision) {
		this.salasEmision = salasEmision;
	}
	public double getPrecioCosto() {
		return precioCosto;
	}
	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	// MÉTODOS
	public void agregarFuncion(Funcion funcion) {
		
	}
	public void editarFuncion(Funcion funcion) {
		
	}
	public void eliminarFuncion() {
		
	}
	public void mostrarFuncionesActivas() {
		
	}
	public void mostrarFuncionesInactivas() {
		
	}
	public ArrayList<Funcion> buscarFuncionesPorDescripcion(String descripcion) {
		return null;
	}
	public ArrayList<Funcion> buscarFuncionesPorHora(Date hora){
		return null;
	}
	public ArrayList<Funcion> buscarFuncionesPorDia(Date dia){
		return null;
	}
	public ArrayList<Funcion> buscarSalasFuncionesPorDia(Date dia){
		return null;
	}
}
