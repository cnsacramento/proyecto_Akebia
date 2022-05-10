package ies.puerto.akebia;

/**
 * @author Alberto Hernandez Medina y Christian Novo Sacramento
 * Clase que contiene todos lo metodo y datos del alimento
 */
public class Alimento {

    private int id;
    private String nombre;
    private double precio;
    private Categoria categoria;

    /**
     * Constructor por defecto sin parametros
     */
    public Alimento(){}

    /**
     * Constructor que recibe 3 parametros
     * @param nombre del alimento
     * @param precio del alimento
     * @param categoria a la cual pertenece el alimento
     */
    public Alimento(String nombre, double precio, Categoria categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
*/
}
