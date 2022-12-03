package servicio;

import entidad.Cine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class CineServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<Cine> peliculas() {
        ArrayList<Cine> miPelicula = new ArrayList();
        String opc2;
        int opc = 1;
        while (opc != 0) {
            Cine miCine = crearCine();
            miPelicula.add(miCine);
            System.out.println("----------------------------");
            System.out.println("Quiere ingresar otra pelicula?");
            opc2 = leer.next();
            if ("S".equals(opc2) || "s".equals(opc2) || "Si".equals(opc2) || "si".equals(opc2)) {
                opc = 1;
            } else {
                opc = 0;
            }
        }
        return miPelicula;
    }

    public Cine crearCine() {
        Cine miCine = new Cine();
        String titulo;
        String director;
        double duracion;
        System.out.println("Ingrese el titulo de la pelicula:");
        titulo = leer.next();
        System.out.println("Ingrese el director de la pelicula:");
        director = leer.next();
        System.out.println("Ingrese la duracion la pelicula:");
        duracion = leer.nextDouble();
        miCine.setDirector(director);
        miCine.setDuracion(duracion);
        miCine.setTitulo(titulo);
        return miCine;
    }

    public void mostrarPeliculas(ArrayList<Cine> m) {
        System.out.println(m);
    }

    public void mostrarPeliculasMayorDuracion(ArrayList<Cine> m) {
        ArrayList<Cine> mayor = m;
        int cont = 0;
        for (Cine nuevoCine : mayor) {
            if (nuevoCine.getDuracion() >= 1.0) {
                System.out.println("Titulo: " + nuevoCine.getTitulo());
                System.out.println("Director: " + nuevoCine.getDirector());
                System.out.println("Duracion: " + nuevoCine.getDuracion());
                System.out.println("-------------------------------------------");
            } else {
                cont = cont + 1;
            }
        }
        if (cont == mayor.size()) {
            System.out.println("-------------------------------------------");
            System.out.println("No hay peliculas que duren mas de una hora");
        }
    }

    public void ordenadasMayorAMenor(ArrayList<Cine> m) {
        ArrayList<Cine> mayor = m;
        Collections.sort(mayor, new Comparator<Cine>() {
            @Override
            public int compare(Cine p1, Cine p2) {
                if (p1.getDuracion() < p2.getDuracion()) {
                    return 1;
                }
                if (p1.getDuracion() > p2.getDuracion()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(mayor);
    }

    public void ordenadasMenorAMayor(ArrayList<Cine> m) {
        ArrayList<Cine> mayor = m;
        Collections.sort(mayor, new Comparator<Cine>() {
            @Override
            public int compare(Cine p1, Cine p2) {
                if (p1.getDuracion() > p2.getDuracion()) {
                    return 1;
                }
                if (p1.getDuracion() < p2.getDuracion()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println(mayor);
    }

    public void ordenadasTitulo(ArrayList<Cine> m) {
        ArrayList<Cine> titulo = m;
        Collections.sort(titulo, new Comparator<Cine>() {
            @Override
            public int compare(Cine p1, Cine p2) {
                return p1.getTitulo().compareTo(p2.getTitulo());
            }
        });
        System.out.println(titulo);
    }

    public void ordenadasDirector(ArrayList<Cine> m) {
        ArrayList<Cine> director = m;
        Collections.sort(director, new Comparator<Cine>() {
            @Override
            public int compare(Cine p1, Cine p2) {
                return p1.getDirector().compareTo(p2.getDirector());
            }
        });
        System.out.println(director);
    }

    public void mostrar(ArrayList<Cine> m) {
        System.out.println("Las peliculas ingresadas son:");
        mostrarPeliculas(m);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Las peliculas ordenadas por titulo alfabeticamente son:");
        ordenadasTitulo(m);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Las peliculas ordenadas por director alfabeticamente son:");
        ordenadasDirector(m);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Las peliculas ordenadas por Duracion (Menor a mayor)  son:");
        ordenadasMenorAMayor(m);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Las peliculas ordenadas por  Duracion (Mayor a menor) son:");
        ordenadasMayorAMenor(m);
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Las peliculas con duracion mayor a 1 hora:");
        mostrarPeliculasMayorDuracion(m);
    }
}
