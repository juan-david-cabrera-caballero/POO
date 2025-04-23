import java.util.Scanner;

class secondLaw extends law {
    private String mass;
    private String acceleration;
    private String force;

    public secondLaw() {
        super("Second Law of Motion");
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(String acceleration) {
        this.acceleration = acceleration;
    }

    public String getForce() {
        return force;
    }

    public void setForce(String force) {
        this.force = force;
    }



    public void explain() {
        System.out.println("2nd Law: F = m * a (force equals mass times acceleration).");
    }

   
    @Override
    public void calculate() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the mass (kg): ");
            double inputMass = sc.nextDouble();
            System.out.print("Enter the acceleration (m/s^2): ");
            double inputAcceleration = sc.nextDouble();
            double calculatedForce = inputMass * inputAcceleration;
            System.out.println("The force is: " + calculatedForce + " N");
        }
    }
}