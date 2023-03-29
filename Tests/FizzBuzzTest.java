import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    void fizzBuzz_Calculo() {

        FizzBuzz test1 = new FizzBuzz();
        FizzBuzz test2 = new FizzBuzz();

        String pomelo1 = test1.FizzBuzz_Calculo(1);
        String pomelo2 = test2.FizzBuzz_Calculo(2);

        assertEquals("1", pomelo1);
        assertEquals("2", pomelo2);
        System.out.println("Se ha ejecutado correctamente el test.");
    }

    @Test
    void fizzBuzz_Calculo3() {
        FizzBuzz test3 = new FizzBuzz();

        String pomelo1 = test3.FizzBuzz_Calculo(3);

        assertEquals("Fizz", pomelo1);
        System.out.println("Se ha ejecutado correctamente el test");
    }

    @Test
    void fizzBuzz_Calculo4() {
        FizzBuzz test4 = new FizzBuzz();
        FizzBuzz test5 = new FizzBuzz();

        String pomelo1 = test4.FizzBuzz_Calculo(4);
        String pomelo2 = test5.FizzBuzz_Calculo(5);

        assertEquals("4", pomelo1);
        assertEquals("Buzz", pomelo2);
        System.out.println("Se ha ejecutado correctamente el test");
    }

    @Test
    void fizzBuzz_Calculo6() {
        FizzBuzz test6 = new FizzBuzz();

        String pomelo1 = test6.FizzBuzz_Calculo(6);

        assertEquals("Fizz", pomelo1);
        System.out.println("Se ha ejecutado correctamente el test");
    }
}