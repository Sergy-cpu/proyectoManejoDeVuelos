
package modelo;


public class admin {

   
  
    private String usuario;
    private String clave;

    public admin(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    public admin() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String nombre) {
        this.usuario = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
    
    
}
