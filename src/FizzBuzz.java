public class FizzBuzz {
    public String FizzBuzz_Calculo (int pomelo) {

    String FizzBuzz;
        if (pomelo %3 == 0) {
            FizzBuzz = "Fizz";
        } else if (pomelo %5 == 0) {
            FizzBuzz = "Buzz";
        } else {
            String platano = String.valueOf(pomelo);
            return platano;
        }
        return FizzBuzz;
    }
}