package cinepolito;

public class Articulo {

	private String codigo;
	private String descripcion;
	private Double precioProvedor;
	private Double precioVenta;
	private int cantidadArticulo;
	private boolean estado;
	//Constructor con todos los parametros
	public Articulo(String codigo, String descripcion, Double precioProvedor, Double precioVenta, int cantidadArticulo,
			boolean estado) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioProvedor = precioProvedor;
		this.precioVenta = precioVenta;
		this.cantidadArticulo = cantidadArticulo;
		this.estado = estado;
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
	
	public int getCantidadArticulo() {
		return cantidadArticulo;
	}
	public void setCantidadArticulo(int cantidadArticulo) {
		this.cantidadArticulo = cantidadArticulo;
	}

	public boolean getEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
