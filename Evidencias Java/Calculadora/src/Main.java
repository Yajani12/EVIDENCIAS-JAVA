import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1;
                num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2;
                num2 = scanner.nextDouble();

        System.out.print("Seleccione la operación que desea realizar: (+, -, *, /): ");
        char operacion = scanner.next().charAt(0);

        double resultado = 0;

        switch (operacion) {
            case '+':
                resultado = num1 + num2;
                break;

            case '-':
                resultado = num1 - num2;
                break;

            case '*':
                resultado = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("Error: No se puede dividir por cero.");
                    return;
                }
                break;
            default:
                System.out.println("Operación no válida. Por favor, seleccione: +, -, *, o /.");
                return;
        }
        System.out.println("El resultado es: " + resultado);
    }
}