
package Presentacion;

import java.util.Observable;
import java.util.Observer;


public class model extends Observable{
    
    
    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        refresh();
    } 
    private void refresh() {
        setChanged();
        notifyObservers();
    }
}
