package co.sebas.java.estudio.controlStructures.conditionals;

public class IfElseIf {
    public static void main(String[] args) {

        String dia = "Martes";

        if(dia.equals("Lunes")){
            System.out.println("Animo empieza la semana");
        }else if(dia.equals("Martes")){
            System.out.println("Martes ya va a arrancando");
        }
    }
}
