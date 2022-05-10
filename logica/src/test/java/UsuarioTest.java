import ies.puerto.akebia.Usuario;
import org.junit.jupiter.api.*;

public class UsuarioTest {

    Usuario usuario;

    @BeforeEach
    public void Usuario() {

        if(usuario == null) {
            usuario = new Usuario();
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


}
