package circleHerencia;

public class Main {
    public static void main(String[] args) {
        
        Cylinder myCylinder = new Cylinder();

        
        System.out.println("Radius: " + myCylinder.getRadius());
        System.out.println("Color: " + myCylinder.getColor());
        System.out.println("Height: " + myCylinder.getHeight());
        System.out.println("Base area of the cylinder: " + myCylinder.calculateArea());
        System.out.println("Volume of the cylinder: " + myCylinder.calculateVolume());
    }
}