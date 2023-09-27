package circleHerencia;

class Circle {
    
    protected double radius;
    protected String color;

    
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    
    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}


class Cylinder extends Circle {
    
    private double height;

    
    public Cylinder() {
        super(); 
        this.height = 1.0;
    }

    
    public Cylinder(double radius, String color, double height) {
        super(radius, color); 
        this.height = height;
    }

    
    public double getHeight() {
        return height;
    }

    
    public double calculateVolume() {
        return calculateArea() * height;
    }
}

