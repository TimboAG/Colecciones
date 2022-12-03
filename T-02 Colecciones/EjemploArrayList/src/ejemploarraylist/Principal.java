/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;
import servicio.ClaseServicio;
import entidad.ClaseEntidad;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ClaseServicio miServicio = new ClaseServicio();
     // ClaseEntidad miEntidad = miServicio.crearObjeto();
     // miServicio.mostrar(miEntidad);
      ArrayList<ClaseEntidad> miArrayList= miServicio.cargarArray();
      miServicio.mostrar(miArrayList);
      miServicio.buscar(miArrayList);
    }
    
}
