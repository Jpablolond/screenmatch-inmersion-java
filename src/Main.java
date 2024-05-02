import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Bienvenido a la inmersión en Java");
            int fechaDeLanzamiento = 1999;
            double evaluacion = 4.5;
            boolean incluidoEnElPlanBasico = true;
            String nombre = "Matrix";
            String sinopsis = """
                    La mejor película del fin del milenio
                    """;
            double mediaEvaluacionUsuario = 0;

            System.out.println("Película: " + nombre);
            System.out.println(fechaDeLanzamiento);
            System.out.println(evaluacion);
            System.out.println(incluidoEnElPlanBasico);

            double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
            System.out.println("Media de la evaluación de Matrix: " + mediaEvaluacion);

            if (fechaDeLanzamiento > 2023) {
                System.out.println("Película Popular en el momento");
            } else {
                System.out.println("Película Retro que vale la pena ver");
            }

            Scanner teclado = new Scanner(System.in);
            for (int j = 0; j < 3; j++) {
                System.out.println("Ingresa la nota que le darías a Matrix");
                // Verifica si la entrada es un double antes de intentar convertirla
                while (!teclado.hasNextDouble()) {
                    System.out.println("Por favor, ingresa un número válido.");
                    teclado.next(); // Limpiar el búfer de entrada
                }
                double notaMatrix = teclado.nextDouble();
                mediaEvaluacionUsuario += notaMatrix;
            }
            System.out.println("La media de la película Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
        }
    }
}