package Servicio;

import Entidad.Perros;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class PerroServicio {

    public Perros crearPerro() {
        Perros miPerro = new Perros();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> perro1 = new ArrayList();
        String perro2;
        String opc2;
        int opc = 1;
        do {
            System.out.println("---------------------------------");
            System.out.println("Ingrese la raza del perro");
            perro2 = leer.next();
            perro1.add(perro2);
            System.out.println("Desea ingresar otra raza? S - N");
            opc2 = leer.next();
            if ("S".equals(opc2) || "s".equals(opc2) || "Si".equals(opc2) || "si".equals(opc2)) {
                opc = 1;
            } else {
                opc = 0;
            }
        } while (opc != 0);
        miPerro.setPerros(perro1);
        return miPerro;
    }

    public void mostrar(Perros p) {
        System.out.println("---------------------------------");
        System.out.println("Las razas de perros ingresadas son:");
        System.out.println(p.toString());
        buscarPerro(p);
    }

    public String buscarPerro(Perros p) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String perro2;
        System.out.println("---------------------------------");
        System.out.println("Ingrese un perro a buscar");
        perro2 = leer.next();
        Iterator<String> perro3 = p.getPerros().iterator();
        while (perro3.hasNext()) {
            if (perro3.next().equals(perro2)) {
                System.out.println("La raza de perro se encuentra en la lista y sera borrada, la nueva lista es:");
                perro3.remove();                            
                System.out.println(p.toString());
                break;
            } else {
                System.out.println("La raza de perro no se encuentra");
            }
        }
        return perro2;
    }
}
