/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.ClaseEntidad;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ClaseServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList<ClaseEntidad> cargarArray() {
        //ArrayList<ClaseEntidad> miArray = new ArrayList<ClaseEntidad>();
        //Convencion de nombrado despues de java 7.0
        ArrayList<ClaseEntidad> miArrayList = new ArrayList();
        for (int i = 1; i < 4; i++) {
            System.out.println("------Objeto " + i + "-------");
            ClaseEntidad miEntidad = crearObjeto();
            miArrayList.add(miEntidad);
        }
        return miArrayList;
    }

    public ClaseEntidad crearObjeto() {
        ClaseEntidad miEntidad = new ClaseEntidad();
        System.out.println("Ingrese dato atributo1:");
        miEntidad.setAtributo1(leer.next());
        System.out.println("Ingrese dato atributo2:");
        miEntidad.setAtributo2(leer.nextInt());
        System.out.println("Ingrese dato atributoX:");
        miEntidad.setAtributoX(leer.nextDouble());
        return miEntidad;
    }

    public void mostrar(ArrayList<ClaseEntidad> miArrayList) {
        System.out.println("------ Imprime ArrayList toString --------- ");
        System.out.println(miArrayList.toString());
        System.out.println("\n------ Imprime ArrayList For Each --------- ");
        //ventaja  no necesitamos saber cual es el limite de la lista para recorrerla . 
        //Es decir no tenemos porque acceder al método size
        // El i es nombre que recibe la variable o referencia local, con la que va a operar el bucle. "variable temporal"
        for (ClaseEntidad i : miArrayList) {
            System.out.println(i);
        }
    }

    public void buscar(ArrayList<ClaseEntidad> miArrayList) {
        System.out.println("\n----------Ingrese el dato a buscar----------");
        String datoBuscar = leer.next();
        int cont = 0;
        int posicion = 0;
        System.out.println("----------FOR EACH----------");
        for (ClaseEntidad i : miArrayList) {
            if (i.getAtributo1().equalsIgnoreCase(datoBuscar)) {
                System.out.println("Elemento encontrado: " + datoBuscar + " en la posicion: " + posicion);
                cont++;
            }
            posicion++;
        }
        if (cont == 0) {
            System.out.println("No existe el dato");
        }
    }
}
