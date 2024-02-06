import java.util.Scanner;

public class Cadenas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String cadenaTexto = scanner.nextLine();

        // Muestra la longitud de la cadena
        int longitud = cadenaTexto.length();
        System.out.println("Longitud de la cadena: " + longitud);

        // Convierte la cadena a mayúsculas
        String mayusculas = cadenaTexto.toUpperCase();
        System.out.println("Cadena en mayúsculas: " + mayusculas);

        // Convierte la cadena a minúsculas
        String minusculas = cadenaTexto.toLowerCase();
        System.out.println("Cadena en minúsculas: " + minusculas);

        // Verifica si la cadena contiene la palabra "Java"
        boolean contieneJava = cadenaTexto.toLowerCase().contains("java");
        if (contieneJava) {
            System.out.println("La cadena contiene la palabra 'Java'.");
        } else {
            System.out.println("La cadena no contiene la palabra 'Java'.");
        }
    }
}
