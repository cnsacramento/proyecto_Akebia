package ies.puerto.akebia;

/**
 * @author Alberto Hernandez Medina y Christian Novo Sacramento
 * Clase que contiene todos lo metodo y datos del usuario
 */
public class Usuario {

    private int id;
    private String alias;
    private String email;
    private String contrasenia;

    /**
     * Constructor por defecto sin parametros
     */
    public Usuario(){}

    /**
     * Constructor que recibe 3 parametros
     * @param alias del usuario
     * @param email del usuario
     * @param contrasenia del usuario
     */
    public Usuario(String alias, String email, String contrasenia) {
        this.alias = alias;
        this.email = email;
        this.contrasenia = contrasenia;
    }

    //Metodos

    /**
     * Metodo que sirve para iniciar sesion
     */
    public void iniciarSesion(){}

    /**
     * Metodo que permite ver el perfil del usuario
     */
    public void verPerfil(){}

    /**
     * Metodo que permite cambiar el alias
     */
    public void cambiarAlias(){}

    /**
     * Metodo que permite cambiar el email
     */
    public void cambiarEmail(){}

    /**
     * Metodo que permite cambiar la contrasenia
     */
    public void cambiarContrasenia(){}

    /**
     * Metodo que permite cambiar la foto
     */
    public void cambiarFoto(){}


    // Getters y setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
}
