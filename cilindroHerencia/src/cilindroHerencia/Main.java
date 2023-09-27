package cilindroHerencia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radioCirculo = scanner.nextDouble();

        // Crear objetos Circulo, Cilindro y CilindroHueco
        Circulo circulo = new Circulo(radioCirculo);
        Cilindro cilindro = new Cilindro(radioCirculo, 5.0); // Altura fija de 5.0 para el cilindro
        CilindroHueco cilindroHueco = new CilindroHueco(radioCirculo + 1.0, radioCirculo, 5.0); // Altura fija de 5.0 para el cilindro hueco

        // Calcular y mostrar las longitudes de circunferencia y áreas
        System.out.println("Longitud de la circunferencia del círculo: " + circulo.calcularCircunferencia());
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del cilindro: " + cilindro.calcularVolumen());
        System.out.println("Volumen del cilindro hueco: " + cilindroHueco.calcularVolumen());

        scanner.close();
    }
}