
package proyectocine;

import java.util.ArrayList;

public class Sala {
    private int idSala;
    private int numeroAsienontos=100;//inicioalizando nuemro de asientos de la sala
    private int costoSala;
    private TipoSala tipoSala;
    
    //constructor
    public Sala(int idSala, TipoSala tipoSala) {
        this.idSala = idSala;
        this.tipoSala = tipoSala;
    }
    
    //metodos
    public ArrayList<Sala> mostrarSalas(){
        ArrayList<Sala> sala = null;
       
        return sala;
    }
    
     public ArrayList<Sala> buscarSala(){
        ArrayList<Sala> sala = null;
       
        return sala;
    }
    
     public String EliminarSala(){
    
    }
     
     public void agregarSala(Sala sal) {
       
			
    }
     
     
    
    //getters y setters
    public int getIdSala() {
        return idSala;
    }
    public void setIdSala(int idSala) {
        this.idSala = idSala;
    }
    public int getNumeroAsienontos() {
        return numeroAsienontos;
    }
    public void setNumeroAsienontos(int numeroAsienontos) {
        this.numeroAsienontos = numeroAsienontos;
    }
    public TipoSala getTipoSala() {
        return tipoSala;
    }
    public void setTipoSala(TipoSala tipoSala) {
        this.tipoSala = tipoSala;
    }
    
}
