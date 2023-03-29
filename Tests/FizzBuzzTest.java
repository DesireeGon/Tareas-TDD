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

    @Test
    void fizzBuzz_Calculo7() {
        FizzBuzz test6 = new FizzBuzz();
        FizzBuzz test7 = new FizzBuzz();
        FizzBuzz test8 = new FizzBuzz();


        String pomelo1 = test6.FizzBuzz_Calculo(7);
        String pomelo2 = test7.FizzBuzz_Calculo(8);
        String pomelo3 = test8.FizzBuzz_Calculo(9);

        assertEquals("7", pomelo1);
        assertEquals("8", pomelo2);
        assertEquals("Fizz", pomelo3);
        System.out.println("Se ha ejecutado correctamente el test");
    }

    @Test
    void fizzBuzz_Calculo10() {
        FizzBuzz test10 = new FizzBuzz();

        String pomelo1 = test10.FizzBuzz_Calculo(10);

        assertEquals("Buzz", pomelo1);
        System.out.println("Se ha ejecutado correctamente el test");
    }

    @Test
    void fizzBuzz_Calculo11() {
        FizzBuzz test11 = new FizzBuzz();
        FizzBuzz test12 = new FizzBuzz();
        FizzBuzz test13 = new FizzBuzz();
        FizzBuzz test14 = new FizzBuzz();


        String pomelo1 = test11.FizzBuzz_Calculo(11);
        String pomelo2 = test12.FizzBuzz_Calculo(12);
        String pomelo3 = test13.FizzBuzz_Calculo(13);
        String pomelo4 = test14.FizzBuzz_Calculo(14);


        assertEquals("11", pomelo1);
        assertEquals("Fizz", pomelo2);
        assertEquals("13", pomelo3);
        assertEquals("14", pomelo4);
        System.out.println("Se ha ejecutado correctamente el test");
    }

    @Test
    void fizzBuzz_Calculo15() {
        FizzBuzz test15 = new FizzBuzz();

        String pomelo1 = test15.FizzBuzz_Calculo(15);

        assertEquals("FizzBuzz", pomelo1);
        System.out.println("Se ha ejecutado correctamente el test");
    }
}