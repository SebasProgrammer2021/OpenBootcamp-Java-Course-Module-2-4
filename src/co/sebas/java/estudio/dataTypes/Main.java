package co.sebas.java.estudio.dataTypes;

public class Main {
    public static void main(String[] args) {
        int indicativoPais = 57;
        System.out.println("indicativoPais = " + indicativoPais);

        long añoNacimiento = 1997;
        System.out.println("añoNacimiento = " + añoNacimiento);

        double temperatura = 28.4d;
        System.out.println("temperatura = " + temperatura);

        boolean estaCorrecto = true;
        System.out.println("estaCorrecto = " + estaCorrecto);

        String numeroCelular = "3115469678";
        System.out.println("numeroCelular = " + numeroCelular);


        // enteros
        byte number1 = 1; // 1 byte
        short number2 = 10; // 2 bytes
        int number3 = 50; // 4 bytes
        long number4 = 100; // 8 bytes

        System.out.println("Numeros enteros: " + number1 + " , " + number2 + " , " + number3 + " , " + number4);

        // decimales
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        System.out.println("Decimales: " + decimal1 + " , " + decimal2);

        // cadena de texto
        String nombre = "Jose David";
        String apellido = "Prieto";

        // caracter
        char caracter1 = 'a';

        System.out.println("Cadena de texto: " + nombre + " " + apellido + "\nCaracter: " + caracter1);

        //booleanos
        boolean verdadero = true;
        boolean falso = false;


    }
}
