import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo para calcular su factorial: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser un entero positivo.");
        } else {
            long factorial = calcularFactorial(numero);
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }

    // Método para calcular el factorial utilizando un bucle
    private static long calcularFactorial(int numero) {
        long factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        return factorial;
    }
}