package coleccionesejer05;

import entidad.Pais;
import servicio.PaisServicio;
import java.util.HashSet;

public class ColeccionesEjer05 {

    public static void main(String[] args) {
        PaisServicio miServicio = new PaisServicio();
        HashSet<Pais> miHash = miServicio.inicio();
        miServicio.mostrar(miHash);
    }
}
