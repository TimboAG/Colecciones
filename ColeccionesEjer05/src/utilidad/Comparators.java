package utilidad;
import entidad.Pais;
import java.util.Comparator;


public class Comparators {
    
    public static Comparator<Pais> compareNombre = new Comparator<Pais>(){
        @Override
        public int compare(Pais t1, Pais t2) {
            return t1.getNombre().compareTo(t2.getNombre());
        }
    };     
}