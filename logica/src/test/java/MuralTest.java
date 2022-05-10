import ies.puerto.akebia.Mural;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MuralTest {

    Mural mural;

    @Before
    public void before() {

        if(mural == null) {
            mural = new Mural();
        }
    }

    @Test
    public void constructorVacioTest() {

        Assert.assertNotNull("El mural es nulo",mural);
    }


}
