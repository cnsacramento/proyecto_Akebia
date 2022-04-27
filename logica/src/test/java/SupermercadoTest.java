import ies.puerto.akebia.Alimento;
import ies.puerto.akebia.Supermercado;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class SupermercadoTest {

    Supermercado supermercado;

    @Test
    public void constructorVacioTest() {
        supermercado = new Supermercado();
        Assert.assertNotNull("El supermercado es nulo",supermercado);
    }

    @Test
    public void constructorCon1ParametroTest() {
        supermercado = new Supermercado("SUPERMERCADO");
        Assert.assertNotNull("El supermercado es nulo",supermercado);
    }

    @Test
    public void constructorCon3ParametrosTest() {
        HashMap<Integer, Alimento> listaAlimentos = new HashMap<>();
        supermercado = new Supermercado("HOLA",listaAlimentos);
        Assert.assertNotNull("El supermercado es nulo",supermercado);
    }
}
