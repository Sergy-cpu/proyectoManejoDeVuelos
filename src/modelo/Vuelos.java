
package modelo;


public class Vuelos {
    
    private String tipoDeVuelo;
    private String origenYDestino;
    private String fecha;
    private String numeroDeVuelo;

    public Vuelos(String tipoDeVuelo, String origenYDestino, String fecha, String numeroDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
        this.origenYDestino = origenYDestino;
        this.fecha = fecha;
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public Vuelos() {
    }

    public String getTipoDeVuelo() {
        return tipoDeVuelo;
    }

    public void setTipoDeVuelo(String tipoDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
    }

    public String getOrigenYDestino() {
        return origenYDestino;
    }

    public void setOrigenYDestino(String origenYDestino) {
        this.origenYDestino = origenYDestino;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(String numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }
    
    
    
}
