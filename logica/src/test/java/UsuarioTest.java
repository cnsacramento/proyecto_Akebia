import ies.puerto.akebia.Usuario;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {

    Usuario usuario;

    @Before
    public void Usuario() {

        if(usuario == null) {
            usuario = new Usuario();
        }
    }

    @Test
    public void constructorVacioTest() {

        Assert.assertNotNull("El usuario es nulo", usuario);
    }

    @Test
    public void constructor3parametrosTest() {

        usuario = new Usuario("USUARIO", "EMAIL", "CONTRASENIA");
        Assert.assertNotNull("El usuario es nulo", usuario);
    }


}
