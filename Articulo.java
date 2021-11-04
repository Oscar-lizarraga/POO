package cinepolito;

public class Articulo {

	private String codigo;
	private String descripcion;
	private Double precioProvedor;
	private Double precioVenta;
	
	//Constructor con todos los parametros
	public Articulo(String codigo, String descripcion, Double precioProvedor, Double precioVenta) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioProvedor = precioProvedor;
		this.precioVenta = precioVenta;
	}
	
	//setters y getters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Double getPrecioProvedor() {
		return precioProvedor;
	}
	public void setPrecioProvedor(Double precioProvedor) {
		this.precioProvedor = precioProvedor;
	}
	
	public Double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}
}
