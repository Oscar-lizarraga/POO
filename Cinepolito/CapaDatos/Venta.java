package Capadatos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta
{
	private int idventa;
	private LocalDate fechaVenta;
	private Double totalVenta;
	private Double totalCosto;
	private int totalArticulos;
	private ArrayList<Articulo> articulos;
	private FormaPago formaPago;

	//setters
	public void setIdVenta(int idventa){ this.idventa = idventa;} 
	public void setFechaVenta(LocalDate fechaVenta){ this.fechaVenta = fechaVenta;} 
	public void setTotalVenta(Double totalVenta){ this.totalVenta = totalVenta;} 
	public void setTotalCosto(Double totalCosto){ this.totalCosto = totalCosto;}
	public void setTotalArticulos(int totalArticulos){ this.totalArticulos = totalArticulos;} 
	public void setArticulos(ArrayList<Articulo> articulos){ this.articulos = articulos;}
	public void setFormaPago(FormaPago formaPago){this.formaPago = formaPago;}

	//getters
	public int getIdVenta(){ return this.idventa;} 
	public LocalDate getFechaVenta(){ return this.fechaVenta;} 
	public Double getTotalVenta(){ return this.totalVenta;} 
	public Double getTotalCosto(){ return this.totalCosto;}
	public int getTotalArticulos(){ return this.totalArticulos;} 
	public ArrayList getArticulos(){ return this.articulos;}
	public FormaPago getFormaPago(){return this.formaPago;}


	Venta(int idventa, LocalDate fechaVenta, Double totalVenta, 
		Double totalCosto, int totalArticulos, ArrayList<Articulo> articulos)
	{
		this.idventa = idventa;
		this.fechaVenta = fechaVenta;
		this.totalCosto = totalCosto;
		this.totalVenta = totalVenta;
		this.totalArticulos = totalArticulos;
		this.articulos = articulos;
	}

	//Methods
	public String agregarArticulo(Venta venta)
	{
		return "";
	}

	public String eliminarArticulo(Venta venta)
	{
		return "";
	}

	public String mostrarArticulos(Venta venta)
	{
		return "";
	}	

	public Double ventaTotalDelDia()
	{
		return 0.0;
	}

}
