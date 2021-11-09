
package proyectocine;

public class Sala {
    private int idSala;
    private int numeroAsienontos;
    private int costoSala;
    private TipoSala tipoSala;
    
    //constructor
    public Sala(int idSala, int numeroAsienontos, int costoSala, TipoSala tipoSala) {
        this.idSala = idSala;
        this.numeroAsienontos = numeroAsienontos;
        this.costoSala = costoSala;
        this.tipoSala = tipoSala;
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
