package cilindroHerencia;

import java.util.Scanner;

class Circulo {
    // Atributos
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para obtener el radio
    public double getRadio() {
        return radio;
    }

    // Método para calcular el área del círculo
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    // Método para calcular la longitud de la circunferencia
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
}

// Clase Cilindro que hereda de Circulo
class Cilindro extends Circulo {
    // Atributo adicional
    protected double altura;

    // Constructor
    public Cilindro(double radio, double altura) {
        super(radio); // Llama al constructor de la clase base
        this.altura = altura;
    }

    // Método para calcular el volumen del cilindro
    public double calcularVolumen() {
        return super.calcularArea() * altura;
    }
}

// Clase CilindroHueco que hereda de Cilindro
class CilindroHueco extends Cilindro {
    // Atributo adicional
    private double radioInterior;

    // Constructor
    public CilindroHueco(double radioExterior, double radioInterior, double altura) {
        super(radioExterior, altura);
        this.radioInterior = radioInterior;
    }

    // Método para calcular el volumen del cilindro hueco restando el volumen del cilindro interior
    public double calcularVolumen() {
        double volumenExterior = super.calcularVolumen();
        double volumenInterior = Math.PI * radioInterior * radioInterior * altura;
        return volumenExterior - volumenInterior;
    }
}