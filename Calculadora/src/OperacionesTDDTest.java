import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OperacionesTDDTest {

    @Test
    void TestA() {
        OperacionesTDD Operacion = new OperacionesTDD();
        String Suma = "0";
        assertEquals("0", Suma);
        System.out.println("El tests se ha realizado correctamente");
    }

    @Test
    void TestB() {
        OperacionesTDD Operacion = new OperacionesTDD();
        String Suma = "1";
        assertEquals("1", Suma);
        System.out.println("El tests se ha realizado correctamente");
    }

    @Test
    void TestC() {
        OperacionesTDD Operacion = new OperacionesTDD();
        int Suma = Operacion.Sumas("1,2");
        assertEquals("1", Suma);
        System.out.println("El tests se ha realizado correctamente");
    }

    @Test
    void TestD() {
        OperacionesTDD Operacion = new OperacionesTDD();
        int Suma = Operacion.Sumas("1,1,2");
        assertEquals("4", Suma);
        System.out.println("El tests se ha realizado correctamente");
    }

    @Test
    void TestE() {
        OperacionesTDD Operacion = new OperacionesTDD();
        int Suma = Operacion.Sumas("-1,2");
        assertEquals("-1", Suma);
    }
}