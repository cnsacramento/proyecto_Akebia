import ies.puerto.akebia.Alimento;
import ies.puerto.akebia.Categoria;
import org.junit.jupiter.api.*;

public class AlimentoTest {


    public static final String MANZANA = "Manzana";
    public static final double PRECIO = 10.5;
    public static final Categoria CATEGORIA = Categoria.CARNES;
    Alimento alimento;
    @BeforeEach
    public void before() {

        if(alimento == null) {
            alimento = new Alimento(MANZANA, PRECIO, CATEGORIA);
        }
    }

    @Test
    public void constructorVacioTest() {

        Assertions.assertNotNull(alimento, "El alimento esta vacio");
    }

    @Test
    public void constructorTresParametrosTest() {

        alimento = new Alimento(MANZANA,PRECIO, CATEGORIA);
    }

    @Test
    public void gettersTest() {

        alimento = new Alimento("Manzana", 10.5, Categoria.CARNES);
        Assertions.assertEquals("Manzana",alimento.getNombre(),"No corresponde el nombre");
        Assertions.assertEquals(10.5,alimento.getPrecio(),"No es el mismo precio");
        Assertions.assertEquals(Categoria.CARNES, alimento.getCategoria(), "No corresponde la categoria");
    }

    @Test
    public void settersTest() {

        alimento.setNombre("Platano");
        Assertions.assertEquals("Platano",alimento.getNombre(), "No corresponde el cambio de nombre");
        alimento.setPrecio(12.6);
        Assertions.assertEquals(12.6,alimento.getPrecio(),"No corresponde con el nuevo precio");
        alimento.setCategoria(Categoria.FRUTAS);
        Assertions.assertEquals(Categoria.FRUTAS, alimento.getCategoria(), "No corresponde con la nueva categoria");
        alimento.setId(5);
        Assertions.assertEquals(5, alimento.getId(), "No se corresponde con el nuevo ID");
    }
}
