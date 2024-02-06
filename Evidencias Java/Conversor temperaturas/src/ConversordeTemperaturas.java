import java.util.Scanner;

public class ConversordeTemperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature = 0.0;
        String unit = "";

        System.out.println("Convertir temperatura");
         System.out.println("--------------------");

         System.out.print("Ingresa la unidad a convertir (Celsius o Fahrenheit): ");
         temperature = scanner.nextDouble();

         System.out.print("Ingresa la unidad por la cual quieres convertir");
         unit = scanner.next();

         System.out.println("Temperatura convertida: " + convertTemperature(temperature, unit));

         scanner.close();
    }

    private static double convertTemperature(double temperature, String unit) {
        if ("Celsius".equalsIgnoreCase(unit)) {
            return (temperature * 9 / 5) + 32;
        } else if ("Fahrenheit". equalsIgnoreCase(unit)) {
            return (temperature - 32) * 5 / 9;
        } else {
            throw new IllegalArgumentException("Unidad inválida");
        }
    }
}