import java.util.Scanner;

public class roster {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Select a Newton's Law:");
            System.out.println("1. First Law (Inertia)");
            System.out.println("2. Second Law (F = m * a)");
            System.out.println("3. Third Law (Action and Reaction)");

            int option = sc.nextInt();
            NewtonLaw law;

            switch (option) {
                case 1 -> law = new FirstLaw();
                case 2 -> law = new SecondLaw();
                case 3 -> law = new ThirdLaw();
                default -> {
                    System.out.println("Invalid option.");
                    return;
                }
            }

            law.explain();
            law.calculate();
        }
    }
}

abstract class NewtonLaw {
    public abstract void explain();
    public abstract void calculate();
}

class FirstLaw extends NewtonLaw {
    @Override
    public void explain() {
        System.out.println("First Law: An object at rest stays at rest, and an object in motion stays in motion unless acted upon by an external force.");
    }

    @Override
    public void calculate() {
        System.out.println("No calculation needed for the First Law.");
    }
}

class SecondLaw extends NewtonLaw {
    @Override
    public void explain() {
        System.out.println("Second Law: The force acting on an object is equal to the mass of that object multiplied by its acceleration (F = m * a).");
    }

    @Override
    public void calculate() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter mass (kg): ");
            double mass = sc.nextDouble();
            System.out.print("Enter acceleration (m/s^2): ");
            double acceleration = sc.nextDouble();
            double force = mass * acceleration;
            System.out.println("Force: " + force + " N");
        }
    }
}

class ThirdLaw extends NewtonLaw {
    @Override
    public void explain() {
        System.out.println("Third Law: For every action, there is an equal and opposite reaction.");
    }

    @Override
    public void calculate() {
        System.out.println("No calculation needed for the Third Law.");
    }
}