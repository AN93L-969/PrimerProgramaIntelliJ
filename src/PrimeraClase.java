import jdk.jshell.SourceCodeAnalysis;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class PrimeraClase {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("¡Bienvenido(a) a Screen Match! \n");

        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;

        System.out.printf(String.valueOf(media));

        String sinopsis = """
                \nMatrix es una paradoja
                La mejorr película del fin del milenio
                Fue lanzada en: 
                """ + fechaDeLanzamiento;

        System.out.println(sinopsis);

        int clasificacion = (int) media / 2;

        System.out.println(clasificacion);



        //Desafío: conversión de temperaturas
        /*
        int tempCelsius = 25;
        double tempFahrenheit = (tempCelsius * 1.8) + 32;
        int tempFahrenheitSinDecimal = (int) tempFahrenheit;

        System.out.println("La temperatura de " + tempCelsius + " grados Celsius convertida a Fahrenheit es: " + tempFahrenheit);
        System.out.println("La temperatura en grados Fahrenheit sin decimales sería " + tempFahrenheitSinDecimal);
         */

        //Desafío: Juego de adivinanza
        /*
        Scanner teclado = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int intento = 0;
        int contador = 0;

        System.out.println("Adivine el número del 1 al 100:");

        for (int i = 0; i < 5; i++){
            System.out.println("Intento número (" + (i+1) + ") Ingrese un digito del 1 al 100:");
            intento = teclado.nextInt();

            if (intento < numeroAleatorio) {
                System.out.println("El número secreto es mayor que " + intento);
            }else if (intento > numeroAleatorio) {
                System.out.println("El número secreto es menor que " + intento);
            }else if (intento == numeroAleatorio) {
                System.out.println("Felicidades, adivinaste el número secreto el cuál era: " + intento);
                break;
            }

            if (i == 4) {
                System.out.println("Lo siento, no acertaste el número secreto, intentalo de nuevo.");
            }
        }
        */
    }
}