public class OperacionesTDD {

    public static int Sumas (String tomate) {

    int suma = 0;

    String[] Array = tomate.split(",");
    for (String Separador : Array) {
        if (Integer.parseInt(Separador) < 0) {
            System.out.println("Este número no se permite.");
            return -1;
        }
    }

    return suma;
    }
}