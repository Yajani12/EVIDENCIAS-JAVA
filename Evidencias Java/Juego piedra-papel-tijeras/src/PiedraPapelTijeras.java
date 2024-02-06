import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijeras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido al juego de Piedra, Papel o Tijeras!");

        while (true) {
            System.out.print("\nElige tu jugada (piedra, papel, tijeras, o salir): ");
            String jugadaUsuario = scanner.nextLine().toLowerCase();

            if (jugadaUsuario.equals("salir")) {
                System.out.println("¡Gracias por jugar! ¡Hasta luego!");
                break;
            }

            if (!jugadaUsuario.equals("piedra") && !jugadaUsuario.equals("papel") && !jugadaUsuario.equals("tijeras")) {
                System.out.println("Jugada no válida. Por favor, elige piedra, papel o tijeras.");
                continue;
            }

            int jugadaComputadora = random.nextInt(3); // 0 para piedra, 1 para papel, 2 para tijeras

            String jugadaComputadoraString;
            switch (jugadaComputadora) {
                case 0:
                    jugadaComputadoraString = "piedra";
                    break;
                case 1:
                    jugadaComputadoraString = "papel";
                    break;
                case 2:
                    jugadaComputadoraString = "tijeras";
                    break;
                default:
                    jugadaComputadoraString = "error";
            }

            System.out.println("La computadora elige: " + jugadaComputadoraString);

            // Determinar el resultado del juego
            if (jugadaUsuario.equals(jugadaComputadoraString)) {
                System.out.println("¡Empataron!");
            } else if ((jugadaUsuario.equals("piedra") && jugadaComputadoraString.equals("tijeras"))
                    || (jugadaUsuario.equals("papel") && jugadaComputadoraString.equals("piedra"))
                    || (jugadaUsuario.equals("tijeras") && jugadaComputadoraString.equals("papel"))) {
                System.out.println("¡Ganaste! Wuuuuuu");
            } else {
                System.out.println("¡La computadora gana!");
            }
        }

        scanner.close();
    }
}
