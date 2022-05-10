import ies.puerto.akebia.Alimento;
import ies.puerto.akebia.Supermercado;
import org.junit.jupiter.api.*;

import java.util.HashMap;

public class SupermercadoTest {

    Supermercado supermercado;

    @Test
    public void constructorVacioTest() {
        supermercado = new Supermercado();
        Assertions.assertNotNull(supermercado, "El supermercado es nulo");
    }

    @Test
    public void constructorCon1ParametroTest() {
        supermercado = new Supermercado("SUPERMERCADO");
        Assertions.assertNotNull(supermercado, "El supermercado es nulo");
    }

    @Test
    public void constructorCon3ParametrosTest() {
        HashMap<Integer, Alimento> listaAlimentos = new HashMap<>();
        supermercado = new Supermercado("HOLA",listaAlimentos);
        Assertions.assertNotNull(supermercado, "El supermercado es nulo");
    }
}
