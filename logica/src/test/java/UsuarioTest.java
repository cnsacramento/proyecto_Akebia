import ies.puerto.akebia.Usuario;
import org.junit.jupiter.api.*;

public class UsuarioTest {

    public static final String USUARIO = "usuario";
    public static final String EMAIL = "usuario@gmail.com";
    public static final String CONTRASENIA = "54321usuario";
    Usuario usuario;

    @BeforeEach
    public void Usuario() {

        if(usuario == null) {
            usuario = new Usuario(USUARIO, EMAIL, CONTRASENIA);
        }
    }

    @Test
    public void constructorVacioTest() {

        Assertions.assertNotNull(usuario, "El usuario es nulo");
    }

    @Test
    public void constructor3parametrosTest() {

        usuario = new Usuario("USUARIO", "EMAIL", "CONTRASENIA");
        Assertions.assertNotNull(usuario, "El usuario es nulo");
    }

    @Test
    public void cambiarAliasTest() {

        Assertions.assertTrue(usuario.cambiarAlias("alias"), "Fallo al comprobar el alias");
    }

    @Test
    public void cambiarAliasFalseTest() {

        Assertions.assertFalse(
            usuario.cambiarAlias(USUARIO), "Fallo al comprobar alias IGUAL"
        );

        Assertions.assertFalse(
                usuario.cambiarAlias(""), "Fallo al comprobar alias NULL"
        );
    }

    @Test
    public void cambiarEmailTest() {

        Assertions.assertTrue(usuario.cambiarEmail(CONTRASENIA, "nuevoEmail"),
                "fallo al comprobar CONTRASENIA o EMAIL");
    }

    @Test
    public void cambiarEmailFalseTest() {

        Assertions.assertFalse(
                usuario.cambiarEmail("contrasenia", "alias"),
                "Fallo al comprobar contrasenia DISTINTA"
        );
        Assertions.assertFalse(
                usuario.cambiarEmail(CONTRASENIA, null),
                "Fallo al comprobar contrasenia NULA"
        );
    }

    @Test
    public void cambiarContraseniaTest() {

        Assertions.assertTrue(
                usuario.cambiarContrasenia(CONTRASENIA,"nueva"),
                "Fallo al cambiar contrasenia");
    }

    @Test
    public void cambiarContraseniaFalseTest() {

        Assertions.assertFalse(
                usuario.cambiarContrasenia("vieja","nueva"),
                "Fallo al comprobar vieja contrasenia");
        Assertions.assertFalse(
                usuario.cambiarContrasenia(CONTRASENIA,null),
                "Fallo al comprobar si la nueva contrasenia es nula");
    }

    @Test
    public void cambiarFotoTest() {

        Assertions.assertTrue(usuario.cambiarFoto("ruta") , "Fallo al cambiar la foto");
    }

    @Test
    public void cambiarFotoFalseTest() {

        Assertions.assertFalse(usuario.cambiarFoto(""), "La foto no debe ser nula");
    }

    @Test
    public void gettersTest() {

        usuario.setId(1);
        Assertions.assertEquals(1, usuario.getId(), "Id GET incorrecto");
        Assertions.assertEquals(USUARIO,usuario.getAlias(),"Alias GET incorrecto");
        Assertions.assertEquals(EMAIL, usuario.getEmail(), "Email GET incorrecto");
        Assertions.assertEquals(CONTRASENIA,usuario.getContrasenia(),"Contrasenia  GET incorrecta");
        usuario.setFoto("/home/usuario.png");
        Assertions.assertEquals("/home/usuario.png", usuario.getFoto(), "Foto GET incorrecta");
    }

    @Test
    public void settersTest() {

        usuario.setId(1);
        Assertions.assertEquals(1, usuario.getId(), "Id SET incorrecto");
        usuario.setAlias("alias");
        Assertions.assertEquals("alias",usuario.getAlias(), "Alias SET incorrecto");
        usuario.setEmail("juanito@gmail.com");
        Assertions.assertEquals("juanito@gmail.com", usuario.getEmail(),"Email SET incorrecto");
        usuario.setContrasenia("12345usuario");
        Assertions.assertEquals("12345usuario",usuario.getContrasenia(), "Contrasenia SET incorrecta");
        usuario.setFoto("/home/user.png");
        Assertions.assertEquals("/home/user.png", usuario.getFoto(), "Foto SET incorrecta");
    }




}
