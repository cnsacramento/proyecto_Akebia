import ies.puerto.akebia.Lista;
import ies.puerto.akebia.Mural;
import ies.puerto.akebia.Supermercado;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

public class MuralTest {

    Mural mural;
    public static final Lista LISTA = new Lista();
    public static final Supermercado SUPER = new Supermercado();

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

    @Test
    public void agregarListaTest(){
        Assertions.assertTrue(mural.agregarLista(LISTA), "La lista agregada es nula");
    }

    @Test
    public void agregarListaTestFalse(){
        Assertions.assertFalse(mural.agregarLista(null), "No se deberia agregar una lista nula");
    }

    @Test
    public void eliminarListaTest(){
        mural.getListas().add(LISTA);
        Assertions.assertTrue(mural.eliminarLista(LISTA), "La lista a eliminar no existe");
    }

    @Test
    public void eliminarListaTestFalse(){
        Assertions.assertFalse(mural.eliminarLista(null), "No puedes eliminar una lista que no se ha agregado");
    }

    @Test
    public void agregarSuperTest(){
        Assertions.assertTrue(mural.agregarSupermercado(SUPER), "El supermercado agregado es nulo");
    }

    @Test
    public void agregarSuperTestFalse(){
        Assertions.assertFalse(mural.agregarSupermercado(null), "No se deberia agregar un supermercado nulo");
    }

    @Test
    public void eliminarSuperTest(){
        mural.getSupermercados().add(SUPER);
        Assertions.assertTrue(mural.eliminarSupermercado(SUPER), "El supermercado a eliminar no existe");
    }

    @Test
    public void eliminarSuperTestFalse(){
        Assertions.assertFalse(mural.eliminarSupermercado(null), "No puedes eliminar un supermercado que no se ha agregado");
    }

    @Test
    public void gettersSettersTest(){
        ArrayList<Lista> listas = new ArrayList<>(List.of(LISTA));
        mural.setListas(listas);
        Assertions.assertEquals(listas, mural.getListas(), "Las listas no coincide con el getter");
        ArrayList<Supermercado> supermercados = new ArrayList<>(List.of(SUPER));
        mural.setSupermercados(supermercados);
        Assertions.assertEquals(supermercados, mural.getSupermercados(), "Los supermercados no coincide con el getter");
    }
}
