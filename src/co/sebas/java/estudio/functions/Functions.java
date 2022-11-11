package co.sebas.java.estudio.functions;

public class Functions {
    public static void main(String[] args) {


        //opcion 1: func sin params y sin return
//        showMenu();
//        showMenu();

        //opcion 2: func sin params pero con tipo retorno
        String response = getMenu();
        System.out.println("response = " + response);
        System.out.println("getMenu() = " + getMenu());

        //opcion 3: fucn con params pero sin retorno
        printGreeting("Sebastián");

//        opcion 4: func con params y con retorno
        String greeting = getGreeting("Daniela", "Mejia");
        System.out.println(greeting);

        int resultadoSuma = suma(50, 200);
        System.out.println("\nresultadoSuma = " + resultadoSuma);

        Double obtenerPrecioConIva = getPrice(12300.06);
        System.out.println("\nobtenerPrecioConIva = " + obtenerPrecioConIva);
    }

    private static Double getPrice(double precio) {
        double ivaCalculado = precio * 0.19;
        return ivaCalculado + precio;
    }

    private static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    private static String getGreeting(String nombre, String apellido) {
        System.out.println("\n Opcion 4");
        return "Buenos días " + nombre + " " + apellido;
    }

    static void printGreeting(String message) {
        System.out.println("\n Opcion 3");
        System.out.println("Buenos días " + message);
    }

    /**
     * void indica que no devuelve nada
     */
    static void showMenu() {
        System.out.println("Functions.showMenu");
    }

    static String getMenu() {
        return "Bienvenido al tipo de func 2";
    }
}
