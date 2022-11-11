package co.sebas.java.estudio.functions;

/**
 * @author Sebastián Londoño
 * @description La sobrecarga de fuciones es duplicar un metodo con diferentes params
 */
public class SobreCarga {
    public static void main(String[] args) {
    }

    private static int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    private static int suma(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }
}
