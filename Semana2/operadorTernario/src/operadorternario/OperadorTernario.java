package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
        // nota para aprobar mayor o igual a 3
        int nota = 0;
        boolean condicion = (nota >= 3);
        String respuesta;

        respuesta = (condicion) ? "Pasaste" : "No pasaste";

        System.out.println(respuesta);

        // Si es Femenino o Masculino
        String mensaje;
        char genero = 'F';

        mensaje = (genero == 'F') ? "Es femenino" : "Es masculino";
        System.out.println(mensaje);

        // Es Mayor de edad Si tiene 18 o mas "Es mayor de edad" de lo contrario "Es menor de Edad"
        int edad = 18;
        condicion = (edad >= 18);
        mensaje = (condicion) ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(mensaje);

        // Un numero sea igual a 3 de lo contrario "No es igual a 3" 
        int numero = 1;
        condicion = (numero == 3);
        mensaje = (condicion) ? "Es igual a 3" : "No es igual a 3";
        System.out.println(mensaje);
    }

}
