import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos Inmersión Java!");
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

        Scanner teclado = new Scanner(System.in);
        double notaMatrix = 0;
        int numeroUsuario = 3;
        int iterador = 0;

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
            System.out.println("Ingresa la evaluación de Matrix: ");
            notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("La media de la puntuación de la película Matrix es: " + mediaEvaluacionUsuario / numeroUsuario);
        mediaEvaluacionUsuario = 0;

        while (iterador < numeroUsuario) {
            System.out.println("Ingresa la nueva evaluación de Matrix: ");
            notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
            iterador++;
        }
        System.out.println("La media de la nueva puntuación de la película Matrix es: " + mediaEvaluacionUsuario / numeroUsuario);
    }
}