import ies.puerto.akebia.Alimento;
import ies.puerto.akebia.Categoria;
import org.junit.jupiter.api.*;

public class AlimentoTest {


    Alimento alimento;
    @BeforeEach
    public void before() {

        if(alimento == null) {
            alimento = new Alimento();
        }
    }

    @Test
    public void constructorVacioTest() {

        Assertions.assertNotNull(alimento, "El alimento esta vacio");
    }

    @Test
    public void constructorDosParametrosTest() {

        alimento = new Alimento("SUPERMERCADO",12, Categoria.CARNES);
    }
}
