package ies.puerto.akebia;

import java.util.HashMap;

/**
 * @author Alberto Hernandez Medina y Christian Novo Sacramento
 * Clase que contiene todos lo metodo y datos del Supermercado
 */
public class Supermercado {

    private int id;
    private String nombre;
    private HashMap<Integer,Alimento> listaAlimentos;

    /**
     * Constructor por defecto sin parametros
     */
    public Supermercado(){}

    /**
     * Constructor con un parametro
     * @param nombre del supermercado
     */
    public Supermercado(String nombre) {}

    /**
     * Constructor con 2 parametros
     * @param nombre Nombre del supermercado
     * @param listaAlimentos Lista con los alimentos del supermercado
     */
    public Supermercado(String nombre, HashMap<Integer,Alimento> listaAlimentos) {
        this.nombre = nombre;
        this.listaAlimentos = listaAlimentos;
    }

    //Metodos

    /**
     * Metodo que permite aniadir alimentos al supermercado
     */
    public void aniadirAlimento(){}

    /**
     * Metodo que permite eliminar alimentos al supermercado
     */
    public void eliminarAlimento(){}

    //Getters y Setters

    /*
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashMap<Integer, Alimento> getListaAlimentos() {
        return listaAlimentos;
    }

    public void setListaAlimentos(HashMap<Integer, Alimento> listaAlimentos) {
        this.listaAlimentos = listaAlimentos;
    }

     */
}
