import ies.puerto.akebia.Mural;
import org.junit.jupiter.api.*;

public class MuralTest {

    Mural mural;

    @BeforeEach
    public void before() {

        if(mural == null) {
            mural = new Mural();
        }
    }

    @Test
    public void constructorVacioTest() {

        Assertions.assertNotNull(mural, "El mural es nulo");
    }


}
