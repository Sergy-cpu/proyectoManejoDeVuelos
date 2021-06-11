
package proyectomanejovuelosaerolinea;


public class ProyectomanejoVuelosAerolinea {

   
    public static void main(String[] args) {
      
        Presentacion.VentanaPrincipal v1 = new Presentacion.VentanaPrincipal();
        Presentacion.model m1 = new Presentacion.model();
        Presentacion.Controlador c1 = new Presentacion.Controlador(v1, m1);
        v1.setVisible(true);
    }
    
}
