package ies.puerto.akebia;

import java.util.Date;

public class Lista {

    private int id;
    private HashMap<Integer,Alimento> lista;
    private Date fecha;

    /**
     * Constructor por defecto sin parametros
     */
    public Lista(){}

    //Metodos

    /**
     * Metodo que permite aniadir un alimento a la lista
     */
    public void aniadirAlimento(){}

    /**
     * Metodo que permite eliminar un alimento de la lista
     */
    public void eliminarAlimento(){}

    /**
     * Metodo que permite ver los alimentos de la lista
     */
    public void verLista(){}

    //Getters y Setters


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, Alimento> getLista() {
        return lista;
    }

    public void setLista(HashMap<Integer, Alimento> lista) {
        this.lista = lista;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
