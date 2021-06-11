
package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Aerolinea {
    
        private static Aerolinea instance = null;
         private Map<String, Vuelos> vuelos;        
        private Map<String, admin> admins;
        
        
        private Aerolinea() {
            vuelos = new HashMap<String, Vuelos>();
            admins = new HashMap<String, admin>();
        }
        
        public Aerolinea getInstance() {
            if (instance == null) {
                instance = new Aerolinea();
            }
            return instance;
        }
        
        public void agregarVuelo(Vuelos x) throws Exception {
            Vuelos v = vuelos.get(x.getNumeroDeVuelo());
            if (v == null) {
                vuelos.put(x.getNumeroDeVuelo(),x);
                
            }else {
                throw new Exception("El vuelo ya existe");
            }
        }
        
         public void agregarAdmin(admin x) throws Exception {
            admin ad = admins.get(x.getUsuario());
            if (ad == null) {
                admins.put(x.getUsuario(),x);
                
            }else {
                throw new Exception("El admin ya existe");
            }
        }
         
         public ArrayList<Vuelos> getVuelos() {
             ArrayList<Vuelos> listaVuelos = new ArrayList<>();
             for (Map.Entry<String, Vuelos> entry : vuelos.entrySet()) {
                listaVuelos.add(entry.getValue());
                
                 
             }
                         
             return listaVuelos;
                   
         }
         
          public ArrayList<admin> getAdmin() {
             ArrayList<admin> listaAdmin = new ArrayList<>();
             for (Map.Entry<String, admin> entry : admins.entrySet()) {
                listaAdmin.add(entry.getValue());
                
                 
             }
                         
             return listaAdmin;
                   
         }
          
          public ArrayList<Vuelos> getVueloPorNumero(String numeroDeVuelo) throws Exception {
               ArrayList<Vuelos> listaVuelos = new ArrayList<>();
              Vuelos vuelo = vuelos.get(numeroDeVuelo);
              if (vuelo != null) {
                  listaVuelos.add(vuelo);
                  return listaVuelos;
              }else {
                  throw new Exception("El vuelo no existe");
              }
          }
          
         
}
