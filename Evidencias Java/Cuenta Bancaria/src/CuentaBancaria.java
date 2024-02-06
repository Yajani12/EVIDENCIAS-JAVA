import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;

            System.out.println("Su depósito fue exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Error: El monto del depósito debe ser mayor a cero.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Su retiro fue exitoso. Nuevo saldo: " + saldo);
        } else if (monto <= 0) {
            System.out.println("Error: El monto del retiro debe ser mayor a cero.");
        } else {
            System.out.println("Error: Ustedno posee el saldo suficiente,para realizar el retiro.");
        }
    }

    public void ConsultarSaldo() {
        System.out.println("Su saldo actual es: " + saldo);
    }

    public class SistemaBancario {
        private static Map<String, CuentaBancaria> cuentas = new HashMap<>();
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            while (true) {
                System.out.println("\n--- Sistema Bancario ---");
                System.out.println("1. Crear cuenta");
                System.out.println("2. Acceder a la cuenta");
                System.out.println("3. Salir");
                System.out.println("Seleeciona una opción: ");

                int opcion = scanner.nextInt();
                scanner.nextLine(); // Consumir la nueva línea después de leer el número

                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese el nombre del titular de la cuenta: ");
                        String titular = scanner.nextLine();
                        crearCuenta(titular);
                        break;

                    case 2:
                        System.out.print("Ingrese el nombre del titular de la cuenta: ");
                        String titularCuenta = scanner.nextLine();
                        accederCuenta(titularCuenta);
                        break;

                    case 3:
                        System.out.println("Saliendo del sistema bancario. ¡Vuelva pronto!");
                        System.exit(0);

                    default:
                        System.out.println("Opción no válida. Intente nuevamente.");
                        break;
                }
            }
        }

        private static void crearCuenta(String titular) {
            CuentaBancaria cuenta = new CuentaBancaria(titular);
            cuentas.put(titular, cuenta);
            System.out.println("Cuenta creada con éxito para " + titular);
        }

        private static void accederCuenta(String titular) {
            CuentaBancaria cuenta = cuentas.get(titular);
            if (cuenta != null) {
                while (true) {
                    System.out.println("\n--- Cuenta de " + titular + " ---");
                    System.out.println("1. Realizar depósito");
                    System.out.println("2. Realizar retiro");
                    System.out.println("3. Consultar saldo");
                    System.out.println("4. Volver al menú principal");
                    System.out.println("Selecciona una opción: ");

                    int opcion = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea después de leer el número

                    switch (opcion) {
                        case 1:
                            System.out.print("Ingrese el monto del depósito: ");
                            double montoDeposito = scanner.nextDouble();
                            cuenta.depositar(montoDeposito);
                            break;

                        case 2:
                            System.out.print("Ingrese el monto dl retiro: ");
                            double montoRetiro = scanner.nextDouble();
                            cuenta.retirar(montoRetiro);
                            break;

                        case 3:
                            cuenta.ConsultarSaldo();
                            break;

                        case 4:
                            System.out.println("Volviendo al menú principal.");
                            return;

                        default:
                            System.out.println("Opción no válida. Inténtalo de nuevo.");
                            break;

                    }
                }
            } else {
                System.out.println("No se encontró ninguna cuenta para  " + titular);
            }
        }
    }
}