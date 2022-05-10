import ies.puerto.akebia.Categoria;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class CategoriaTest {

    @Test
    public void categoriaTest() {
        Assert.assertNotNull("Categoria es nulo", Categoria.CARNES);
    }
}
