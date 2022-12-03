package servicio;

import entidad.Pais;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import utilidad.Comparators;

public class PaisServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashSet<Pais> inicio() {
        HashSet<Pais> miHash = new HashSet();
        int opc = 1;
        String opc2;
        while (opc != 0) {
            Pais miPais = crearPais();
            miHash.add(miPais);
            System.out.println("Desea ingresar otro pais?");
            opc2 = leer.next();
            if ("S".equals(opc2) || "s".equals(opc2) || "Si".equals(opc2) || "si".equals(opc2)) {
                opc = 1;
            } else {
                opc = 0;
            }
        }
        return miHash;
    }

    public Pais crearPais() {
        Pais miPais = new Pais();
        String pais;
        System.out.println("Ingrese un pais");
        pais = leer.next();
        miPais.setNombre(pais);
        return miPais;
    }

    public void mostrarPais(HashSet<Pais> mi) {
        System.out.println(mi);
    }

    public void eliminarPais(HashSet<Pais> mi) {
        System.out.println("Ingrese el nombre del pais que quiere eliminar: ");
        String paisEliminado = leer.next();
        boolean esta = false;
        Iterator<Pais> paisesIt = mi.iterator();
        while (paisesIt.hasNext()) {
            if (paisesIt.next().getNombre().equalsIgnoreCase(paisEliminado)) {
                paisesIt.remove();
                esta = true;
            }
        }
        if (!esta) {
            System.out.println("El pais no esta en el conjunto\n");
        }
    }

    public void ordenarPorNombre(HashSet<Pais> mi) {
        ArrayList<Pais> listaPaises = new ArrayList<>(mi);
        listaPaises.sort(Comparators.compareNombre);
        System.out.println("NOMBRE");
        for (Pais aux : listaPaises) {
            System.out.println(aux);
        }
        System.out.println("---------\n");
    }

    public void mostrar(HashSet<Pais> mi) {
        System.out.println("------------------------");
        System.out.println("Los paises son:");
        mostrarPais(mi);
        System.out.println("------------------------");
        System.out.println("Los paises ordenados alfabeticamente son:");
        ordenarPorNombre(mi);
        System.out.println("------------------------");
        eliminarPais(mi);
        mostrarPais(mi);
    }
}
