public class Venta
{
	private int idventa;
	private LocalDate fechaVenta;
	private Double totalVenta;
	private Double totalCosto;
	private int totalArticulos;
	private ArrayList<Articulo> articulos;
	private FormaPago formaPago

	//setters
	public void setIdVenta(int idventa){ this.idventa = idventa;} 
	public void setIdEmpleado(int idempelado){ this.idempelado= idventa;}
	public void setFechaVenta(LocalDate fechaVenta){ this.fechaVenta = fechaVenta;} 
	public void setTotalVenta(float totalVenta){ this.totalVenta = totalVenta;} 
	public void setTotalCosto(float totalCosto){ this.totalCosto = totalCosto;}
	public void setTotalArticulos(int totalArticulos){ this.totalArticulos = totalArticulos;} 
	public void setArticulos(ArrayList<Articulo> articulos){ this.articulos = articulos;}
	public void setFormaPago(FormaPago formaPago){this.formaPago = formaPago}

	//getters
	public int getIdVenta(){ return this.idventa;} 
	public int getIdEmpleado(){ return this.idempelado;}
	public LocalDate getFechaVenta(){ return this.fechaVenta;} 
	public Double getTotalVenta(){ return this.totalVenta;} 
	public Double getTotalCosto(){ return this.totalCosto;}
	public int getTotalArticulos(){ return this.totalArticulos;} 
	public ArrayList getArticulos(){ return this.articulos;}
	public FormaPago getFormaPago(){return this.formaPago;}


	Venta(int idventa, int idempleado, LocalDate fechaVenta, float totalVenta, 
		float totalCosto, int totalArticulos, ArrayList<Articulo> articulos)
	{
		this.idventa = idventa
		this.idempelado = idempleado;
		this.fechaVenta = fechaVenta;
		this.totalCosto = totalCosto;
		this.totalVenta = totalVenta;
		this.totalArticulos = totalArticulos;
		this.articulos = articulos;
	}

	//Methods
	public String agregarArticulo(Venta venta)
	{
		return String = "";
	}

	public String eliminarArticulo(Venta venta)
	{
		return String = "";
	}

	public String mostrarArticulos(Venta venta)
	{
		return String = "";
	}	

	public Double ventaTotalDelDia()
	{
		return 0.0;
	}

}
