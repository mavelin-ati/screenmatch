import java.security.KeyStore;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión Java, bienvenidos!");
        //System.out.println("Película Matrix");

        // Declaración de variables
        int fechaLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoPlanBasico = true;

        String nombre = "Matrix";
        String sinopsis = """
                La mejor película del fin de milenio
                el final es interesante
                """;
        double mediaEvaluacionUsuario = 0;
        int numeroUsuario = 3;

        System.out.println("Película: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Incluído en el Plan Básico: " + incluidoPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3.0) / 3;
        System.out.println("Maedia de la Evaluación: " + mediaEvaluacion);

        if (fechaLanzamiento > 2023) {
            System.out.println("Película popular en el momento");
        } else {
            System.out.println("Película retro que vale la pena ver");
        }

        for (int i = 0; i < numeroUsuario; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la evaluación de Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la puntuación de la película Matrix es: " + mediaEvaluacionUsuario / numeroUsuario);
    }
}