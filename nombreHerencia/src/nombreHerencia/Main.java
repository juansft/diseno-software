package nombreHerencia;

public class Main {
    public static void main(String[] args) {
        Direccion direccion = new Direccion();

        System.out.println("Ingrese los datos de la dirección:");
        direccion.nuevaDireccion();

        System.out.println("\nIngrese los datos del nombre:");
        direccion.nuevoNombre();

        System.out.println("\nInformación completa:");
        direccion.mostrar();
    }
}
