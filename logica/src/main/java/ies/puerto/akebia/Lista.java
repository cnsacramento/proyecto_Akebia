package ies.puerto.akebia;

import java.util.Date;
import java.util.HashMap;

/**
 * @author Alberto Hernandez Medina y Christian Novo Sacramento
 * Clase que contiene todos lo metodo y datos de la lista
 */
public class Lista {

    private int id;
    private HashMap<Alimento,Integer> lista = new HashMap<Alimento,Integer>();
    private Date fecha = new Date();;

    /**
     * Constructor por defecto sin parametros
     */
    public Lista(){}

    //Metodos

    /**
     * Metodo que agrega un alimento a la lista
     * @param alimento Alimento que se agrega
     * @param cantidad Cantidad de alimento que se agrega a la lista
     * @return True si se agrega el alimento y False si no se agrega el alimento
     */
    public boolean aniadirAlimento(Alimento alimento, int cantidad){

        if(alimento == null) return false;
        if(lista.containsKey(alimento)) {
            lista.put(alimento,lista.get(alimento) + cantidad);
            return true;
        }else {
            lista.put(alimento, cantidad);
            return true;
        }

    }

    /**
     * Metodo que permite eliminar alimentos por cantidad
     * @param alimento Alimento que se quiere eliminar
     * @param cantidad Cantidad del alimento que se quiere eliminar
     * @return True si se elimina el alimento y False si no se elimina el alimento
     */
    public boolean eliminarAlimento(Alimento alimento, int cantidad) {

        if(lista.containsKey(alimento)) {
            if(cantidad > lista.get(alimento) || cantidad == lista.get(alimento)) {
                lista.remove(alimento);
            }else if(cantidad < 0){
                return false;
            }else {
                lista.put(alimento, lista.get(alimento) - cantidad);
            }
            return true;
        }else {
            return false;
        }
    }

    /**
     * Metodo que permite ver los alimentos de la lista
     */
    public String verLista(){

        return getLista().toString();
    }

    //Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Alimento, Integer> getLista() {
        return lista;
    }

    public void setLista(HashMap<Alimento, Integer> lista) {
        this.lista = lista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

}
