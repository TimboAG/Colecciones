package principal;

import servicio.CineServicio;
import entidad.Cine;

import java.util.ArrayList;

public class ColeccionesEjer04 {

    public static void main(String[] args) {
        CineServicio miServicio = new CineServicio();
        ArrayList<Cine> miCine = miServicio.peliculas();
        miServicio.mostrar(miCine);
    }
}
