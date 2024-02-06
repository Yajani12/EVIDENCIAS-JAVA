import java.util.ArrayList;
import java.util.Scanner;

public class Listadecompras {

    public static void main(String[] args) {
        ArrayList<String> listaDeCompras = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Lista de Compras ---");
            System.out.println("1: Agregar elemento");
            System.out.println("2: Mostrar lista");
            System.out.println("3: Eliminar elemento");
            System.out.println("4: Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea después de leer el número

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el elemento a agregar: ");
                    String nuevoElemento = scanner.nextLine();
                    listaDeCompras.add(nuevoElemento);
                    System.out.println("Elemento agregado a la lista.");
                    break;

                case 2:
                    System.out.println("\nLista de Compras:");
                    for (int i = 0; i < listaDeCompras.size(); i++) {
                        System.out.println((i + 1) + ". " + listaDeCompras.get(i));
                    }
                    break;

                case 3:
                    System.out.print("Ingrese el número del elemento a eliminar: ");
                    int indiceEliminar = scanner.nextInt();
                    if (indiceEliminar >= 1 && indiceEliminar <= listaDeCompras.size()) {
                        listaDeCompras.remove(indiceEliminar - 1);
                        System.out.println("Elemento eliminado de la lista.");
                    } else {
                        System.out.println("Índice no válido. Intente de nuevo.");
                    }
                    break;

                case 4:
                    System.out.println("Saliendo del programa. ¡Vuelva pronto!");
                    System.exit(0);

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
    }
}