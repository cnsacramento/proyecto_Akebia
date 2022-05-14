package ies.puerto.akebia;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author Alberto Hernandez Medina y Christian Novo Sacramento
 * Clase que contiene todos lo metodo y datos del Supermercado
 */
public class Supermercado {

    private int id;
    private String nombre;
    private HashMap<Integer,Alimento> alimentos;
    private static int alimentoId = 0;

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
        this.alimentos = listaAlimentos;
    }

    //Metodos

    /**
     * Metodo que agrega un alimento
     * @param alimento Alimento que se va a agregar
     * @return True si se agrega el alimento y False si no se agrega el alimento
     */
    public boolean aniadirAlimento(Alimento alimento){

        if(alimento == null) return false;
        boolean existe = alimentos.containsValue(alimento);
        if(!existe) {
            alimentos.put(alimentoId++, alimento);
            return true;
        }else {
            return false;
        }

    }

    /**
     * Metodo que permite eliminar alimentos al supermercado
     */
    public boolean eliminarAlimento(Alimento alimento){

        if(alimento == null) return false;
        boolean existe = alimentos.containsValue(alimento);
        if(existe) {
            alimentos.entrySet().stream()
                    .filter(a -> alimento.equals(a.getValue()))
                    .findFirst()
                    .map(Map.Entry::getKey);
            alimentos.remove(id);
           return true;
        }else {
            return false;
        }
    }

    //Getters y Setters

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

    public HashMap<Integer, Alimento> getAlimentos() {
        return alimentos;
    }

    public void setAlimentos(HashMap<Integer, Alimento> alimentos) {
        this.alimentos = alimentos;
    }

}
