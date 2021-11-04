public class Venta
{
	private int idventa;
	private int idempelado;
	private LocalDate fechaVenta;
	private float totalVenta;
	private float totalCosto;
	private int totalArticulos;
	private ArrayList<Articulo> articulos;

	//setters
	public void setIdVenta(int idventa){ this.idventa = idventa;} 
	public void setIdEmpleado(int idempelado){ this.idempelado= idventa;}
	public void setFechaVenta(LocalDate fechaVenta){ this.fechaVenta = fechaVenta;} 
	public void setTotalVenta(float totalVenta){ this.totalVenta = totalVenta;} 
	public void setTotalCosto(float totalCosto){ this.totalCosto = totalCosto;}
	public void setTotalArticulos(int totalArticulos){ this.totalArticulos = totalArticulos;} 
	public void setArticulos(ArrayList<Articulo> articulos){ this.articulos = articulos;}

	//getters
	public int getIdVenta(){ return this.idventa;} 
	public int getIdEmpleado(){ return this.idempelado;}
	public LocalDate getFechaVenta(){ return this.fechaVenta;} 
	public float getTotalVenta(){ return this.totalVenta;} 
	public float getTotalCosto(){ return this.totalCosto;}
	public int getTotalArticulos(){ return this.totalArticulos;} 
	public ArrayList getArticulos(){ return this.articulos;}


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
	public String agregarVenta(Venta venta)
	{
		return String = "";
	}

	public String editarVenta(Venta venta)
	{
		return String = "";
	}

	public String eliminarVenta(Venta venta)
	{
		return String = "";
	}	

	public ArrayList<Articulo> mostrarVentaPorEmpledo()
	{
		return null;
	}

	public ArrayList<Articulo> mostrarVentasPorDia()
	{
		return null;
	}

}
