package co.sebas.java.estudio.controlStructures.cicles;

public class EjercicioModulo3 {
    public static void main(String[] args) {
        String[] nombres = {"Daniela", "Stefany", "Lorena", "Jenifer", "Carolina", "Valentina"};
        String message = "";

        for (int i = 0; i < nombres.length; i++) {
            message += nombres[i] + " ";
        }
        System.out.println(message);
    }
}
