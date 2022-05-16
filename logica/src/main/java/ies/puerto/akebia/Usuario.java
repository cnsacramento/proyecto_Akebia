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
    private String foto;

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
    public void iniciarSesion(String email, String contrasenia){

    }
    **/

    /**
     * Metodo que permite ver el perfil del usuario
     */
    public String verPerfil(){
        String respuesta = foto + "\n" + "Nombre: " + alias + "\n" +
                "Email: " + email;
        return respuesta;
    }

    /**
     * Metodo que permite cambiar la configuracion
    public void cambiarConfiguracion() {
        cambiarAlias();
        cambiarEmail();
        cambiarContrasenia();
        cambiarFoto();
    }*/

    /**
     * Metodo que permite cambiar el alias
     * @param alias Alias del usuario
     * @return True si se cambia el alias y False si no se cambia
     */
    public boolean cambiarAlias(String alias){

        if(alias.isEmpty() || alias.equals(this.alias)) {
            return false;
        }else {
            setAlias(alias);
            return true;
        }
    }

    /**
     * Metodo que permite cambia el email
     * @param contrasenia Contrasenia actual de la cuenta
     * @param nuevoEmail Nuevo email para el usuario
     * @return True si se cambia el email y False si no se cambia el email
     */
    public boolean cambiarEmail(String contrasenia, String nuevoEmail){

        if(contrasenia.equals(this.contrasenia) && nuevoEmail != null) {
            setEmail(nuevoEmail);
            return true;
        }else {
            return false;
        }
    }

    /**
     * Metodo que permite cambiar la contrasenia
     * @param viejaContrasenia Antigua contrasenia
     * @param nuevaContrasenia Nueva contrasenia
     * @return True si la contrasenia antigua coincide con la contrasenia actual
     */
    public boolean cambiarContrasenia(String viejaContrasenia, String nuevaContrasenia){

        if(viejaContrasenia.equals(contrasenia) && nuevaContrasenia != null) {
            setContrasenia(nuevaContrasenia);
            return true;
        }else {
            return false;
        }
    }

    /**
     * Metodo que permite cambiar la foto
     * @param ruta Ruta de la imagen
     * @return True si se cambia la foto y False si no se cambia
     */
    public boolean cambiarFoto(String ruta){

        if(!ruta.isEmpty()) {
            setFoto(ruta);
            return true;
        }else {
            return false;
        }
    }


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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
