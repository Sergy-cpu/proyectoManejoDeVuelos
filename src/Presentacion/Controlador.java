
package Presentacion;


public class Controlador {
    private VentanaPrincipal vista;
    private model model;

    public Controlador(VentanaPrincipal vista, model model) {
        this.vista = vista;
        this.model = model;
        vista.setControl(this);
        vista.setModel(model);
    }

    
    
}
