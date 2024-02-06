import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        int intentos = 0;
        int suposicion;

        System.out.println("¡Bienvenido al juego de adivinanzas!");
        System.out.println("Intenta adivinar un número entre 1 y 100.");

        do {
            System.out.print("Ingresa tu suposición: ");
            suposicion = scanner.nextInt();
            intentos++;

            if (suposicion < numeroAleatorio) {
                System.out.println("El número es mayor.");
            } else if (suposicion > numeroAleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! ¡Has adivinado el número en " + intentos + " intentos!");
            }
        } while (suposicion != numeroAleatorio);

        scanner.close();
    }
}