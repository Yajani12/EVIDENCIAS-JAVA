public class Estudiante {
    private String nombre;
    private int edad;
    private double[] calificaciones;

    // Constructor
    public Estudiante(String nombre, int edad, double[] calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    // Método para calcular el promedio de calificaciones
    public double calcularPromedio() {
        if (calificaciones.length == 0) {
            return 0.0;
        }

        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }

    // Método para mostrar la información del estudiante
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificaciones:");
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio de calificaciones: " + calcularPromedio());
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        String nombre = "Juan";
        int edad = 20;
        double[] calificaciones = {85.5, 90.0, 78.3, 92.5};

        Estudiante estudiante = new Estudiante(nombre, edad, calificaciones);
        estudiante.mostrarInformacion();
    }
}
