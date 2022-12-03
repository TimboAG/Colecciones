package servicio;

import entidad.Tienda;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TiendaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashMap<String, Double> crearTienda(Tienda miTienda) {
        HashMap miHash = new HashMap();
        int opc = 1;
        String opc2;
        while (opc != 0) {
            miTienda = crearProducto();
            miHash.put(miTienda.getProducto(), miTienda.getPrecio());
            System.out.println("Desea ingresar otro producto?");
            opc2 = leer.next();
            if ("S".equals(opc2) || "s".equals(opc2) || "Si".equals(opc2) || "si".equals(opc2)) {
                opc = 1;
            } else {
                opc = 0;
            }
        }
        return miHash;
    }

    public Tienda crearProducto() {
        Tienda miProducto = new Tienda();
        String producto;
        double precio;
        System.out.println("Ingrese producto");
        producto = leer.next();
        System.out.println("Ingrese su precio");
        precio = leer.nextDouble();
        miProducto.setProducto(producto);
        miProducto.setPrecio(precio);
        return miProducto;
    }

    public void mostrarProducto(HashMap<String, Double> mi) {
        System.out.println(mi);
    }

    public void buscarProducto(HashMap<String, Double> mi) {
        String producto;
        System.out.println("Ingrese el producto que desea buscar y borrar");
        producto = leer.next();
        Iterator miMaps = mi.keySet().iterator();
        while (miMaps.hasNext()) {
            if (miMaps.next().equals(producto)) {
                miMaps.remove();
                System.out.println("El producto se ha borrado exitosamente");
            } else {
                System.out.println("No existe el producto");
            }
        }
        System.out.println(mi);
    }  
   
}
