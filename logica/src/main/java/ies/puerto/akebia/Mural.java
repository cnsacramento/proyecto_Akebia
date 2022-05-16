package ies.puerto.akebia;

import java.util.ArrayList;

/**
 * @author Alberto Hernandez Medina y Christian Novo Sacramento
 * Clase que contiene todos lo metodo y datos del Mural
 */
public class Mural {

    private ArrayList<Lista> listas = new ArrayList<>();
    private ArrayList<Supermercado> supermercados = new ArrayList<>();

    /**
     * Constructor por defecto sin parametros
     */
    public Mural(){}

    /* METODOS */

    /**
     * Metodo que agrega una Lista al Mural
     * @param lista la lista a aniadir
     * @return true si la operacion se llevo a cabo con exito
     */
    public boolean agregarLista(Lista lista){
        if (lista == null) return false;
        listas.add(lista);
        return true;
    }

    /**
     * Metodo que permite eliminar una lista
     */
    public boolean eliminarLista(Lista lista) {
        if (lista == null) return false;
        listas.remove(lista);
        return true;
    }

    /**
     * Metodo que permite ver todas las listas disponibles
      */
    public String verListas(){
        return listas.toString();
    }

    /**
     * Metodo que permite agregar un supermercado
     */
    public boolean agregarSupermercado(Supermercado mercado){
        if(mercado == null) return false;
        supermercados.add(mercado);
        return true;
    }

    /**
     * Metodo que permite eliminar un Supermercado de los disponibles
     */
    public boolean eliminarSupermercado(Supermercado mercado){
        if(mercado == null) return false;
        supermercados.remove(mercado);
        return true;
    }

    /**
     * Ver todos los supermercados disponibles
     */
    public void verSupermercados(){}

    /**
     * Metodo que permite compartir una lista o varias listas
     */
    public void compartirLista(){}

    /* GETTERS Y SETTERS */

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
