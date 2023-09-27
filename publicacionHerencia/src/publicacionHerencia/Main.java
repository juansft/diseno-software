package publicacionHerencia;

public class Main {
    public static void main(String[] args) {
        Libro libro = new Libro();
        Disco disco = new Disco();

        System.out.println("Ingrese los datos del libro:");
        libro.leerDatos();

        System.out.println("\nIngrese los datos del disco:");
        disco.leerDatos();

        System.out.println("\nDatos del libro:");
        libro.mostrar();

        System.out.println("\nDatos del disco:");
        disco.mostrar();
    }
}
