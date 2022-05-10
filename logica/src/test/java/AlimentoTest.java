import ies.puerto.akebia.Alimento;
import ies.puerto.akebia.Categoria;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AlimentoTest {


    Alimento alimento;
    @Before
    public void before() {

        if(alimento == null) {
            alimento = new Alimento();
        }
    }

    @Test
    public void constructorVacioTest() {

        Assert.assertNotNull("El alimento esta vacio",alimento);
    }

    @Test
    public void constructorDosParametrosTest() {

        alimento = new Alimento("SUPERMERCADO",12, Categoria.CARNES);
    }
}
