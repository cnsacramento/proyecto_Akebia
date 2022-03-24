package ies.puerto.akebia;

import java.util.ArrayList;

/**
 * @author Alberto Hernandez Medina y Christian Novo Sacramento
 * Clase que contiene todos lo metodo y datos del Mural
 */
public class Mural {

    private ArrayList<Lista> listas;
    private ArrayList<Supermercado> supermercados;

    /**
     * Constructor por defecto sin parametros
     */
    public Mural(){}

    //Metodos

    /**
     * Metodo que permite agregar las listas
     */
    public void agregarLista(){}

    /**
     * Metodo que permite eliminar una lista
     */
    public void eliminarLista() {}

    /**
     * Metodo que permite ver todas las listas disponibles
      */
    public void verListas(){}

    /**
     * Metodo que permite agregar un supermercado
     */
    public void agregarSupermercado(){}

    /**
     * Metodo que permite eliminar un Supermercado de los disponibles
     */
    public void eliminarSupermercado(){}

    /**
     * Ver todos los supermercados disponibles
     */
    public void verSupermercados(){}

    //Getters y setters

    public ArrayList<Lista> getListas() {
        return listas;
    }

    public ArrayList<Supermercado> getSupermercados() {
        return supermercados;
    }

    public void setSupermercados(ArrayList<Supermercado> supermercados) {
        this.supermercados = supermercados;
    }

    public void setListas(ArrayList<Lista> listas) {
        this.listas = listas;
    }
}
