package publicacionHerencia;

import java.util.Scanner;

class Publicacion {
    protected String titulo;
    protected float precio;

    public void leerDatos() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el título: ");
        titulo = scanner.nextLine();
        System.out.print("Ingrese el precio: ");
        precio = scanner.nextFloat();
    }

    public void mostrar() {
        System.out.println("Título: " + titulo);
        System.out.println("Precio: " + precio);
    }
}

class Libro extends Publicacion {
    private int numPaginas;
    private int anoPublicacion;

    @Override
    public void leerDatos() {
        super.leerDatos();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de páginas: ");
        numPaginas = scanner.nextInt();
        System.out.print("Ingrese el año de publicación: ");
        anoPublicacion = scanner.nextInt();
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Número de páginas: " + numPaginas);
        System.out.println("Año de publicación: " + anoPublicacion);
    }
}

class Disco extends Publicacion {
    private float duracionMinutos;

    @Override
    public void leerDatos() {
        super.leerDatos();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la duración en minutos: ");
        duracionMinutos = scanner.nextFloat();
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Duración en minutos: " + duracionMinutos);
    }
}

