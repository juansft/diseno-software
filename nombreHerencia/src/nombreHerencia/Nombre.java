package nombreHerencia;

import java.util.Scanner;

class Nombre {
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public Nombre() {
        
    }

    public void leerNombre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = scanner.nextLine();
        System.out.print("Ingrese el primer apellido: ");
        primerApellido = scanner.nextLine();
        System.out.print("Ingrese el segundo apellido: ");
        segundoApellido = scanner.nextLine();
    }

    public void mostrar() {
        System.out.println("Nombre completo: " + nombre + " " + primerApellido + " " + segundoApellido);
    }
}

class Direccion extends Nombre {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;

    public Direccion() {
        
    }

    public void nuevaDireccion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la calle: ");
        calle = scanner.nextLine();
        System.out.print("Ingrese la ciudad: ");
        ciudad = scanner.nextLine();
        System.out.print("Ingrese la provincia: ");
        provincia = scanner.nextLine();
        System.out.print("Ingrese el código postal: ");
        codigoPostal = scanner.nextLine();
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Dirección: " + calle + ", " + ciudad + ", " + provincia + ", " + codigoPostal);
    }

    public void nuevoNombre() {
        super.leerNombre();
    }
}

