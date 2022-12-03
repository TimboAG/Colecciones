
package main;

import servicio.TiendaServicio;
import entidad.Tienda;
import java.util.HashMap;

public class ColeccionesEjer06 {

    public static void main(String[] args) {
        TiendaServicio miServicio = new TiendaServicio();
        Tienda miTienda = new Tienda();
        HashMap miHash = miServicio.crearTienda(miTienda);
        miServicio.mostrarProducto(miHash);
        miServicio.buscarProducto(miHash);
    }
}
