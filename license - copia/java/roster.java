import java.util.Scanner;

public class roster {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Solicitar los datos del estudiante
            System.out.print("Enter the student's name: ");
            String studentName = sc.nextLine();

            System.out.print("Enter the student's last name: ");
            String lastName = sc.nextLine();

            System.out.print("Enter the student's identification: ");
            String identification = sc.nextLine();

            System.out.print("Enter the student's direction: ");
            String direction = sc.nextLine();

            System.out.print("Enter the student's phone: ");
            String phone = sc.nextLine();

            System.out.print("Enter the student's RH: ");
            String rh = sc.nextLine();

            // Mostrar las opciones de licencias
            System.out.println("Select a license:");
            System.out.println("1. License A - $1,000,000 COP");
            System.out.println("2. License B - $1,500,000 COP");
            System.out.println("3. License C - $2,000,000 COP");

            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = sc.nextInt();

            // Crear la licencia seleccionada
            license selectedLicense;
            selectedLicense = switch (choice) {
                case 1 -> new licenseA();
                case 2 -> new licenseB();
                case 3 -> new licenseC();
                default -> {
                    System.out.println("Invalid choice. Exiting program.");
                    yield null;
                }
            };

            if (selectedLicense == null) {
                return;
            }

            // Crear el objeto estudiante
            student student = new student(studentName, lastName,
                    identification, direction, phone, rh, selectedLicense);

            // Mostrar los datos del estudiante registrado
            System.out.println("\n--- Estudiante Registrado ---");
            System.out.println("Nombre: " + student.getName());
            System.out.println("Apellido: " + student.getLastName());
            System.out.println("Identificación: " + student.getIdentification());
            System.out.println("Dirección: " + student.getDirection());
            System.out.println("Teléfono: " + student.getPhone());
            System.out.println("RH: " + student.getRh());
            System.out.println("Licencia: " + selectedLicense.getName());
            System.out.println("Duración: " + selectedLicense.getDuration());
            System.out.println("Costo: $" + selectedLicense.getCost());
        }
    }
}