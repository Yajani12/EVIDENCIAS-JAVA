import java.util.Scanner;

public class OrdenNumeros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de elementos de la lista: ");
        int n = scanner.nextInt();

        int[] listaNumeros = new int[n];

        // Ingresar los números en la lista
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            listaNumeros[i] = scanner.nextInt();
        }

        // Ordenar la lista de números de menor a mayor
        ordenar(listaNumeros);

        // Mostrar la lista ordenada
        System.out.println("Lista ordenada de menor a mayor:");
        for (int numero : listaNumeros) {
            System.out.print(numero + " ");
        }
    }

    // Método para ordenar una lista de números de menor a mayor usando el algoritmo de ordenamiento de burbuja
    private static void ordenar(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}

