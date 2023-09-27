package personHerencia;

public class Main {
    public static void main(String[] args) {
        
        Student student = new Student("Juan", "123 Main St", "Computer Science", 2023, 10000.0);

      
        Staff staff = new Staff("Maria", "456 Elm St", "High School", 50000.0);

        
        System.out.println("Información del estudiante:");
        System.out.println("Nombre: " + student.getName());
        System.out.println("Dirección: " + student.getAddress());
        System.out.println("Programa: " + student.getProgram());
        System.out.println("Año: " + student.getYear());
        System.out.println("Cuota: " + student.getFee());

        
        System.out.println("\nInformación del personal:");
        System.out.println("Nombre: " + staff.getName());
        System.out.println("Dirección: " + staff.getAddress());
        System.out.println("Escuela: " + staff.getSchool());
        System.out.println("Salario: " + staff.getPay());
    }
}
