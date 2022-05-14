import ies.puerto.akebia.Alimento;
import ies.puerto.akebia.Categoria;
import ies.puerto.akebia.Supermercado;
import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.Map;

public class SupermercadoTest {

    public static final String SUPERMERCADO = "ALTEZA";
    public static final HashMap<Integer, Alimento> ALIMENTOS
            = new HashMap<>(Map.of(
            0, new Alimento("MANZANA",10.5, Categoria.GRASAS)
    ));
    public static final Alimento ALIMENTO = new Alimento("coco", 3.9, Categoria.FRUTAS);
    Supermercado supermercado;

    @BeforeEach
    public void before() {

        if(supermercado == null) {
            supermercado = new Supermercado(SUPERMERCADO,ALIMENTOS);
        }
    }

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

        HashMap<Integer, Alimento> alimentos = new HashMap<>();
        supermercado = new Supermercado("HOLA",alimentos);
        Assertions.assertNotNull(supermercado, "El supermercado es nulo");
    }

    @Test
    public void aniadirAlimentoTest() {

        Assertions.assertTrue(
                supermercado.aniadirAlimento(ALIMENTO), "No se ha podido agregar el alimento");
    }

    @Test
    public void eliminarAlimentoTest() {

        Assertions.assertTrue(supermercado.eliminarAlimento(ALIMENTO), "No se puede eliminar el alimento");
    }

    @Test
    public void eliminarAlimentoFalseTest() {

        Assertions.assertFalse(supermercado.eliminarAlimento(null), "Alimento NULO no eliminado");
        Alimento alimento = new Alimento("chuleta",5.6,Categoria.CARNES);
        Assertions.assertFalse(supermercado.eliminarAlimento(alimento), "Alimento no existente eliminado");
    }

    @Test
    public void aniadirAlimentoFalseTest() {

        Assertions.assertFalse(supermercado.aniadirAlimento(null), "No puede haber alimentos NULOS");
        supermercado.aniadirAlimento(ALIMENTO);
        Assertions.assertFalse(supermercado.aniadirAlimento(ALIMENTO));
    }


    @Test
    public void gettersTest() {

        Assertions.assertEquals(SUPERMERCADO, supermercado.getNombre(), "SUPERMERCADO no esperado");
        Assertions.assertEquals(ALIMENTOS,supermercado.getAlimentos(),"SUPERMERCADO no correspondido");
    }

    @Test
    public void settersTest() {

        supermercado.setId(1);
        Assertions.assertEquals(1, supermercado.getId(), "ID no esperado");
        supermercado.setNombre("HIPERDINO");
        Assertions.assertEquals("HIPERDINO", supermercado.getNombre(), "SUPERMERCADO no esperado");
        HashMap<Integer, Alimento> alimentos2
                = new HashMap<>(Map.of(
                1, new Alimento("MANZANA",10.5, Categoria.GRASAS)
        ));
        supermercado.setAlimentos(alimentos2);
        Assertions.assertEquals(alimentos2, supermercado.getAlimentos(), "Alimentos no correspondidos");
    }

}
