package Entidad;

import java.util.ArrayList;

public class Perros {

    private ArrayList<String> perros;

    public Perros() {
    }

    public Perros(ArrayList<String> perros) {
        this.perros = perros;
    }

    public ArrayList<String> getPerros() {
        return perros;
    }

    public void setPerros(ArrayList<String> perros) {
        this.perros = perros;
    }

    @Override
    public String toString() {
        return "perros=" + perros;
    }
}
