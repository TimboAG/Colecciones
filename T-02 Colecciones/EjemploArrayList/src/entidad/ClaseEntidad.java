/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Usuario
 */
public class ClaseEntidad {

    private String atributo1;
    private int atributo2;
    private double atributoX;

    public ClaseEntidad() {
    }

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public int getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    public double getAtributoX() {
        return atributoX;
    }

    public void setAtributoX(double atributoX) {
        this.atributoX = atributoX;
    }

    @Override
    public String toString() {
        return "ClaseEntidad{" + "atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributoX=" + atributoX + '}';
    }

}
