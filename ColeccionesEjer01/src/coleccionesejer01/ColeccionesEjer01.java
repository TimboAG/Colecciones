package Coleccionesejer01;
import Entidad.Perros;
import Servicio.PerroServicio;

public class ColeccionesEjer01 {
    public static void main(String[] args) {       
        PerroServicio miServicio = new PerroServicio();
        Perros miPerro = miServicio.crearPerro();        
        miServicio.mostrar(miPerro);   
    }    
}
