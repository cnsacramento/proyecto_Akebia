import ies.puerto.akebia.Alimento;
import ies.puerto.akebia.Categoria;
import ies.puerto.akebia.Lista;
import org.junit.jupiter.api.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ListaTest {

    public static final Date FECHA = new Date();
    public static final HashMap<Alimento, Integer> LISTA = new HashMap<Alimento, Integer>();
    public static final Alimento ALIMENTO = new Alimento("zanahoria", 3.5, Categoria.VERDURAS);
    Lista lista;

    @BeforeEach
    public void before() {

        if(lista == null) lista = new Lista();
    }

    @Test
    public void constructorVacioTest() {

        Assertions.assertNotNull(lista, "La lista es nula");
    }

    @Test
    public void aniadirAlimentoTest() {

        Alimento alimento = new Alimento("zanahoria", 3.5, Categoria.VERDURAS);
        Assertions.assertTrue(lista.aniadirAlimento(alimento, 1));
        lista.getLista().put(alimento, 1);
        Assertions.assertTrue(lista.aniadirAlimento(alimento, 1));
    }

    @Test
    public void aniadirAlimentoFalseTest() {

        Assertions.assertFalse(lista.aniadirAlimento(null, 1));
    }

    @Test
    public void eliminarAlimentoTest() {
        lista.getLista().put(ALIMENTO,1);
        Assertions.assertTrue(lista.eliminarAlimento(ALIMENTO, 1));
        lista.getLista().put(ALIMENTO,2);
        Assertions.assertTrue(lista.eliminarAlimento(ALIMENTO, 1));
        Assertions.assertTrue(lista.eliminarAlimento(ALIMENTO, 5));
    }

    @Test
    public void eliminarAlimentoFalseTest() {
        lista.getLista().put(ALIMENTO,1);
        Assertions.assertFalse(lista.eliminarAlimento(ALIMENTO, -1));
        Assertions.assertFalse(lista.eliminarAlimento(null, 1));
    }


    @Test
    public void verListaTest() {

        lista.setLista(LISTA);
        Assertions.assertEquals(LISTA.toString(), lista.verLista(), "No coincide los toString");
    }

    @Test
    public void gettersTest() {

        lista.setLista(LISTA);
        Assertions.assertEquals(LISTA, lista.getLista(), "Lista no coincide GET");
        lista.setFecha(FECHA);
        Assertions.assertEquals(FECHA, lista.getFecha(), "La fecha no coincide GET");
        lista.setId(1);
        Assertions.assertEquals(1, lista.getId(), "El id no coincide GET");
    }

    @Test
    public void settersTest() {

        HashMap<Alimento, Integer> test = new HashMap<>(Map.of(new Alimento("queso", 5.4, Categoria.LACTEOS), 1));
        lista.setLista(test);
        Assertions.assertEquals(test, lista.getLista(), "La lista no coincide SET");
        lista.setFecha(FECHA);
        Assertions.assertEquals(FECHA, lista.getFecha(), "La fecha no coincide GET");
        lista.setId(1);
        Assertions.assertEquals(1, lista.getId(), "El id no coincide GET");
    }


}
