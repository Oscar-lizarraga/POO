package proyecto;
import java.util.Date;
public class Boleto{
	private int idBoleto;
	private Date fechaVenta;
	private Funcion funcion;
	private Sala sala;

	
	public Boleto(int idBoleto, Date fechaVenta, Funcion funcion, Sala sala /*Double precioTotal*/) {
		this.idBoleto = idBoleto;
		this.fechaVenta = fechaVenta;
		this.funcion = funcion;
		this.sala = sala;
	}
	
	public int getIdBoleto() {
		return idBoleto;
	}
	public void setIdBoleto(int idBoleto){
		this.idBoleto = idBoleto;
	}
	
	public Date getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(Date fechaVenta){
		this.fechaVenta = fechaVenta;
	}
	
	public Funcion getFuncion() {
		return funcion;
	}
	public void setFuncion(Funcion funcion){
		this.funcion = funcion;
	}

	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala){
		this.sala = sala;
	}	
}
