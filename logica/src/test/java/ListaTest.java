import ies.puerto.akebia.Lista;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ListaTest {

    Lista lista;

    @Before
    public void before() {

        if(lista == null) lista = new Lista();
    }

    @Test
    public void constructorVacioTest() {

        Assert.assertNotNull("La lista es nula",lista);
    }
}
