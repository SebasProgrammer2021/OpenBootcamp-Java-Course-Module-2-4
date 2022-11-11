package co.sebas.java.estudio.controlStructures.cicles;

public class ForEach {
    public static void main(String[] args) {
        String[] nombres = {"Daniela", "Stefany", "Lorena", "Jenifer"};

//       forEach
        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        }

        Integer[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }
    }
}
