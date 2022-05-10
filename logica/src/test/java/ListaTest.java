import ies.puerto.akebia.Lista;
import org.junit.jupiter.api.*;

public class ListaTest {

    Lista lista;

    @BeforeEach
    public void before() {

        if(lista == null) lista = new Lista();
    }

    @Test
    public void constructorVacioTest() {

        Assertions.assertNotNull(lista, "La lista es nula");
    }
}
