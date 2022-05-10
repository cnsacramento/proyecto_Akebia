import ies.puerto.akebia.Categoria;
import org.junit.jupiter.api.*;

public class CategoriaTest {

    @Test
    public void categoriaTest() {
        Assertions.assertNotNull(Categoria.CARNES, "Categoria es nulo");
    }
}
