import java.util.Scanner;

public class roster {
    public static void main(String[] args) {
        // Solicitar los datos del usuario
        try ( // Crear un objeto Scanner para leer la entrada del usuario
                Scanner scanner = new Scanner(System.in)) {
            // Solicitar los datos del usuario
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter your last name: ");
            String lastName = scanner.nextLine();
            
            System.out.print("Enter your stature (in cm): ");
            double stature = scanner.nextDouble();
            
            System.out.print("Enter your weight (in kg): ");
            double weight = scanner.nextDouble();
            
            // Crear planes
            plan basic = new basic();
            plan medium = new medium();
            plan premium = new premium();
            
            // Crear usuario con los datos ingresados
            user userOne = new user(name, lastName, stature, weight);
            
            // Mostrar opciones de planes
            System.out.println("Seleccione un plan:");
            System.out.println("1. Básico: " + basic.getCost() + " - " + basic.getServices());
            System.out.println("2. Medio: " + medium.getCost() + " - " + medium.getServices());
            System.out.println("3. Premium: " + premium.getCost() + " - " + premium.getServices());
            
            // Selección del plan
            System.out.print("Enter your choice (1, 2, or 3): ");
            int choice = scanner.nextInt();
            
            // Asignar el plan al usuario
            switch (choice) {
                case 1 -> userOne.setPlan(basic);
                case 2 -> userOne.setPlan(medium);
                case 3 -> userOne.setPlan(premium);
                default -> System.out.println("Invalid option. No plan assigned.");
            }
            
            // Mostrar los datos del usuario
            System.out.println("\n--- User Information ---");
            System.out.println("Name: " + userOne.getName());
            System.out.println("Last Name: " + userOne.getLastName());
            System.out.println("Stature: " + userOne.getStature() + " cm");
            System.out.println("Weight: " + userOne.getWeight() + " kg");
            
            // Mostrar los datos del plan seleccionado
            if (userOne.getPlan() != null) {
                System.out.println("Plan: " + userOne.getPlan().getName());
                System.out.println("Cost: " + userOne.getPlan().getCost());
                System.out.println("Services: " + userOne.getPlan().getServices());
            } else {
                System.out.println("No plan was selected.");
            }
        }
    }
}