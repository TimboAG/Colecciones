package principal;

import entidad.Alumno;
import servicio.AlumnoServicio;
import java.util.ArrayList;

public class ColeccionesEjer03 {

    public static void main(String[] args) {
        AlumnoServicio miServicio = new AlumnoServicio();
        ArrayList<Alumno> miAlumno = miServicio.mi();
        miServicio.notaFinal(miAlumno);
    }
}
